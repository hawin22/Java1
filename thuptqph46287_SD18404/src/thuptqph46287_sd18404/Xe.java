/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuptqph46287_sd18404;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Xe {
    private String maXe, hangSX, mau;
    private double gia;
    
    Scanner sc = new Scanner(System.in);
    
    public void nhapTT(){
        System.out.println("Nhap ma xe: ");
        maXe = sc.nextLine();
        System.out.println("Nhap hang xe: ");
        hangSX = sc.nextLine();
        System.out.println("Nhap mau: ");
        mau = sc.nextLine();
        System.out.println("Nhap gia: ");
        gia = Double.parseDouble(sc.nextLine());
    }
    public Xe() {
    }

    public Xe(String maXe, String hangSX, String mau, double gia) {
        this.maXe = maXe;
        this.hangSX = hangSX;
        this.mau = mau;
        this.gia = gia;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Xe{" + "maXe=" + maXe + ", hangSX=" + hangSX + ", mau=" + mau + ", gia=" + gia + '}';
    }
    public void inThongTin(){
        System.out.println("Xe{" + "maXe=" + maXe + ", hangSX=" + hangSX + ", mau=" + mau + ", gia=" + gia + '}');
    }
    
}
