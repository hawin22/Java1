/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class SinhVien {
     Scanner sc = new Scanner(System.in);
    // Trường hay thuộc tính: mô tả đặc điểm của class
    private  String hoTen; // chỉ thực hiện bên trong class
    public  String maSV;  // Công khai,thực hiện đc bên ngoài class
    double diem;
    // Phương thức => mô tả hành động của đối tượng

    public SinhVien(String maSV) {
        this.maSV = maSV;
    }

    public SinhVien() {
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
     
  
    
    
    void nhapTT() {
        System.out.println("****Nhap thong tin****");
        System.out.println("Nhap ho ten sinh vien");
        hoTen = sc.nextLine();
        System.out.println("Nhap ma sinh vien");
        maSV = sc.nextLine();
        System.out.println("Nhap diem sv");
        diem = sc.nextDouble();
    }

    void xuatTT() {

        System.out.println("****Xuat thong tin****");
        System.out.println("Ho ten sv: " + hoTen);
        System.out.println("Ma sv: " + maSV);
        System.out.println("Diem sv: " + diem);

    }

}
