/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_5;

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
        DienThoaiService dt = new DienThoaiService();
        int chon ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*********Menu***********");
            System.out.println("1.Nhap TT");
            System.out.println("2.Xuat TT");
            System.out.println("3.Hien thi ds dt bat dau = sa ");
            System.out.println("4.Hien thi ds dt chua ten nhap ten tu ban phim");
            System.out.println("5.Tim dt = id");
            System.out.println("6.Xoa dt theo seri");
            System.out.println("7.Sap xep giam dan");
            System.out.println("8.Sap xep tang dan");
            System.out.println("9.Xuat ds dt co dung luong 64gb va 128gb");
            System.out.println("0.Thoat");
            System.out.println("Moi chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                 System.out.println("1.Nhap TT");
                 dt.nhapTT();
                    break;
                case 2:
                    System.out.println("2.Xuat TT");
                    dt.xuatTT();
                    break;
                case 3:
                    System.out.println("3.Hien thi ds dt bat dau = sa ");
                    dt.hienThiSa();
                    break;
                case 4:
                    System.out.println("4.Hien thi ds dt chua ten nhap ten tu ban phim");
                    dt.tim1();
                    break;
                case 5:
                    System.out.println("5.Tim dt = id");
                    dt.tim2();
                    break;
                case 6:
                    System.out.println("6.Xoa dt theo seri");
                    dt.xoa();
                    break;
                case 7:
                    System.out.println("7.Sap xep giam dan");
                    dt.sapXepG();
                    break;
                case 8:
                    System.out.println("8.Sap xep tang dan");
                    dt.sapXepT();
                    break;
                case 9:
                     System.out.println("9.Xuat ds dt co dung luong 64gb va 128gb");
                     dt.xuatDl();
                    break;
                case 10:
                    dt.keThua();
                    break;
                case 11:
                    dt.timKiemTrongKhoang();
                    break;
                case 0:
                    System.exit(0);
                   return;
                default:
                    System.out.println("Nhap sai!!");
            }
        } while (chon!=0);
    }
}
