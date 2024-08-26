/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46287_baitonghop2;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class DoVat {
    Scanner sc = new Scanner(System.in);
    private String maDoVat, tenDoVat;
    private int loai;
    private double gia;

    public DoVat() {
    }

    public DoVat(String maDoVat, String tenDoVat, int loai, double gia) {
        this.maDoVat = maDoVat;
        this.tenDoVat = tenDoVat;
        this.loai = loai;
        this.gia = gia;
    }

    public String getMaDoVat() {
        return maDoVat;
    }

    public void setMaDoVat(String maDoVat) {
        this.maDoVat = maDoVat;
    }

    public String getTenDoVat() {
        return tenDoVat;
    }

    public void setTenDoVat(String tenDoVat) {
        this.tenDoVat = tenDoVat;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    @Override
    public String toString() {
        return "DoVat{" + "maDoVat=" + maDoVat + ", tenDoVat=" + tenDoVat + ", loai=" + loai + ", gia=" + gia + '}';
    }
    public void inThongTin(){
        System.out.println("DoVat{" + "maDoVat=" + maDoVat + ", tenDoVat=" + tenDoVat + ", loai=" +( loai==0?"noi that":"ngoai that") + ", gia=" + gia + '}');
    }
//    public void nhap(){
//        System.out.println("Nhap ma: ");
//        maDoVat = sc.nextLine();
//        System.out.println("Nhap ten:");
//        tenDoVat = sc.nextLine();
//        System.out.println("Nhap loai: ");
//        loai = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhap gia: ");
//        gia = Double.parseDouble(sc.nextLine());
//        
//    }
}


