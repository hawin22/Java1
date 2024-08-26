/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Kiem_Tra;

/**
 *
 * @author Hawin
 */
public class Kem {

    private String ma, ten;
    private double gia;
    private int soLuong;

    public Kem() {
    }

    public Kem(String ma, String ten, double gia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Kem{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", soLuong=" + soLuong + '}';
    }

    public void inThongTin() {
        System.out.println("Kem{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", soLuong=" + soLuong + '}');
    }

}
