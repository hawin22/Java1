/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_4;

/**
 *
 * @author Hawin
 */
public class Sach {
    private String code, ten, theLoai;
    private int namXuatBan;
    private String nhaXuatBan;
    private double gia;

    public Sach() {
    }
    

    public Sach(String code, String ten, String theLoai, int namXuatBan, String nhaXuatBan, double gia) {
        this.code = code;
        this.ten = ten;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.nhaXuatBan = nhaXuatBan;
        this.gia = gia;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" + "code=" + code + ", ten=" + ten + ", theLoai=" + theLoai + ", namXuatBan=" + namXuatBan + ", nhaXuatBan=" + nhaXuatBan + ", gia=" + gia + '}';
    }
    public void inThongTin(){
        System.out.println("Sach{" + "code=" + code + ", ten=" + ten + ", theLoai=" + theLoai + ", namXuatBan=" + namXuatBan + ", nhaXuatBan=" + nhaXuatBan + ", gia=" + gia + '}');
        
    }
    
    
}
