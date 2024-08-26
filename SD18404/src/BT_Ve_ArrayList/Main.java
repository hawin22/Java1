/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_Ve_ArrayList;

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
    int chon ;
    QLyHangHoa hh = new QLyHangHoa();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("************");
            System.out.println("****Menu****");
            System.out.println("1.Nhap ds");
            System.out.println("2.Xuat ds");
            System.out.println("3.Cap nhat thong tin theo ma");
            System.out.println("4.Tim hang theo ten hang");
            System.out.println("5.Sap xep hang theo ten giam dan");
            System.out.println("6.Xoa hang theo ma");
            System.out.println("7.Tim hang co don gia lon nhat");
            System.out.println("8.Tim hang trong khoang so luong");
            System.out.println("0.Thoat");
            System.out.println("Moi chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap ds");
                    hh.nhap();
                    break;
                case 2:
                    System.out.println("2.Xuat ds");
                    hh.xuat();
                    break;
                case 3:
                    System.out.println("3.Cap nhat thong tin theo ma");
                    hh.capNhat();
                    hh.xuat(); 
                    break;
                case 4:
                    System.out.println("4.Tim hang theo ten hang");
                    hh.tim();
                    
                    break;
                case 5:
                    System.out.println("5.Sap xep hang theo ten giam dan");
                    hh.sapXep();
                    hh.xuat();
                    break;
                case 6:
                    System.out.println("6.Xoa hang theo ma");
                    hh.xoa();
                    
                    break;
                case 7:
                    System.out.println("7.Tim hang co don gia lon nhat");
                    hh.timMax();
                    
                    break;
                case 8:
                    System.out.println("8.Tim hang trong khoang so luong");
                    hh.timTheoKhoang();
                    
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (chon!=0);
    }
}
