/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Lab1_2 {
    public static void main(String[] args) {
        menu();
        
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon ;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1.Thong tin nhan vien");
            System.out.println("2.Thong tin san pham");
            System.out.println("3.Thong tin dien thoai");
            System.out.println("0.Thoat");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Thong tin nhan vien");
                    nv() ;
                    break;
                case 2:
                    System.out.println("2.Thong tin san pham");
                    sp();
                    break;
                case 3:
                    System.out.println("3.Thong tin dien thoai");
                    break;
                case 4:
                    System.out.println("0.Thoat");
                    System.exit(0);
                default:
                    System.out.println("Nhap ko hop le, moi nhap lai");
            }
        } while (chon!=0);
        
        
}
    public static void nv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
       int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten nv");
        String ten = sc.nextLine();
        System.out.println("Nhap luong");
        double luong = sc.nextDouble();
        System.out.println("Nhap loai");
        int loai = sc.nextInt();
        System.out.println("id nv:"+id);
        System.out.println("ten nv:"+ ten);
        System.out.println("luong nv:"+luong);
        System.out.println("Loai nv:"+(loai==1?"Hanh chinh":"Tiep thi"));
       
    }
    public static void sp() {
        Scanner sc =new Scanner(System.in);
        System.out.println("+-----Thong tin san pham-----+");
        System.out.println("Nhap so luong");
        int sL = Integer.parseInt(sc.nextLine());
        int [] arrGia = new int [sL];
        for (int i = 0; i < arrGia.length; i++) {
            System.out.println("Nhap gia cua sp "+i+": ");
            arrGia[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("+-----Xuat thong tin sp-----+");
        for (int i = 0; i < arrGia.length; i++) {
            System.out.println("Gia cua sp "+i+": "+arrGia[i]);
            
        }
        int d = 0;
        for (int i = 0; i < arrGia.length; i++) {
            if(arrGia[i]>100000){
                d++;
            }
           
        
            
    } System.out.println("So luong Sp co gt > 100000 la "+ d);
        int vT = 0;
        int min = arrGia[0];
        for (int i = 0; i < arrGia.length; i++) {
            if(min>arrGia[i])
                min = arrGia[i];
                vT = i;
             
            }
            System.out.println("Vi tri sp co gia nho nhat la"+vT);
          
          Arrays.sort(arrGia);
          System.out.println("Sap xep theo thu tu tang dan");
          for (int i : arrGia) {
              System.out.println(i);
        }
        }
        
}
