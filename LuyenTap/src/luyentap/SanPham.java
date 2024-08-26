/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap;

import java.io.Serializable;

/**
 *
 * @author Hawin
 */
public class SanPham implements Serializable{
    
    private String maSP;
    private String tenSP;
    private int soLuong;
    private int GiaBan;
    private String maDanhMuc;
    private String trangThai;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, int GiaBan, int thanhTien, String maDanhMuc, String trangThai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.GiaBan = GiaBan;
        this.maDanhMuc = maDanhMuc;
        this.trangThai = trangThai;
    }

    

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", GiaBan=" + GiaBan + ", maDanhMuc=" + maDanhMuc + ", trangThai=" + trangThai + '}';
    }

 
}
