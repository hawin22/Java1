/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLSV {
    // 1. Khởi tạo 
       ArrayList<SinhVien> _LstSinhVien= new ArrayList<>();
       SinhVien _SV;
       Scanner _sc = new Scanner(System.in);
       public void nhapTT(){
       String tiepTuc;
           do {
               _SV = new SinhVien(); // 1. Khởi tạo đối tượng
               // 2. Nhập thông tin đối tượng
               System.out.println("Nhap maSV:");
               _SV.setMaSV(_sc.nextLine());
               System.out.println("Nhap ten:");
               _SV.setTen(_sc.nextLine());
               System.out.println("Nhap nam sinh:");
               _SV.setNamSinh(Integer.parseInt(_sc.nextLine()));
               // 3.Thêm đối tượng vào danh sách
               _LstSinhVien.add(_SV);
               // 4. Hỏi xem ng dùng có muốn tiếp tục nhập nữa ko
               System.out.println("Co muon tiep tuc ko(Yes/No)??");
               tiepTuc = _sc.nextLine();
               
           } while (tiepTuc.equals("Yes"));
       }
       public void xuatTT(){
           if(_LstSinhVien.isEmpty()){
           return;
           }
           for (SinhVien sinhVien : _LstSinhVien) {
               sinhVien.inThongTin();
           }
       }
       public void tuoi(){
       int tuoi ;
       tuoi = 2023-_SV.getNamSinh();
       if(tuoi>20){
           for (SinhVien sinhVien : _LstSinhVien) {
               System.out.println(sinhVien);
           }
       }
       }
               
   
       
}
