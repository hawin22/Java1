/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Thi_2;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class MainCay {
    public static void main(String[] args) {
        menu();
    }
     public static void menu(){
         QLCAY ql = new QLCAY();
     int chon;
         Scanner sc = new Scanner(System.in);
         do {
             System.out.println("****************");
             System.out.println("******Menu******");
             System.out.println("1.Nhap thong tin cay");
             System.out.println("2.Xuat thong tin cay");
             System.out.println("3.Sap xep thong tin cay");
             System.out.println("4.Xoa thong tin cay");
             System.out.println("5.Ke thua");            
             System.out.println("0.Thoat");
             System.out.println("****************");
             chon = Integer.parseInt(sc.nextLine());
             switch (chon) {
                 case 1:
                     System.out.println("1.Nhap thong tin cay");
                     ql.nhapDS();
                     break;
                 case 2:
                     System.out.println("2.Xuat thong tin cay");
                     ql.xuat();
                     break;
                 case 3:
                     System.out.println("3.Sap xep thong tin cay");
                     ql.sapXep();
                     break;
                 case 4:
                     System.out.println("4.Xoa thong tin cay");
                     ql.xoa();
                     break;
                 case 5:
                     System.out.println("5.Ke thua");
                     ql.keThua();
                     break;
                 case 0:
                     System.out.println("0.Thoat");
                     break;
                 default:
                     System.out.println("Nhap sai");
             }
         } while (chon!=0);
     }
}
