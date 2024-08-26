/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Kiem_Tra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLKEM {

    ArrayList<Kem> _lstkem = new ArrayList();
    Scanner _sc = new Scanner(System.in);
    Kem _kem;

    public QLKEM() {
        _lstkem.add(new Kem("01", "thu", 20000, 6));
        _lstkem.add(new Kem("03", "gtfg", 10000, 9));
        _lstkem.add(new Kem("04", "fd", 212000, 1));
        _lstkem.add(new Kem("09", "wdu", 16000, 2));
        _lstkem.add(new Kem("05", "koiu", 10400, 036));
        _lstkem.add(new Kem("02", "sfw", 21000, 11));
    }

    public String kiemTraDauVao(String msg, String pattern) {
        String input;

        do {
            System.out.println("Nhap " + msg + " : ");
            input = _sc.nextLine();
            if (!input.matches(pattern)) {
                System.out.println("Moi nhap lai!!!");
            }

        } while (!input.matches(pattern));
        return input;
    }

    public void nhap() {
        int tiepTuc;
        do {
            _kem = new Kem();
            System.out.println("Nhap ma kem: ");
            _kem.setMa(_sc.nextLine());
            _kem.setTen(kiemTraDauVao("ten", "^[a-zA-Z]+$"));
            System.out.println("Nhap so luong: ");
            _kem.setSoLuong(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap gia: ");
            _kem.setGia(Double.parseDouble(_sc.nextLine()));
            _lstkem.add(_kem);
            System.out.println("B co muon nhap tiep ko: 1-Co, 2-Ko");
            tiepTuc = Integer.parseInt(_sc.nextLine());
        } while (tiepTuc == 1);
    }

    public void xuat() {
        if (_lstkem.isEmpty()) {
            return;
        }
        for (Kem kem : _lstkem) {
            kem.inThongTin();
        }
    }

    public void timKiem() {
        System.out.println("Nhap ma can tim: ");
        String searchMa = _sc.nextLine();
        for (int i = 0; i < _lstkem.size(); i++) {
            if (_lstkem.get(i).getMa().equalsIgnoreCase(searchMa)) {
                _lstkem.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Ko tim thay ma!!!");
    }

    public void sapXep() {
        System.out.println("Sap xep giam dan theo so luong: ");
        Collections.sort(_lstkem, new Comparator<Kem>() {
            @Override
            public int compare(Kem o1, Kem o2) {
                return -Integer.compare(o1.getSoLuong(), o2.getSoLuong());
            }
        }
        );
        xuat();
    }

    public void dem() {
        int dem = 0;
        for (int i = 0; i < _lstkem.size(); i++) {
            if (_lstkem.get(i).getGia() > 15000) {
                _lstkem.get(i).inThongTin();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Ko tim thay");
        } else {
            System.out.println("So kem co gia>15000: " + dem);
        }
    }

    public void viTriMax() {
        double max = _lstkem.get(0).getGia();
        for (int i = 0; i < _lstkem.size(); i++) {
            if (max < _lstkem.get(i).getGia()) {
                max = _lstkem.get(i).getGia();

            }
        }
        for (int i = 0; i < _lstkem.size(); i++) {
            if (max == _lstkem.get(i).getGia()) {
                System.out.println("Vi tri max: " + i);
                System.out.println("Max: " + max);

            }
        }
    }

    public void keThua() {
        KemOcQue kem = new KemOcQue();
        System.out.println("Nhap ma kem: ");
        kem.setMa(_sc.nextLine());
        System.out.println("Nhap ten kem: ");
        kem.setTen(_sc.nextLine());
        System.out.println("Nhap so luong: ");
        kem.setSoLuong(Integer.parseInt(_sc.nextLine()));
        System.out.println("Nhap gia: ");
        kem.setGia(Double.parseDouble(_sc.nextLine()));
        System.out.println("Nhap vi: ");
        kem.setVi(Integer.parseInt(_sc.nextLine()));
        kem.inThongTin();

    }

}
