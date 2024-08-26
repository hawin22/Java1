/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2905;

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
        QLGV ql = new QLGV();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("**********");
            System.out.println("****Menu****");
            System.out.println("1.Nhap thong tin giao vien");
            System.out.println("2.Xuat thong tin giao vien");
            System.out.println("3.Tim kiem");
            System.out.println("4.Tim kiem theo khoang");
            System.out.println("5.Xoa");
            System.out.println("6.Sua");
            System.out.println("7.Sap xep");
            System.out.println("8.Ke thua");
            System.out.println("0.Thoat");
            System.out.println("***********");
            System.out.println("Moi ban chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap thong tin giao vien");
                    ql.nhap();
                    break;
                case 2:
                    System.out.println("2.Xuat thong tin giao vien");
                    ql.xuat();
                    break;
                case 3:
                   ql.timKiem();
                    break;
                case 4:
                   ql.timKiemTheoKhoang();
                    break;
                case 5:
                   ql.xoa();
                    break;
                case 6:
                   ql.sua();
                    break;
                case 7:
                   ql.sapXep();
                    break;
                case 8:
                    ql.keThua();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (chon != 0);
    }
}
