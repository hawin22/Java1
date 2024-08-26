/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi4_Java;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class B1_Vong_Lap {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //PHẦN 1: FOR     
       // for tab
       // for ( Khởi tạo; ĐK;bước nhảy)
        for (int i = 0; i < 10; i++) {
           if(i==6) {
               System.out.println("Thuong em");
               //break; //( Thoát khỏi vòng lặp)
                //return ;(Thoát cả hàm bên trên)(Main)
                continue; // (Chỉ bỏ qua code sau vòng lặp => Vẫn nhảy tiếp vòng sau
        
           }
         System.out.println("Xin loi");
    } System.out.println("Yeu em");
        for (int i = 10; i > 0; i--) {
            System.out.println(i+". Co Huyen");
     }
//     //PHẦN 2: WHILE
//            int n = 0 ;
//            while (n<15) {
//                System.out.println(n+".Co Huyen hien nhat BM");
//                n++;
//            
//        }
     //PHẦN 3: DO-WHILE    
//     int tuoi;
//     
//     do{
//         System.out.println("Nhap tuoi:");
//         tuoi = Integer.parseInt(sc.nextLine());
//         if(tuoi>=18 && tuoi<=40){
//             System.out.println("Cuoi nhanh keo e");
//             //break;
//             return ;
//         } System.out.println("Moi nhap lai tuoi tu 18 den 40");       
//     } while (tuoi < 18 || tuoi>40) ;
}}
