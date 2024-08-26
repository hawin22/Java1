/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap3;

/**
 * Tạo Class SanPham :  maSP,tenSP,gia,danhMuc
 
 Khi mở form load được table
-Chọn 1 dòng trên JTable, hiển thị dữ liệu lên form.
 Khi nhấn nút Thêm: 
-Check form: rỗng, đơn giá là số , đơn giá > 0
-Thêm mới đối tượng vào List, hiển thị lại table.
Khi nhấn nút Sửa:
-Check form: rỗng, đơn giá là số , đơn giá > 0
-Sửa đối tượng theo dòng đã chọn , hiển thị lại table.

 *
 * @author Hawin
 */
public class SanPham {
        private String maSP;
        private String tenSP;
        private double gia;
        private String danhMuc;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double gia, String danhMuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.danhMuc = danhMuc;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", gia=" + gia + ", danhMuc=" + danhMuc + '}';
    }
        
        
}
