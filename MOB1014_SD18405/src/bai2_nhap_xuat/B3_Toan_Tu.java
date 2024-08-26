package bai2_nhap_xuat;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class B3_Toan_Tu {
    public static void main(String[] args) {
        System.out.println("-----Nhap-----");
        System.out.println("Nhap ma dt:");
        Scanner sc = new Scanner(System.in);
        String ma,ten;
        ma= sc.nextLine();
        System.out.println("Nhap ten:");
        ten=sc.nextLine();
        System.out.println("Nhap gia:");
        double gia= Double.parseDouble(sc.nextLine());
         System.out.println("Nhap dung luong:");
         int dl= Integer.parseInt(sc.nextLine());
         System.out.println("Nhap trang thai:");
         boolean trangThai =Boolean.parseBoolean(sc.nextLine());
        // String c=( trangThai== true)? "May moi" : "May cu";
         System.out.println("----Xuat----");
         System.out.println("Ma dt:"+ ma);
         System.out.println("Ten dt:" + ten);
         System.out.println("Dung luong:" + dl);
         //System.out.println("Trang thai:"+ c);
         // trangThai== True cũng có thể ghi là trangThai( vì đang dùng boolean chỉ có 2 lựa chọn)
         System.out.println("Trang thai:"+( trangThai ? "May moi" : "May cu" ));
         System.out.println("Trang thai:"+(!trangThai ? "May cu" : "May moi" ));
    }   
}
