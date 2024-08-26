/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_QL_Oto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QL_OTO {

    // Biến toàn cục( thêm dấu _ để phân biệt với biến cục bộ
    ArrayList<Oto> _LstOto = new ArrayList<>(); //List oto
    Oto _oto;                                    // đối tượng oto
    Scanner _sc = new Scanner(System.in); // Scanner

    public void nhapDS() {
        String tiepTuc;
        do {
            // 1. Khởi tạo đối tượng 
            _oto = new Oto();
            // 2. Nhập thông tin đối tượng
            System.out.println("Nhap id:");
            _oto.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap hang:");
            _oto.setHang(_sc.nextLine());
            System.out.println("Nhap gia:");
            _oto.setGia(Double.parseDouble(_sc.nextLine()));
            System.out.println("Nhap nam san xuat:");
            _oto.setNamSx(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap trang thai:");
            _oto.setTrangThai(Integer.parseInt(_sc.nextLine()));
            
            // 3. Thêm đối tượng vào danh sách
               _LstOto.add(_oto);
  
            // 4. Hỏi ng dùng có muốn tiếp tục nhập ko
            System.out.println("Co muon tiep tuc ko (yes/no)?");
            tiepTuc = _sc.nextLine();
           
        } while (tiepTuc.equals("yes"));
        // equals : so sánh 2 chuỗi với nhau, có phân biệt chữ viết hoa thường
            

    }

    public void xuatDX() {
        // isEmpty: kiểm tra xem còn trống hay ko
        if(_LstOto.isEmpty()){
            System.out.println("Danh sach trong!");
            return;
        }
        
        for (Oto oto : _LstOto) {
            oto.inThongTin();
        }
    }
    
    public void tinhTB(){
        nhapDS();
   double tong = 0;
        for (Oto oto : _LstOto) {
            tong +=oto.getGia();
        }
        System.out.println("TB gia:"+(tong/_LstOto.size()));
    }

}
