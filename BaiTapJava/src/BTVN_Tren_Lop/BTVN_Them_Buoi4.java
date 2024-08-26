/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Tren_Lop;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class BTVN_Them_Buoi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay, thang ,nam");
        int ngay, thang, nam;
        ngay = sc.nextInt();
        thang = sc.nextInt();
        nam = sc.nextInt();
        // Tháng 1,3,5,7,8,10,12
        /* Ngày(2-30)
           Ngày 1=> Ngày hôm trc là 
           Ngày 31 => Ngày hôm sau
           Ngày 1/1=> Ngày hôm trc là 31/12/(năm -1)
           Ngày 1/3=> Ngày hôm trc là 28/2 hoặc 29/2
           Ngày 31/12 => Ngày hôm sau là 1/1/(năm+1)
        // Tháng 4,6,9,11
           Ngày (2-29)
           Ngày 1
           Ngày 30
        // Tháng 2
           Năm ko nhuận: 28 ngày => Ngày 1
                                    Ngày 28
                                    Ngày(2-27)
           Năm nhuận : 29 ngày  => Ngày(2-28)
                                   Ngày 1
                                   Ngày 29
        
        */
       
            switch (thang){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if(ngay>=2&ngay<=30){
                        System.out.println("Ngay hom truoc la:" +(ngay-1) +" va ngay hom sau la:"+(ngay+1));
                    } else if(ngay==1 & thang !=3 & thang !=1) {
                        System.out.println("Ngay hom truoc la: 30 cua thang: " + (thang-1) +" va ngay hom sau la:2");
                    } else if(ngay==31 & thang!=12) {
                        System.out.println("Ngay hom truoc la: 30 va ngay hom sau la: 1" + (thang+1));
                    } else if(ngay==1 & thang == 3) {
                        if(nam%400 == 0 ||(nam%4== 0 & nam %100 != 0)) {
                            System.out.println("Ngay hom truoc la 29 thang 2 va ngay hom sau la: 2" );
                        } else {
                            System.out.println("Ngay hom truoc la 28 thang 2 va ngay hom sau la: 2");
                        }
                    } else if(ngay == 1& thang ==1) {
                        System.out.println("Ngay hom truoc la:31 thang 12 nam "+(nam-1) +" va ngay hom sau la:2 thang 1");
                    } else if(ngay == 31 &thang == 12 ){
                        System.out.println("Ngay hom truoc la: 30 thang 12 va ngay hom sau la: 1 thang 1 nam "+(nam+1));
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if ( ngay>=2 & ngay<=29){
                        System.out.println("Ngay hom truoc la: "+(ngay-1) +"va ngay hom sau la: "+(ngay+1));
                    } else if(ngay == 1 ){
                        System.out.println("Ngay hom truoc la 31 thang "+ (thang-1)+" va ngay hom sau la 2 thang "+(thang));
                    } else if(ngay ==31) {
                        System.out.println("Ngay hom truoc la 30 thang "+ (thang) +"va ngay hom sau la 1 thang "+(thang+1));
                    }
                    break;
                case 2:
                    if(ngay ==1 ) {
                            System.out.println("Ngay hom truoc la 31 thang 1 va ngay hom sau la ngay 2 thang 2 ");}
                    if(nam %400==0 || (nam%4==0& nam%100!=0)) {
                        if(ngay >=2 &&ngay<=28) {
                            System.out.println("Ngay hom truoc la ngay "+(ngay-1) +" va ngay hom sau la ngay "+(ngay+1));
                        } else if(ngay ==29 ){
                            System.out.println("Ngay hom truoc la ngay 28 thang 1 va ngay hom sau la ngay 1 thang 3");
                        } 
                        
                    } else {
                         if(ngay >=2 &&ngay<=27) {
                            System.out.println("Ngay hom truoc la ngay "+(ngay-1) +" va ngay hom sau la ngay "+(ngay+1));
                    } else if(ngay ==28){
                            System.out.println("Ngay hom truoc la ngay 27 thang 1 va ngay hom sau la ngay 1 thang 3");
                        } }
                    break;
               
            }
                
        
        }
    }

