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
public class B2_Menu {
//    public static void main(String[] args) {
//     menu();
//        
//    }
//    public static void menu() {
//        Scanner sc = new Scanner(System.in);
//        int chon ;
//        do{
//              System.out.println("======Menu======");
//              System.out.println("1. Goi ga mang cut");
//              System.out.println("2. Lau ech mang cay");
//              System.out.println("3. Oc huong sot trung muoi");
//              System.out.println("4. Bun dau mam tom");
//              System.out.println("0. Thoat");
//              System.out.println("*****************");
//              chon = Integer.parseInt(sc.nextLine());
//              // sw tab
//              switch (chon) {
//                case 1:
//                 System.out.println("1. Goi ga mang cut");   
//                  break;
//                case 2:
//                 System.out.println("2. Lau ech mang cay");
//                 break;
//                case 3:
//                 System.out.println("3. Oc huong sot trung muoi");
//                 break;
//                case 4:
//                 System.out.println("4. Bun dau mam tom");
//                 break;
//                case 0:
//                  System.out.println("0. Thoat"); 
//                 // break;
//                  System.exit(0);
//                default:
//                    System.out.println("Moi nhap lai");   
//            }
//                } while(chon!=0);
//    }
//}

public static void main(String[] args) {
        menu();
    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.println("---------------------------------");
        System.out.println("1. Can bac 2 ");
        System.out.println("2. Sinh vien ");
        System.out.println("3. Thoat");
        System.out.println("---------------------------------");
        System.out.print("Moi ban chon chuc nang: ");
        chon = sc.nextInt();
        switch(chon){
            case 1:
                cBac2();
                break;
            case 2:
                sVien();
                break;
            case 3:
                Thoat();
                break;
            default:
                System.out.println("Ban chon chua dung :");
        }
    }
    static void cBac2(){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Moi nhap a : ");
        a = sc.nextInt();
        if (a>0) {
            System.out.println("Can bac 2 cua a la "+Math.sqrt(a));
        } else {
            System.out.println("Day la so am ");
        }
    }
    static void sVien(){
        Scanner sc = new Scanner(System.in);
        String hoTen;
        double diemTB=0;
        String Lop;
        System.out.println("Ho va ten SV : ");
        hoTen = sc.nextLine();
        System.out.println("Diem Trung Binh SV : ");
        try {
                    diemTB = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu ");
        }
        System.out.println("Lop SV : ");
        Lop = sc.nextLine();
//        in ra
        System.out.println("Thong tin Sinh vien");
        System.out.println("Ho va ten SV : "+hoTen);
        System.out.println("Diem Trung Binh SV : "+diemTB);
        System.out.println("Lop SV : "+Lop);
    }
    static void Thoat(){
        System.exit(0);
    }}