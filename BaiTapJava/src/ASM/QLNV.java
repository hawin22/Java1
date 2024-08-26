/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLNV {

    ArrayList<NhanVien> lst = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    NhanVien nv;

    public void nhapTT() {
        do {
            nv = new NhanVien();
            nv.nhap();
            lst.add(nv);
            System.out.println("B co muon nhap tiep ko: 1-Co, 2-Ko");
            if (Integer.parseInt(sc.nextLine()) == 2) {
                break;
            }
        } while (true);
    }

    public void xuat() {
        for (NhanVien nhanVien : lst) {
            nhanVien.xuatThongTin();
        }
    }

    public void timTheoMa() {
        System.out.println("Nhap ma can tim: ");
        String searchMa = sc.nextLine();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getManv().equalsIgnoreCase(searchMa)) {
                lst.get(i).xuatThongTin();

            }
        }
        System.out.println("Ko tim thay ma!!");
    }

    public void xoaTheoMa() {
        System.out.println("Nhap ma can xoa: ");
        String reMa = sc.nextLine();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getManv().equalsIgnoreCase(reMa)) {
                
                lst.get(i).xuatThongTin();
                lst.remove(i);
                System.out.println("Da xoa thanh cong!!!");
            }
        }
        System.out.println("Ko tim thay ma!!!");
    }

    public void capNhat() {
        System.out.println("Nhap ma can cap nhat: ");
        String chMa = sc.nextLine();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getManv().equalsIgnoreCase(chMa)) {
                NhanVien nv = new NhanVien();
                System.out.println("Thay doi tt nhu sau: ");
                nv.nhap();
                lst.set(i, nv);
            }
        }
        System.out.println("Ko tim thay ma!!!");
    }

    public void timNVTheoKhoangLuong() {
        double max;
        System.out.println("Nhap min : ");
        double min = Double.parseDouble(sc.nextLine());
        do {
            System.out.println("Nhap max: ");
            max = Double.parseDouble(sc.nextLine());
            if (min < max) {
                break;
            } else {
                System.out.println("Min phai nho hon max, nhap lai max: ");
                max = Double.parseDouble(sc.nextLine());
            }
        } while (true);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getLuong() >= min && lst.get(i).getLuong() <= max) {
                lst.get(i).xuatThongTin();
            }
        }
    }
    public void keThuaTiepThi(){
        TiepThi tt = new TiepThi();
        System.out.println("Nhap doanh so: ");
        tt.setDoanhSo(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap hoa hong: ");
        tt.setHoaHong(Double.parseDouble(sc.nextLine()));
        tt.xuatThongTin();
        
    }
    public void keThuaTruongPhong(){
        TruongPhong tp = new TruongPhong();
        System.out.println("Nhap trach nhiem: ");
        tp.setTrachNhiem(Double.parseDouble(sc.nextLine()));
        tp.xuatThongTin();
    }
}
