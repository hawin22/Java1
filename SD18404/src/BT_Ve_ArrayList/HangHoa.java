/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_Ve_ArrayList;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class HangHoa {

    private String maHang;
    private String tenHang;
    private int soLuong,loai;
    private int donGia;
    

    Scanner sc = new Scanner(System.in);

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, int soLuong, int donGia, int loai) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.loai = loai;
    }
    public String Loai(int loai){
        if(loai == 1){
            return "Xuat khau";
        } else {
        return "Nhap Khau";
        }
    }

    public void nhapTT() {
        System.out.println("Nhap ma hang : ");
        maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia: ");
        donGia = Integer.parseInt(sc.nextLine());
        System.out.print("nhap loai hang: "+ Loai(loai));
        
    }
    public void xuatTT(){
        
    }
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
     public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soLuong=" + soLuong + ", loai=" + loai + ", donGia=" + donGia + '}';
    }

    public void inThongTin() {
        System.out.println("HangHoa{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soLuong=" + soLuong + ", donGia=" + donGia +", loai=" + loai +  '}');
    }
}
