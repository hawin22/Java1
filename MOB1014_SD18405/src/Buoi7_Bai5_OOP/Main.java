/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7_Bai5_OOP;

/**
 *
 * @author Hawin
 */
public class Main {
    public static void main(String[] args) {
        // 1. Khai báo đối tượng
        SinhVien sv ;
        // 2. Khởi tạo đối tượng
        sv = new SinhVien();
        SinhVien sinhVien = new SinhVien();
        // 2.1 Construtor ko có tham số
        
        
        SinhVien svPoly = new SinhVien();
        // 2.2 Construtor có tham số
        SinhVien svFPT = new SinhVien("PH12345","Linh",2004,9,1);
        // 3. Gán các gt cho svPoly => Setter
        svPoly.setMsv("PH45667");
        svPoly.setTen("Quang");
        svPoly.setNamSinh(2000);
        svPoly.setDiem(9);
        svPoly.setGioiTinh(1);
        System.out.println("Xin chao "+ svPoly.getTen());
       // 4. Gọi phương thức inthongtin()
       svPoly.inthongtin();
       svFPT.inthongtin();
        
        
    }
}
