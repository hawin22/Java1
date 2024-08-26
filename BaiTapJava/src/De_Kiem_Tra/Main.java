/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Kiem_Tra;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        QLKEM ql = new QLKEM();
        int chon;
        do {
            System.out.println("***************");
            System.out.println("*****Menu*****");
            System.out.println("1.Nhap ds");
            System.out.println("2.Xuat ds");
            System.out.println("3.Tim kiem Kem theo ma nhap tu ban phim");
            System.out.println("4.Sap xep kem giam dan theo so luong ");
            System.out.println("5. Đem co bao nhieu Kem co gia lon hon 15,000đ ");
            System.out.println("6.Xuat danh sach va vi tri của Kem co gia lon nhat ");
            System.out.println("7.Ke thua");
            System.out.println("******Moi chon******");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap ds");
                    ql.nhap();
                    break;
                case 2:
                    System.out.println("2.Xuat ds");
                    ql.xuat();
                    break;
                case 3:
                    System.out.println("3.Tim kiem Kem theo ma nhap tu ban phim");
                    ql.timKiem();
                    break;
                case 4:
                    System.out.println("4.Sap xep kem giam dan theo so luong ");
                    ql.sapXep();
                    break;
                case 5:
                    System.out.println("5. Đem co bao nhieu Kem co gia lon hon 15,000đ ");
                    ql.dem();
                    break;
                case 6:
                    System.out.println("6.Xuat danh sach va vi tri của Kem co gia lon nhat ");
                    ql.viTriMax();
                    break;
                case 7:
                    ql.keThua();
                    break;
                case 8:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Nhap sai!!!");
            }
        } while (chon != 0);
    }
}
