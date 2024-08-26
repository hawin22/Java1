/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap4_De2;

import java.io.Serializable;

/**
 *
 * @author Hawin
 */
public class DienThoai implements Serializable{
    private String ma;
    private String hang;
    private String mauSac;
    private String boNho;
    private Integer gia;

    public DienThoai() {
    }

    public DienThoai(String ma, String hang, String mauSac, String boNho, Integer gia) {
        this.ma = ma;
        this.hang = hang;
        this.mauSac = mauSac;
        this.boNho = boNho;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "ma=" + ma + ", hang=" + hang + ", mauSac=" + mauSac + ", boNho=" + boNho + ", gia=" + gia + '}';
    }
    
    
    
}
