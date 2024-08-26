/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Bai2;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class SanPham {

    private String tenSp;
    private double donGia;
    private String hang;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham : ");
        tenSp = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap hang : ");
        hang = sc.nextLine();

    }

    public void xuat() {
        System.out.println(tenSp + " - " + donGia + " - " + hang);
    }
}
