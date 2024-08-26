/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi9;

/**
 *
 * @author Hawin
 */
public class SinhVien {
    private String maSV ;
    private String ten;
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int namSinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", ten=" + ten + ", namSinh=" + namSinh + '}';
    }
    
    public void inThongTin(){
        System.out.println("SinhVien{" + "maSV=" + maSV + ", ten=" + ten + ", namSinh=" + namSinh + '}');
    }
}
