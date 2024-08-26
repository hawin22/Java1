/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class SanPham {

    Scanner sc = new Scanner(System.in);
    String ten;
    double gia;
    double giamGia;

    public SanPham() {
    }

    public SanPham(String ten, double gia, double giamGia) {
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giamGia;
    }
     public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
        
    }
  
    
    
    

    void nhapTT() {
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap gia");
        gia = sc.nextDouble();
        System.out.println("Nhap giam gia");
        giamGia = sc.nextDouble();

    }

    void xuatTT() {
        System.out.println("Ten sp" + ten);
        System.out.println("Don gia" + gia);
        System.out.println("Giam gia" + giamGia);
        System.out.println("Thue nhap khau" + thueNK());
    }

    double thueNK() {
        return gia * 0.1;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
}
