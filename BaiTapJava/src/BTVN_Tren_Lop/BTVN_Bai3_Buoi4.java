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
public class BTVN_Bai3_Buoi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Nhap thang");
            i = sc.nextInt();
              System.out.println("Nhap nam");
                    int nam ;
                        nam = sc.nextInt();
            switch(i) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("Thang " +i + "co 31 ngay");
                    break;
                case 2:
                  
                    if(nam%400==0 ||(nam%4==0&nam%100!=0)) {
                        System.out.println("Thang " +i+" co 29 ngay");
            }
                    else {
                        System.out.println("Thang " +i+" co 28 ngay");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("Thang " +i+" co 30 ngay");
                    break;
                case 0:
                default:
                    System.out.println("Moi ban nhap lai");
                    break;
                    
            }
        } while(i!=0);
    }
}
