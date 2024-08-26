/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap5;

import java.io.Serializable;

/*
Xây dựng đúng form 0,5đ
Nút Add : thêm được dữ liệu và hiển thị lên Table 1,5đ
Nút Clear(xoá dữ liệu đang nhập trên form) , Delete(Xoá 1 dòng trong table), Exit (Thoát chương trình)1,5đ
Click 1 trường dữ liệu trong table thì sẽ hiển thị thông tin lên form 1đ
Kiểm tra các Text Field không được để trống, có thông báo 1đ
Kiểm tra miền dữ liệu đúng, có thông báo (Giá vé phải là số thực lớn hơn 0) hoặc email phải có ký tự @, có thông báo khi nhập sai 1đ
Kiểm tra đầy đủ tất cả 0,5đ 
Nút OpenFile: Lấy dữ liệu từ file, sau đó hiển thị lên form, có thông báo 1
Nút SaceFile : Lưu dữ liệu trên table hiển thị vào file, có thông báo 1

 */
/**
 *
 * @author Hawin
 */
public class Cinema implements Serializable{

    private String theLoai;
    private String tenPhim;
    private int giaVe;
    private String email;

    public Cinema() {
    }

    public Cinema(String theLoai, String tenPhim, int giaVe, String email) {
        this.theLoai = theLoai;
        this.tenPhim = tenPhim;
        this.giaVe = giaVe;
        this.email = email;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cinema{" + "theLoai=" + theLoai + ", tenPhim=" + tenPhim + ", giaVe=" + giaVe + ", email=" + email + '}';
    }

}
