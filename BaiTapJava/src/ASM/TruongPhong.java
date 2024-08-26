/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author Hawin
 */
public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(double trachNhiem, String manv, String hoten, double luong) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public String toString() {
        return "TruongPhong{" + "trachNhiem=" + trachNhiem + '}';
    }
    

    @Override
    public double getThuNhap() {
        return super.getThuNhap();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("TruongPhong{" + "trachNhiem=" + trachNhiem + '}');
        System.out.println("Thu nhap: "+super.getThuNhap()+trachNhiem);
    }
    
}
