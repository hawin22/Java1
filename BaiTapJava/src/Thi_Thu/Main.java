/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_Thu;

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
        int chon;
        QLSV ql = new QLSV();
        do {
            System.out.println("**************");
            System.out.println("*****MENU*****");
            System.out.println("1.Nhap danh sach");
            System.out.println("2.Xuat danh sach");
            System.out.println("3.Xuat doi tuong qua mon");
            System.out.println("4.Tim SV theo ma");
            System.out.println("5.Ke thua");
            System.out.println("0.Thoat");
            System.out.println("***************");
            System.out.println("****Moi chon****");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap danh sach");
                    ql.nhapTT();
                    break;
                case 2:
                    System.out.println("2.Xuat danh sach");
                    ql.xuat();
                    break;
                case 3:
                    System.out.println("3.Xuat doi tuong qua mon");
                    ql.svQuaMon();
                    break;
                case 4:
                    System.out.println("4.Tim SV theo ma");
                    ql.timKiemTheoMa();
                    break;
                case 5:
                    System.out.println("5.Ke thua");
                    ql.keThua();
                    break;
                case 0:
                    System.out.println("0.Thoat");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Nhap sai!!!.Moi nhap lai: ");
            }
        } while (chon != 0);
    }
}
