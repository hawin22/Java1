/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_Thu;

/**
 *
 * @author Hawin
 */
public class SinhVien {

    private int MaSV;
    private String ten;
    private int namSinh;
    private double diemCsharp;

    public SinhVien() {
    }

    public SinhVien(int MaSV, String ten, int namSinh, double diemCsharp) {
        this.MaSV = MaSV;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diemCsharp = diemCsharp;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemCsharp() {
        return diemCsharp;
    }

    public void setDiemCsharp(double diemCsharp) {
        this.diemCsharp = diemCsharp;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MaSV=" + MaSV + ", ten=" + ten + ", namSinh=" + namSinh + ", diemCsharp=" + diemCsharp + '}';
    }

    public void inThongTin() {
        System.out.println("SinhVien{" + "MaSV=" + MaSV + ", ten=" + ten + ", namSinh=" + namSinh + ", diemCsharp=" + diemCsharp + '}');

    }

}
