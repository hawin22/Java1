/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author Hawin
 */
// Lớp cha
public class Nguoi {
    private String ten;
    private  int namSinh;
    private  int gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String ten, int namSinh, int gioiTinh) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", namSinh=" + namSinh + ", gioiTinh=" 
                + gioiTinh + '}';
    }
     
     public void inThongTin(){
         System.out.println("Nguoi{" + "ten=" + ten + ", namSinh=" + namSinh + ","
                 + " gioiTinh=" + (gioiTinh ==1?"Nam":"Nu")+ '}');
     }
    
    
    
    
}
