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
public class NhanVien {

    Scanner sc = new Scanner(System.in);
    private String manv, hoten;
     protected double luong;
     
    
    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public void nhap() {
        System.out.println("Nhap ma nv: ");
        manv = sc.nextLine();
        System.out.println("Nhap ho ten nv: ");
        hoten = sc.nextLine();
        System.out.println("Nhap luong nv: ");
        luong = Double.parseDouble(sc.nextLine());
     
            int n;
            QLNV ql = new QLNV();
          do {
             System.out.println("Moi chon loai nv: 1-Tiep Thi,2-Truong Phong");
            System.out.println("1.Tiep thi");
            System.out.println("2.Truong phong");
        
            System.out.println("Moi chon");
            n = Integer.parseInt(sc.nextLine());
           if(n==1){
               ql.keThuaTiepThi();
               break;
           } else if(n==2){
               ql.keThuaTruongPhong();
               break;
           }
        } while (true);
 
    }       
       

    public double getThuNhap() {
        return luong;
    }

    public double getThueTN(double luong) {
        if (luong < 9) {
            return 0;
        } else if (luong >= 9 && luong <= 15) {
            return luong * 0.1;
        } else {
            return luong * 0.12;
        }

    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "manv=" + manv + ", hoten=" + hoten + ", luong=" + luong + '}';
    }

    public void xuatThongTin() {
        System.out.println("NhanVien{" + "manv=" + manv + ", hoten=" + hoten + ", luong=" + luong + '}');
    }
}
