/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Ha Thanh
 */
public class TiepThi extends NhanVien{
    public double doanhSo;
    public double hoaHong;
    

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hoaHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double thuNhap() {
        return super.thuNhap()+doanhSo+hoaHong; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public  void xuatTT(){
        System.out.println("Nhan vien tiep thi");
        super.xuatTT();
        System.out.println("Doanh so: "+doanhSo);
        System.out.println("Luong hoa hong: "+hoaHong);
    }
    
    
    
    
}
