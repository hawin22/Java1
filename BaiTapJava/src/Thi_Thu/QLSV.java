/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_Thu;

import java.util.ArrayList;
import java.util.Scanner;
import org.w3c.dom.ls.LSInput;

/**
 *
 * @author Hawin
 */
public class QLSV {

    ArrayList<SinhVien> lstSV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SinhVien sv;

    public QLSV() {
        lstSV.add(new SinhVien(01, "huy", 2004, 9.4));
        lstSV.add(new SinhVien(05, "duc", 2004, 9.5));
        lstSV.add(new SinhVien(03, "chinh", 2004, 9.8));
        lstSV.add(new SinhVien(04, "lenh", 2004, 9.6));
        lstSV.add(new SinhVien(06, "nghia", 1999, 9.9));
        lstSV.add(new SinhVien(02, "tu", 2004, 9.3));
    }

    public void nhapTT() {
        int tiepTuc;
        do {
            sv = new SinhVien();
            System.out.println("Nhap ma sv: ");
            sv.setMaSV(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap ten sv: ");
            sv.setTen(sc.nextLine());
            System.out.println("Nhap nam sinh sv: ");
            sv.setNamSinh(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap diem: ");
            sv.setDiemCsharp(Double.parseDouble(sc.nextLine()));
            lstSV.add(sv);
            System.out.println("B co muon nhap tiep ko: 1-Co, 2-Ko");
            tiepTuc = Integer.parseInt(sc.nextLine());
        } while (tiepTuc == 1);

    }

    public void xuat() {
        if (lstSV.isEmpty()) {
            return;
        }
        for (SinhVien sinhVien : lstSV) {
            sinhVien.inThongTin();
        }
    }

    public void xuatSVQuaMon() {
        int dem = 0;

        for (int i = 0; i < lstSV.size(); i++) {
            if (lstSV.get(i).getDiemCsharp() >= 5) {
                lstSV.get(i).inThongTin();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Ko tim thay!!!");
        }
    }

    public ArrayList<SinhVien> SinhVienQuaMon() {
        ArrayList<SinhVien> list = new ArrayList<>();

        for (int i = 0; i < lstSV.size(); i++) {
            if (lstSV.get(i).getDiemCsharp() >= 5) {
                list.add(lstSV.get(i));

            }

        }
        return list;
    }

    public void svQuaMon() {
        ArrayList<SinhVien> lst = SinhVienQuaMon();
        if (lst.isEmpty()) {
            System.out.println("DS trong!!!");
            return;
        }
        for (SinhVien sinhVien : lst) {
            sinhVien.inThongTin();
        }
    }

    public void timKiemTheoMa() {
        int searchMa;
        int count = 0;
        System.out.println("Nhap ma can tim");
        searchMa = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstSV.size(); i++) {
            if (tim(lstSV.get(i).getMaSV(), searchMa)) {
                lstSV.get(i).inThongTin();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ko tim thay!!!");
        }
    }

    public boolean tim(int m, int s) {
        if (m == s) {
            return true;
        } else {
            return false;
        }
    }

    public void keThua() {
        SinhVien sv = new SinhVienUDPM(9.5, 9.8, 07, "thu", 2002, 9.6);
        sv.inThongTin();
    }
}
