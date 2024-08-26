/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai1 {
    
       private ArrayList<Double> list = new ArrayList<>();
       public void nhap(){
           System.out.println("Nhap danh sach cac so thuc: ");
           Scanner sc =new Scanner(System.in);
           int yes = 1;
           do {
               System.out.println("Nhap so: ");
                double so  = sc.nextDouble();
                list.add(so);
                System.out.println("B co muon nhap tiep ko: [1]:tiep, [0]:thoat");
                yes = sc.nextInt();
           } while (yes ==1);}
          public void xuat(){
              System.out.println("************");
              for (Double d : list) {
                  System.out.println(" "+d);
              }}
             public void tinhTong(){
                 double tong = 0;
                 System.out.println("************");
                 for (Double d : list) {
                     tong +=d;
                 }
                 System.out.println("Tong:"+tong);
             }
          } 
               
           
    


