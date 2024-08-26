/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class MainBai1 {

    public static void main(String[] args) {
        Bai1 ds = new Bai1();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*****Menu*****");
            System.out.println("1.Nhap danh sach");
            System.out.println("2.Xuat danh sach");
            System.out.println("3.Tinh tong");
            System.out.println("0.Thoat chuong trinh");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ds.nhap();
                    System.out.println("1.Nhap danh sach");
                    break;
                case 2:
                    ds.xuat();
                    System.out.println("2.Xuat danh sach");
                    break;
                case 3:
                    ds.tinhTong();
                    System.out.println("3.Tinh tong");
                    break;
                case 0:
                    System.out.println("0.Thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai yeu cau nhap lai");
            }
        } while (chon != 0);
        System.out.println("Chuong trinh ket thuc");
    }
}
