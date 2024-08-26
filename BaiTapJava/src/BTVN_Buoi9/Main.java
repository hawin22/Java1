/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi9;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        QLSV ql = new QLSV();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("****Menu****");
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("0.Thoat");
            System.out.println("************");
            System.out.println("Moi chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ql.nhapTT();
                    break;
                case 2:
                    ql.xuatTT();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi b chon lai");
            }
        } while (chon!=0);
    }
}
