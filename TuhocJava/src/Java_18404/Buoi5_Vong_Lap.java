/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_18404;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Buoi5_Vong_Lap {
    public static void main(String[] args) {
        // Cấu trúc while
        
//        int i = 0 ;
//        
//        while(i<10){
//            System.out.println("To tinh lan:"+i);
//        System.out.println("Yeu di dung so");
//        i++;
//    } 
//        System.out.println("OK");
       
       /*     Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            int tong = 0;
            int i = 0;
            while(i<=n){
               tong += i;
               i++;}
            System.out.println("Tong= "+tong);*/
            
            // Cấu trúc Do-While
     
        /*    int i = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap n:");
            int n  ;
            
           int tong = 0;
          do {
              n= sc.nextInt();
            if(n<0){
                System.out.println("Nhap lai:");
            }
        } while (n<=0);
           do {
              
                tong+=i;
                i++;
                
                                
        } while (i<=n);
         System.out.println("tong:"+tong);
         */
        Scanner sc = new Scanner(System.in);
        int n ;
        int tong = 0;
         do {
              n= sc.nextInt();
            if(n<0){
                System.out.println("Nhap lai:");
            }
        } while(n<=0);
         for (int i = 0; i < n; i++) {
            tong+=i;
           
        }
         System.out.println("Tong:"+tong);
         }}
        
    
    

