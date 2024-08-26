/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap2;

import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class QLP {
    ArrayList<Phong> listPhong = new ArrayList<>();
    public QLP(){
        listPhong.add(new Phong(1,"Hà Nội", "Phòng đơn"));
        listPhong.add(new Phong(2,"Thái Bình", "Phòng kép"));
        listPhong.add(new Phong(3,"Hà Nội", "Phòng kép"));
        listPhong.add(new Phong(4,"Nam Định", "Phòng đơn"));
    }
     ArrayList<Phong> getListNhanVien() {

        return listPhong;
    }
}
