/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Thi_3;

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
        Scanner sc =new Scanner(System.in);
        QLVaccine ql = new QLVaccine();
        int chon;
        do {
            System.out.println("***************");
            System.out.println("*****Menu*****");
            System.out.println("1.Nhap ds");
            System.out.println("2.Xuat ds");
            System.out.println("3.Xuat danh sach va đem cac VC(ThoiGianTacDung >= 6 thang)");
            System.out.println("4.Sap xep giam dan theo ThoiGianTacDung ");
            System.out.println("5.Ke thua");
            System.out.println("6.Xuat danh sach cac VC co Ma chua VN");
            System.out.println("7.Tim vi tri VC co ThoiGianTacDung nho nhat");
            System.out.println("******Moi chon******");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap ds");
                    ql.nhapTT();
                    break;
                case 2:
                    System.out.println("2.Xuat ds");
                    ql.xuat();
                    break;
                case 3:
                    System.out.println("3.Xuat danh sach va đem cac VC(ThoiGianTacDung >= 6 thang)");
                    ql.xuatVaDem();
                    break;
                case 4:
                    System.out.println("4.Sap xep giam dan theo ThoiGianTacDung ");
                    ql.sapXep();
                    break;
                case 5:
                    System.out.println("5.Ke thua");
                    ql.keThua();
                    break;
                case 6:
                    System.out.println("6.Xuat danh sach cac VC co Ma chua VN");
                    ql.xuatMaChua();
                    break;
                case 7:
                    System.out.println("7.Tim vi tri VC co ThoiGianTacDung nho nhat");
                    ql.min();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (chon!=0);
    
}
}