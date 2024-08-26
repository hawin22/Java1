/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;


import java.util.Scanner;


/**
 *
 * @author Ha Thanh
 */
public class MainNhanVien {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        QlyNhanVien ql = new QlyNhanVien();
        int chon = 0;
        do {
            System.out.println("----------------------------------------menu----------------------------------");
            System.out.println("1. Nhap danh sach nhan vien tu ban phim .");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh.");
            System.out.println("3. Tim va tim hieu theo ma nhan vien nhap vao tu ban phim");
            System.out.println("4. Xoa nhan vien theo ma nhap tu tu ban phim.");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
            System.out.println("6. Tim cac nhan vien theo ma nhap tu ban phim .");
            System.out.println("7. Sap xep nhan vvien theo ho va ten .");
            System.out.println("8. Sap xep nhan vien theo thu nhap.");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat.");
            System.out.println("0.thoat");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("nhap lua chon: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    System.out.println("Nhap danh sach nhan vien tu ban phim ");
                    ql.nhapDs();
                    break;
                case 2:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.xuatDS();

                    break;
                case 3:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.timTheoMa();

                    break;
                case 4:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.xoaTheoMa();

                    break;
                case 5:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.capNhatTheoMa();

                    break;
                case 6:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.timTheoMa();

                    break;
                case 7:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.sapXepTheoHoTen();

                    break;
                case 8:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.sapXepTheoThuNhap();

                    break;
                case 9:
                    System.out.println("Xuat danh sach nhan vien ra man hinh");
                    ql.thuNhapCao();

                    break;
                    
                case 0:
                    System.out.println("thoat");
                    System.exit(0);

                    break;

                default:
                    System.out.println("nhap sai nhap lai");
            }
        } while (true);
            
    }
    
}
