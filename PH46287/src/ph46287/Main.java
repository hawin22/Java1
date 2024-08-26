/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46287;

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
        Scanner sc = new Scanner(System.in);
        QLHQ hoa = new QLHQ();
        int chon;
        do {
            System.out.println("*************");
            System.out.println("****Menu****");
            System.out.println("1.Nhap ds");
            System.out.println("2.Xuat ds");
            System.out.println("3.Sap xep");
            System.out.println("4.Xoa");
            System.out.println("5.Tim ");
            System.out.println("****Moi chon****");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap ds");
                    hoa.nhapDS();
                    break;
                case 2:
                    System.out.println("2.Xuat ds");
                    hoa.xuat();
                    break;
                case 3:
                    System.out.println("3.Sap xep");
                    hoa.sapXep();
                    hoa.xuat();
                    break;
                case 4:
                    System.out.println("4.Xoa");
                    hoa.xoa();
                    hoa.xuat();
                    break;
                case 5:
                    System.out.println("5.Tim ");
                    hoa.tim();
                    break;
                default:
                    System.out.println("Nhap sai!!!");
            }
        } while (chon!=0);
    }
}
