/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap4_De01;

import java.io.Serializable;

/**
 * 1. Dựng giao diện như hình
 
2. Tạo class SinhVien gồm các thuộc tính maSV - String, tenSV - String, gioiTinh - String, namSinh - Integer và các constructor, getter, setter
Tạo Class SinhVienService sử dụng List<SinhVien> gồm các chức năng theo yêu cầu của menu
Khi mở form: 
●	Load mặc định 5 phần tử lên JTable (STT, Mã SV, Tên SV, Giới Tính, Tuổi) (2 điểm)
●	Hiển thị giá trị của phần tử cuối cùng lên các ô JTextfield (0.5 điểm)
●	Chọn 1 dòng trên Table, load dữ liệu dòng đó lên form. (0.5 điểm)
●	Năm sinh gồm 2000 - 2023
Khi nhấn nút Xoá : Xoá ngay lập tức dòng vừa được chọn ra khỏi table. 
Khi nhấn nút Ghi file (2 điểm)
●	Thêm thành công ngay dưới table (1 điểm)
●	Ghi vào file (1 điểm)
Khi nhấn nút Mở file (1 điểm)
●	Trên table chỉ hiển thị các bản ghi có trong file vừa đọc
Tất cả các button đều có confirm và  thông báo (0.5 Điểm)
Validate: (0.5 Điểm)
●	Check trống và hiển thị thông báo lỗi 

 * 
 *
 * @author Hawin
 */
public class SinhVien implements Serializable{
    private String maSV;
    private String tenSV;
    private String gioiTinh;
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String gioiTinh, int namSinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", gioiTinh=" + gioiTinh + ", namSinh=" + namSinh + '}';
    }
    
}
