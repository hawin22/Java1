/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuptqph46287_sd18404;

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
        XeService xe = new XeService();
        int chon ;
        do {
            System.out.println("1.Nhap TT");
            System.out.println("2.Xuat TT");
            System.out.println("3.Xoa theo ma");
            System.out.println("4.Tim xe theo khoang gia");
            System.out.println("5.Xe ô tô");
            System.out.println("0.Thoat");
            System.out.println("Moi chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                   System.out.println("1.Nhap TT");
                   xe.nhap();
                    break;
                case 2:
                    System.out.println("2.Xuat TT");
                    xe.xuat();
                    break;
                case 3:
                     System.out.println("3.Xoa theo ma");
                     xe.xoa();
                    break;
                case 4:
                    System.out.println("4.Tim xe theo khoang gia");
                    xe.timTheoKhoang();
                    break;
                case 5:
                    System.out.println("5.Xe ô tô");
                    xe.keThua();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai!!!");
            }
        } while (chon!=0);
    }
}
