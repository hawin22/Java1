/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Ha Thanh
 */
public class TruongPhuong extends NhanVien{
    public double trachNhiem;
    NhanVien tp = new NhanVien() {
        @Override
        public double thuNhap() {
            return tp.getLuong() + trachNhiem;
        }
    }

    public TruongPhuong() {
    }

    public TruongPhuong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    

    
    public void xuatTT(){
        System.out.println("Nhan vien truong phong");
        super.xuatTT();
        System.out.println("Luong trach nhiem: "+trachNhiem);
    }
    
    
}
