/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author Hawin
 */
public class NhanVien extends Nguoi {
    private String msv;
    private String chucVu;

    public NhanVien() {
    }

    public NhanVien(String msv, String chucVu) {
        this.msv = msv;
        this.chucVu = chucVu;
    }

    public NhanVien(String msv, String chucVu, String ten, int namSinh, int gioiTinh) {
        super(ten, namSinh, gioiTinh);
        this.msv = msv;
        this.chucVu = chucVu;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "msv=" + msv + ", chucVu=" + chucVu + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("NhanVien{" + "msv=" + msv + ", chucVu=" + chucVu + '}');
    }
    
    
    
    
    
    
    
}
