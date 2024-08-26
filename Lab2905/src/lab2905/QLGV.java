/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLGV {

    ArrayList<GiaoVien> _lstGiaoVien = new ArrayList<>();
    GiaoVien _GV;
    Scanner _sc = new Scanner(System.in);

    // Fake data
    // ctrl cách enter
    public QLGV() {
        _lstGiaoVien.add(new GiaoVien(1, "Dung", 40));
        _lstGiaoVien.add(new GiaoVien(2, "Dung", 20));
        _lstGiaoVien.add(new GiaoVien(4, "Dung", 10));
        _lstGiaoVien.add(new GiaoVien(6, "Dung", 45));
        _lstGiaoVien.add(new GiaoVien(5, "Dung", 21));
        _lstGiaoVien.add(new GiaoVien(3, "Dung", 35));

    }

    public void nhap() {
        String tiepTuc;
        do {
            _GV = new GiaoVien();
            System.out.println("Nhap id giao vien:");
            _GV.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap ten giao vien:");
            _GV.setTen(_sc.nextLine());
            System.out.println("Nhap so gio day:");
            _GV.setSoGioDay(Double.parseDouble(_sc.nextLine()));
            _lstGiaoVien.add(_GV);
            System.out.println("B co muon tiep tuc khong:Co(yes)-Khong(no)");
            tiepTuc = _sc.nextLine();
        } while (tiepTuc.equals("yes"));
    }

    public void xuat() {
        if (_lstGiaoVien.isEmpty()) {
            return;
        }
        for (GiaoVien giaoVien : _lstGiaoVien) {
            giaoVien.inThongTin();
        }
    }

    public void timKiem() {
//        Scanner _sc = new Scanner(System.in);
        System.out.println("Nhap id can tim");
        int iD = Integer.parseInt(_sc.nextLine());

//        for (GiaoVien gv : _lstGiaoVien) {
//        if (gv.getId() == iD) {
//            System.out.println(iD);
//        }
//    }
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getId() == iD) {
                //tim kiem: _lstGiaoVien.get(i): đối tượng GV tại vị trí i
                //tim kiem: _lstGiaoVien.get(i).get(iD): lấy id của đối tượng GV đó

                _lstGiaoVien.get(i).inThongTin();
                return; // Tìm thấy và thoát luôn
            }
        }
        System.out.println("Ko tim thay");
    }

    public void timKiemTheoKhoang() {

        double min = 0, max = 0;
        int count = 0;
        System.out.println("Nhap gia tri min, max");
        min = Double.parseDouble(_sc.nextLine());
        max = Double.parseDouble(_sc.nextLine());
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getSoGioDay() >= min && _lstGiaoVien.get(i).getSoGioDay() <= max) {
                _lstGiaoVien.get(i).inThongTin();
                count++; // tìm thấy thì tăng count lên 1 gt (dùng để đếm số gv có số giờ thỏa mãn)
            }
        }
        if (count == 0) {
            System.out.println("Ko tim thay");
        } else {
            System.out.println("So GV co so gio day thoa man: " + count);
        }

    }

    public void xoa() {
        System.out.println("Nhap id can tim");
        int iD = Integer.parseInt(_sc.nextLine());

//        for (GiaoVien gv : _lstGiaoVien) {
//        if (gv.getId() == iD) {
//            System.out.println(iD);
//        }
//    }
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getId() == iD) {
                //tim kiem: _lstGiaoVien.get(i): đối tượng GV tại vị trí i
                //tim kiem: _lstGiaoVien.get(i).get(iD): lấy id của đối tượng GV đó

                _lstGiaoVien.get(i).inThongTin();
                _lstGiaoVien.remove(i);
                System.out.println("Xoa thanh cong");
                
            }
            return; // Tìm thấy và thoát luôn
        }
        
        System.out.println("Ko tim thay");
        xuat();

    }

    public void sua() {
        // sửa số giờ dạy
        System.out.println("Nhap id can tim");
        int iD = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getId() == iD) {
                _lstGiaoVien.get(i).inThongTin();
                System.out.println("Nhap so gio day moi can sua");
                double gioMoi = Double.parseDouble(_sc.nextLine());
                _lstGiaoVien.get(i).setSoGioDay(gioMoi);
                System.out.println("Sua thanh cong!!!");
                _lstGiaoVien.get(i).inThongTin();
                return;
            }
        }
    }

    public void sapXep() { // sắp xếp theo id
//        Collections.sort(_lstGiaoVien, (a, b) -> (int) (a.getId() - b.getId()));
//        System.out.println("Sap xep theo id");
//        xuat();
    Collections.sort(_lstGiaoVien, new Comparator<GiaoVien>() {
        @Override
        public int compare(GiaoVien o1, GiaoVien o2) {
           
             //  return -Double.compare(o1.getSoGioDay(), o2.getSoGioDay());
             //  return Double.compare(o1.getSoGioDay(), o2.getSoGioDay());
             // return o1.getSoGioDay() > o2.getSoGioDay() ? 1:-1;
           //  return o1.getTen().compareTo(o2.getTen());
             return -o1.getTen().compareTo(o2.getTen());
        }
    });
    xuat();
    }
    public void keThua(){
    GiaoVien gv = new GiaoVienPoly("PTPM",6,"Huyennk6",12);
    gv.inThongTin();
    }
}
