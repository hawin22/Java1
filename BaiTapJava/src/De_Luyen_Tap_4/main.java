/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_4;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class main {
    
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int chon;
        Scanner sc = new Scanner(System.in);
        SachService sach = new SachService();
        do {
            
            System.out.println("1.Nhap ds ");
            System.out.println("2.Xuat ds ");
            System.out.println("3.Xuat ds trong khoang gia ");
            System.out.println("4.Sap xep giam dan theo nam xuat ban");
            System.out.println("5.Tim kiem sach theo Code");
            System.out.println("6.Xoa Sach theo code");
            System.out.println("7.Sap xep tang dan theo ten");
            System.out.println("8.Sap xep giam dan theo gia");
            System.out.println("9.Xuat danh sach cac Sach đuoc xuat ban sau nam 2000");
            System.out.println("10.Tim tat ca Sach co the loai la Sach khoa hoc");
            System.out.println("11.Tim tat ca Sach co ten gan đung (ten chua) đuoc nhap tu ban phim");
            System.out.println("12.Xuat thong tin cua Sach co gia lon nhat va be nhat");
            System.out.println("13.Đem xem co tat ca bao nhieu Sach co gia ngoai khoang người dùng nhập");
            System.out.println("14.Tim tat ca sach co ma bat dau bang SGK ");
            System.out.println("15.Ke thua");
            System.out.println("Moi chon");
            
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap ds ");
                    sach.nhap();
                    break;
                case 2:
                     System.out.println("2.Xuat ds ");
                     sach.xuat();
                    break;
                case 3:
                    System.out.println("3.Xuat ds trong khoang gia ");
                    sach.xuatTrongKhoang();
                    break;
                case 4:
                    System.out.println("4.Sap xep giam dan theo nam xuat ban");
                    sach.sXGTheoNam();
                    break;
                case 5:
                    System.out.println("6.Xoa Sach theo code");
                    
                    sach.timTheoCode();
                    break;
                case 6:
                    System.out.println("6.Xoa Sach theo code");
                    sach.xoa();
                    break;
                case 7:
                    System.out.println("7.Sap xep tang dan theo ten");  
                    sach.sXTTheoTen();
                    break;
                case 8:
                    System.out.println("8.Sap xep giam dan theo gia");
                    sach.sXGTheoGia();
                    break;
                case 9:
                    System.out.println("9.Xuat danh sach cac Sach đuoc xuat ban sau nam 2000");
                    sach.sachSauNam2000();
                    break;
                case 10:
                    System.out.println("10.Tim tat ca Sach co the loai la Sach khoa hoc");
                    sach.xuatKhoaHoc();
                    break;
                case 11:
                    System.out.println("11.Tim tat ca Sach co ten gan đung (ten chua) đuoc nhap tu ban phim");
                    sach.timTenGD();
                    break;
                case 12:
                    System.out.println("12.Xuat thong tin cua Sach co gia lon nhat va be nhat");
                    sach.minMax();
                    break;
                case 13:
                    System.out.println("13.Đem xem co tat ca bao nhieu Sach co gia ngoai khoang người dùng nhập");
                    sach.dem();
                    break;
                case 14:
                    System.out.println("14.Tim tat ca sach co ma bat dau bang SGK ");
                    sach.searchMa();
                    break;
                case 15:
                    System.out.println("15.Ke thua");
                    sach.keThua();
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
