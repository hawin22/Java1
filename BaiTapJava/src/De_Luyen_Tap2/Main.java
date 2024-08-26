/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap2;

import java.util.ArrayList;
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
        QLBK bk = new QLBK();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            
            System.out.println("************");
            System.out.println("****Menu****");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Xuat danh sach cac banh keo con han su dung");
            System.out.println("4. Sap xep giam dan theo So luong ");
            System.out.println(" 5. Sap xep tang dan theo ten hang SX");
            System.out.println("6. Tim kiem banh keo theo Code");
            System.out.println("7. Xuat danh sach banh keo co ten bat dau bang chu C");
            System.out.println("8. Xoa banh keo theo code");
            System.out.println("9. Xuat danh sach cac banh keo co so luong >= 50");
            System.out.println("10. Cap nhat trang thai cua banh keo theo code nhap vao");
            System.out.println("11. Tim banh keo co gia lon nhat");
            System.out.println("12. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("*****Moi chon*****");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1. Nhap danh sach");
                    bk.nhap();
                    break;
                case 2:
                    System.out.println("2. Xuat danh sach");
                    bk.xuat();
                    break;
                case 3:
                    System.out.println("3. Xuat danh sách cac banh keo con han su dung");
                    bk.xuatConHan();
                    break;
                case 4:
                    System.out.println("4. Sap xep giam dan theo So luong ");
                    bk.sapXepGiam();
                     bk.xuat();
                    break;
                case 5:
                    System.out.println(" 5. Sap xep tang dan theo ten hang SX");
                    bk.sapXepTang();
                     bk.xuat();
                    break;
                case 6:
                    System.out.println("6. Tim kiem banh keo theo Code");
                    bk.tim();
                    break;
                case 7:
                    System.out.println("7. Xuat danh sach banh keo co ten bat dau bang chu C");
                    bk.xuatC();
                    
                    break;
                case 8:
                    System.out.println("8. Xoa banh keo theo code");
                    bk.xoa();
                     bk.xuat();
                    break;
                case 9:
                    System.out.println("9. Xuat danh sach cac banh keo co so luong >= 50");
                    bk.xuatSL();
                    break;
                case 10:
                    System.out.println("10. Cap nhat trang thai cua banh keo theo code nhap vao");
                    bk.capNhat();
                    bk.xuat();
                    break;
                case 11:
                    System.out.println("11. Tim banh keo co gia lon nhat");
                    bk.maxGia();
                    break;
                case 12:
                    System.out.println("12.Ke thua");
                    bk.keThua();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");

            }

        } while (chon!=0);

    }
}
