/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class DanhSachSPBai3 {

    private ArrayList<Bai3> list = new ArrayList<>();

    public void nhap() {
        System.out.println("Nhap danh sach san pham");
        Scanner sc = new Scanner(System.in);

        String tiepTuc;
        do {

            System.out.println("Nhap ten sp ");
            //int id= sc.nextInt();
            String ten = sc.nextLine();
//            if (ten == null || ten.equals(" ")) {
//                break;
//
//            }
            System.out.println("Gia sp:");
            double gia = Double.parseDouble(sc.nextLine());

            System.out.println("Co muon tiep tuc ko(Yes/No)??");
            tiepTuc = sc.nextLine();
            list.add(new Bai3(ten, gia));

        } while (tiepTuc.equals("yes"));
    }

    public void xuat() {
        System.out.println("****In ra man hinh****");
        for (Bai3 sp : list) {
            System.out.println(sp.getTen() + " co gia la:" + sp.getGia());
        }
    }

    public void sapXep() {
        Collections.sort(list, (a, b) -> (int) (a.getGia() - b.getGia()));
        System.out.println("ds sau khi sap xep theo gia");
        xuat();
    }

    public void sapxep1() {
        Collections.sort(list, (a, b) -> a.getTen().compareTo(b.getTen()));
        System.out.println("Sap xep lai theo ten");
        xuat();
    }

    public void timKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sp can tim va xoa");
        String ten = sc.nextLine();
        Bai3 tim = null;
        for (Bai3 sp : list) {
            if (sp.getTen().equals(ten)) {
                tim = sp;
            }
            break;
        }
        if (tim != null) {
            list.remove(tim);
            System.out.println("Sp da đc xoa khỏi ds");
        } else {
            System.out.println("Sp ko đc tim thay trong ds");
        }
    }

    public void tinhTBGia() {
        double tong = 0;
        for (Bai3 sp : list) {
            tong += sp.getGia();
        }
        System.out.println("TB cua gia sp la:" + (tong / list.size()));
    }

    public void menu() {
        System.out.println("****Menu****");
        System.out.println("1.Nhap ds sp");
        System.out.println("2.Xuat ds sp");
        System.out.println("3.Sap xep ");
        System.out.println("4.Tim va xoa sp");
        System.out.println("5.Tinh gia TB");
        System.out.println("0.Thoat");
        System.out.println("************");
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("************");
            System.out.println("Moi chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap ds sp");
                    nhap();
                    break;
                case 2:
                    System.out.println("2.Xuat ds sp");
                    xuat();
                    break;
                case 3:
                    System.out.println("3.Sap xep ");
                    sapXep();
                    break;
                case 4:
                    System.out.println("4.Tim va xoa sp");
                    timKiem();
                    break;
                case 5:
                    System.out.println("5.Tinh gia TB");
                    tinhTBGia();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (true);

    }
}
