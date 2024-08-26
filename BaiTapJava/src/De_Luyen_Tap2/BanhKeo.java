

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap2;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class BanhKeo {

    private int code, soLuong;
    private String tenBK, tenHangSX;
    double gia;
    private boolean trangThai;

    public BanhKeo() {
        
    }

    public BanhKeo(int code, int soLuong, String tenBK, String tenHangSX, double gia, boolean trangThai) {
        this.code = code;
        this.soLuong = soLuong;
        this.tenBK = tenBK;
        this.tenHangSX = tenHangSX;
        this.gia = gia;
        this.trangThai = trangThai;
    }

   
    public String checkTrangThai(boolean trangThai) {
        if (trangThai) {
            return "Con han";
        } else {
            return "Het han";
        }

    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenBK() {
        return tenBK;
    }

    public void setTenBK(String tenBK) {
        this.tenBK = tenBK;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    @Override
    public String toString() {
        return "BanhKeo{" + "code=" + code + ", soLuong=" + soLuong + ", tenBK=" + tenBK + ", tenHangSX=" + tenHangSX + ", gia=" + gia + ", trangThai=" + trangThai + '}';
    }

  

    public void inThongTin() {
        System.out.println("BanhKeo{" + "code=" + code + ", soLuong=" + soLuong + ", tenBK=" + tenBK + ", tenHangSX=" + tenHangSX + ", gia=" + gia + ", trangThai=" + checkTrangThai(trangThai) + '}');
    }
}
