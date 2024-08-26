/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

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
        int chon ;
        do {
            QLNV nv = new QLNV();
            System.out.println("1. Nhap danh sach nhan vien tu ban phim");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh.");
            System.out.println("3. Tim va tim hieu theo ma nhan vien nhap vao tu ban phim");
            System.out.println("4. Xoa nhan vien theo ma nhap tu tu ban phim.");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
            System.out.println("6. Tim cac nhan vien theo ma nhap tu ban phim .");
            System.out.println("7. Sap xep nhan vvien theo ho va ten .");
            System.out.println("8. Sap xep nhan vien theo thu nhap.");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat.");
            System.out.println("0. Thoat");
            System.out.println("Moi ban chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                      System.out.println("1. Nhap danh sach nhan vien tu ban phim");
                      nv.nhapTT();
                    break;
                case 2:
                    System.out.println("2. Xuat danh sach nhan vien ra man hinh.");
                    nv.xuat();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (true);
    }
}
