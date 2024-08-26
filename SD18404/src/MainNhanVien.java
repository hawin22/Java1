/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */

 import java.util.Scanner;



public class MainNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QlyNhanVien qLy = new QlyNhanVien();
        int chon;
        
        do {       
            System.out.println("-----------MENU---------");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Nhap ds nv cach 2");
            System.out.println("4. Tim ");
            System.out.println("5. Tim theo chuc vu");
            System.out.println("6. Tim kiem theo khoang luong");
            System.out.println("7. Xoa ");
            System.out.println("8. Sua ");
            System.out.println("9. Sap xep ");
            System.out.println("10. Max tuoi ");
            System.out.println("0. Thoat ");
            System.out.println("-----------MENU---------");
            
            System.out.print("Moi ban chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            
            switch (chon) {
                case 1:
                    System.out.println("<<NHAP DANH SACH NHAN VIEN>>");
                    qLy.nhapDS();
                    break;
                case 2:
                    System.out.println("<<XUAT DANH SACH NHAN VIEN>>");
                    qLy.xuatDS();
                    break;
                case 3:
                    System.out.println("Nhap tt 2");
                    qLy.Nhaptt();
                case 4:
                    System.out.println("Tim");
                    qLy.tim();
                    break;
                case 5:
                    System.out.println("5. Tim theo chuc vu");
                    qLy.timTheoChucVu();
                    break;
                case 6:
                    System.out.println("6.Tim theo khoang luong");
                    qLy.timTheokhoangLuong();
                    break;
                    
                case 7:
                    System.out.println("7.Sua");
                    qLy.sua();
                    break;
                case 8:
                    System.out.println("8. Xoa");
                    qLy.xoa();
                    break;
                case 9:
                    System.out.println("Sap xep");
                    qLy.sapXep();
                    break;
                case 10:
                    System.out.println("Max tuoi");
                    qLy.MaxTuoi();
                    break;
                default:
                    System.out.println("Ban chon chuc nang chua dung!!!");
            }
            
        } while (true);
        
    }
}   

