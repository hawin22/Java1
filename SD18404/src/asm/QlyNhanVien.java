/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Ha Thanh
 */
public class QlyNhanVien {
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void nhapDs(){
        do {            
            NhanVien nv = new NhanVien();
            nv.nhapTT();
            dsNhanVien.add(nv);
            System.out.println("Ban co muon nhap tiep khong(y/n)? ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
            
            
        
    }

    public void xuatDS(){
        for (NhanVien nhanVien : dsNhanVien) {
            nhanVien.xuatTT();
        }
    }
    public void timTheoMa(){
        String searchMa;
        System.out.print("Nhap vao ma can tim: ");
        searchMa= sc.nextLine();
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if (dsNhanVien.get(i).getMaNV().equalsIgnoreCase(searchMa)) {
                dsNhanVien.get(i).xuatTT();
            }
        }
    }
    public void xoaTheoMa(){
        String searchMa;
        System.out.print("Nhap vap ma can xoa: ");
        searchMa=sc.nextLine();
        for (int i = 0; i < dsNhanVien.size(); i++) {
            dsNhanVien.remove(i);
        }
        xuatDS();
    }
    public void capNhatTheoMa(){
        String searchMa;
        System.out.print("Nhap ma can cap nhat: ");
        searchMa=sc.nextLine();
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if (dsNhanVien.get(i).getMaNV().equalsIgnoreCase(searchMa)) {
                dsNhanVien.get(i).nhapTT();
            }
        }
        xuatDS();
        
    }
    public void timTheoKhoangLuong(){
        System.out.print("Nhap luong min: ");
        double min = sc .nextDouble();
        
        double max;
        do {            
            System.out.println("Nhap luong max:");
            max=Double.parseDouble(sc.nextLine());
            if (min<max) {
                break;
            } else {
                System.out.println("max phai lon hon min, yeu cau nhap lai");
            }
        } while (true);
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if (dsNhanVien.get(i).getLuong()>=min&&dsNhanVien.get(i).getLuong()<=max) {
                dsNhanVien.get(i).xuatTT();
            }
        }
        
    }
    public void sapXepTheoHoTen(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(dsNhanVien, comp);
        xuatDS();
    }
    public void sapXepTheoThuNhap(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getLuong()==o2.getLuong()) {
                    return 0;
                }else if (o1.getLuong()>o2.getLuong()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsNhanVien, comp);
        xuatDS();
    }
    public double maxThunhap(){
        double max = dsNhanVien.get(0).thuNhap();
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if(max<dsNhanVien.get(i).thuNhap()){
                max = dsNhanVien.get(i).thuNhap();
            }
        }
        return max;
    }
    public void thuNhapCao(){
        for (int i = 0; i < 5; i++) {
            if(dsNhanVien.get(i).thuNhap() == maxThunhap()){
                dsNhanVien.get(i).xuatTT();
            }
            
        }
        
    }
    
}