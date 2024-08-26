/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph46287;

/**
 *
 * @author Hawin
 */
public class HoaQua {
private String ma , ten , nguonGoc;
private double donGia;
private int loai;

    public HoaQua() {
    }

    public HoaQua(String ma, String ten, String nguonGoc, double donGia, int loai) {
        this.ma = ma;
        this.ten = ten;
        this.nguonGoc = nguonGoc;
        this.donGia = donGia;
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
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
        return "HoaQua{" + "ma=" + ma + ", ten=" + ten + ", nguonGoc=" + nguonGoc + ", donGia=" + donGia + ", loai=" + loai + '}';
    }

    public void inThongTin(){
        System.out.println("HoaQua{" + "ma=" + ma + ", ten=" + ten + ", nguonGoc=" + nguonGoc + ", donGia=" + donGia + ", loai=" + (loai==1?"Thuong":"VIP") + '}');
        
    }

    
}
