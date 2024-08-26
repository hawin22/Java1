/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46287_baitonghop2;

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
        DoVatService lst =  new DoVatService();
        int chon;
        do {
            System.out.println("1.Nhap ds"); 
            System.out.println("2.Xuat ds"); 
            System.out.println("3.Tim theo ma"); 
            System.out.println("4.Xoa theo ten"); 
            System.out.println("5.Sap xep theo ma tang dan"); 
            System.out.println("6.Tim theo khoang gia"); 
            System.out.println("7.Sap xep giam dan theo gia"); 
            System.out.println("8.Ke thua"); 
            System.out.println("0.Thoat");
            System.out.println("Moi chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                   System.out.println("1.Nhap ds");
                   lst.nhapTT();
                    break;
                case 2:
                    System.out.println("2.Xuat ds");
                    lst.xuat();
                    break;
                case 3:
                    System.out.println("3.Tim theo ma"); 
                    lst.tim();
                    break;
                case 4:
                    System.out.println("4.Xoa theo ten"); 
                    lst.xoa();
                    break;
                case 5:
                    System.out.println("5.Sap xep theo ma tang dan"); 
                    lst.SapXep();
                    break;
                case 6:
                    System.out.println("6.Tim theo khoang gia"); 
                    lst.timTheoKhoangGia();
                    break;
                case 7:
                    System.out.println("7.Sap xep giam dan theo gia"); 
                    lst.sapXepGiamDan();
                    break;
                case 8:
                    System.out.println("8.Ke thua"); 
                    lst.keThua();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai!!");
            }
        } while (chon!=0);
    }
}
