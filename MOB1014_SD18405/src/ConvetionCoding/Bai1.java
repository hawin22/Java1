/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvetionCoding;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {

            System.out.println("1. Nhap thong tin");
            System.out.println("2.hong bao ket qua");
            System.out.println("3.Nhap xuat mang");
            System.out.println("0. Thoat");
            System.out.println("Moi chon:");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1. Nhap thong tin");
                    System.out.println("Nhap ten");
                    String ten = sc.nextLine();
                    System.out.println("Nhap nam sinh");
                    int namSinh = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap nganh hoc");
                    String nganhHoc = sc.nextLine();
                    System.out.println("Nhap diem");
                    double diem = sc.nextDouble();
                    System.out.println("Ten: " + ten + "-nam sinh " + namSinh
                            + "-nganh hoc " + nganhHoc + "-diem " + diem);

                    break;
                case 2:
                    System.out.println("2.Thong bao ket qua");

                    System.out.println("Nhap diem  ");
                    double d;

                    do {

                        System.out.println("Moi b nhap lai diem tu 0 den 10");
                        d = sc.nextDouble();
                    } while (d < 0 || d > 10);
                    if (d < 5) {
                        System.out.println("Thi lai");
                    } else {
                        System.out.println("Qua mon");
                    }
                    break;
                case 3:
                    System.out.println("3.Nhap xuat mang");
                    System.out.println("Moi nhap mang");
                    int sL = Integer.parseInt(sc.nextLine());
                    int[] arrSl = new int[sL];
                    for (int i = 0; i < arrSl.length; i++) {
                        System.out.println("Danh sach sv[" + i + "] :");
                        arrSl[i] = Integer.parseInt(sc.nextLine());

                    }
                    break;
                case 0:
                default:
                    System.out.println("Chuc nang ko dung");
            }
        } while (chon != 0);
    }
}
