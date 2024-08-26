/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author Hawin
 */
public class SinhVien extends Nguoi {
    private String msv;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String msv, double diem) {
        this.msv = msv;
        this.diem = diem;
    }

    public SinhVien(String msv, double diem, String ten, int namSinh, int gioiTinh) {
        super(ten, namSinh, gioiTinh);
        this.msv = msv;
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", diem=" + diem + '}';
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("SinhVien{" + "msv=" + msv + ", diem=" + diem + '}');
    }
     
    
}
