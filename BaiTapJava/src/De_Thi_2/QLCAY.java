/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Thi_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLCAY {

    ArrayList<Cay> _lstCay = new ArrayList();
    Cay _cay;
    Scanner _sc = new Scanner(System.in);

    public QLCAY() {
        _lstCay.add(new Cay(1, "an qua", "tao"));
        _lstCay.add(new Cay(3, "an qua", "dua"));
        _lstCay.add(new Cay(4, "hoa", "dao"));
        _lstCay.add(new Cay(2, "leo", "do"));
    }

    public void nhapDS() {
        String tiepTuc;
        do {
            _cay = new Cay();
            System.out.println("Nhap id : ");
            _cay.setID(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap loai cay: ");
            _cay.setLoaiCay(_sc.nextLine());
            System.out.println("Nhap ten cay:");
            _cay.setTen(_sc.nextLine());
            System.out.println("B co muon nhap tiep ko");
            tiepTuc = _sc.nextLine();

        } while (tiepTuc.equalsIgnoreCase("yes"));

    }

    public void xuat() {
        if (_lstCay.isEmpty()) {
            return;
        }
        for (Cay cay : _lstCay) {
            cay.inThongTin();
        }

    }

    public void sapXep() {
        Collections.sort(_lstCay, new Comparator<Cay>() {
            @Override
            public int compare(Cay o1, Cay o2) {
                return -Integer.compare(o1.getID(), o2.getID());
            }
        });

        xuat();
    }

    public int reID() {
        System.out.println("Nhap id cua doi tuong can xoa:");
        int iD = Integer.parseInt(_sc.nextLine());
        return iD;
    }

    public void xoa() {
        int id = reID();
        int count=0;
        for (int i = 0; i < _lstCay.size(); i++) {      
            if (_lstCay.get(i).getID() == id) {
                _lstCay.get(i).inThongTin();
                _lstCay.remove(i);
                count++;
                System.out.println("Xoa thanh cong");
                return;
            }
        }
        if(count==0){
            System.out.println("Ko tim thay!!!");
        }
    }

    public void keThua() {
        Cay cay = new CayAnQua(3, 01, "than leo", "do");
        cay.inThongTin();
    }
}
