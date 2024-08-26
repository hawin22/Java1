/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap3;

import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class QLSP {
    
    ArrayList<SanPham> listSanPham = new ArrayList<>();

    public QLSP() {
        listSanPham.add(new SanPham("SP01", "SamSung", 8200000, "Điện thoại"));
        listSanPham.add(new SanPham("SP02", "HP", 18200000, "Laptop"));
        listSanPham.add(new SanPham("SP03", "SamSung", 8700000, "Máy tính bảng"));
        listSanPham.add(new SanPham("SP04", "Iphone", 2200000, "Điện thoại"));
        listSanPham.add(new SanPham("SP05", "Acer", 19900000, "Laptop"));
    }
    ArrayList<SanPham> getListSanPham(){
        return listSanPham;
    }
}
