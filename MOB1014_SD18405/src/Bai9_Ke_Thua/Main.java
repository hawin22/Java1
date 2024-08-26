/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author Hawin
 */
public class Main {
    public static void main(String[] args) {
       
    
    // Tạo đối tượng có tham số(ctor)
        GiangVien gv = new GiangVien("DUNGNA29","dungna29@fe.edu.vn","Anh Dung",2000,1);
        gv.inThongTin();
    // Tạo ctor ko có tham số
    GiangVien gvFPT = new GiangVien();
    gvFPT.setAccount("MINHDQ8");
    gvFPT.setMailFE("minhdq8@fe.edu.vn");
    gvFPT.setTen("Minh");
    gvFPT.setNamSinh(2001);
    gvFPT.setGioiTinh(1);
    gvFPT.inThongTin();
    
    
    Nguoi sv = new SinhVien();
    Nguoi gvfpt = new GiangVien();
    Nguoi nv = new NhanVien();
    
    }
    
}