/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author Hawin
 */
public class TiepThi extends NhanVien{
    private double doanhSo, hoaHong;

    public TiepThi() {
    }
    

    public TiepThi(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(double doanhSo, double hoaHong, String manv, String hoten, double luong) {
        super(manv, hoten, luong);
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
    public String toString() {
        return "TiepThi{" + "doanhSo=" + doanhSo + ", hoaHong=" + hoaHong + '}';
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap(); 
        
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("TiepThi{" + "doanhSo=" + doanhSo + ", hoaHong=" + hoaHong + '}');
        System.out.println("Thu nhap: "+(luong+doanhSo+hoaHong));
    }
    
    
   
    
}
