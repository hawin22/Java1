/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_Ve_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLyHangHoa {

    ArrayList<HangHoa> dshh = new ArrayList();
    Scanner sc = new Scanner(System.in);
   

    public QLyHangHoa() {
        dshh.add(new HangHoa("01", "banh", 2, 32000, 1));
        dshh.add(new HangHoa("04", "my", 1, 82000, 2));
        dshh.add(new HangHoa("03", "gao", 5, 32900, 2));
        dshh.add(new HangHoa("06", "keo", 3, 245000, 1));
        dshh.add(new HangHoa("05", "tom", 8, 320100, 1));
        dshh.add(new HangHoa("02", "son", 6, 252000, 2));
    }

    public void nhap() {

        int n;
        System.out.println("Nhap so luong hh: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            HangHoa hh = new HangHoa();
            hh.nhapTT();
            dshh.add(hh);
            System.out.println();
        }
    }

    public void xuat() {
        for (HangHoa hang : dshh) {
            hang.inThongTin();

        }
    }

    public void capNhat() {
        String ma;
        System.out.println("Nhap ma hang can thay doi: ");
        ma = sc.nextLine();
        for (int i = 0; i < dshh.size(); i++) {
            if (dshh.get(i).getMaHang().equalsIgnoreCase(ma)) {
                HangHoa hang = new HangHoa();
                System.out.println("Thay doi tt nhu sau: ");
                hang.nhapTT();
                dshh.set(i, hang);
            }
        }
    }

    public void tim() {
        String ten;
        System.out.println("Nhap ten hang can tim: ");
        ten = sc.nextLine();
        for (int i = 0; i < dshh.size(); i++) {
            if (dshh.get(i).getTenHang().equals(ten)) {
                System.out.println("Da tim thay ");
                dshh.get(i).inThongTin();
            }
        }
    }

    public void sapXep() {
        Collections.sort(dshh, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return -o1.getTenHang().compareTo(o2.getTenHang());
            }
        });
    }

    public void xoa() {
        System.out.println("Nhap ma hang can xoa: ");
        String ma = sc.nextLine();
        for (int i = 0; i < dshh.size(); i++) {
            if (dshh.get(i).getMaHang().equals(ma)) {
                dshh.get(i).inThongTin();
                dshh.remove(i);
                System.out.println("Da xoa thanh cong!!!");
            }
            break;

        }
        System.out.println("Ko tim thay ma can xoa");
    }

    public void timMax() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < dshh.size(); i++) {
            if (max < dshh.get(i).getDonGia()) {
                max = dshh.get(i).getDonGia();
                index = i;
            }
        }
        System.out.println("Max don gia: ");
        dshh.get(index).inThongTin();
    }

    public void timTheoKhoang() {
        int max = 0, min = 0;
        System.out.println("Nhap 2 moc so luong: ");
        min = Integer.parseInt(sc.nextLine());
        max = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < dshh.size(); i++) {
            if (dshh.get(i).getSoLuong() >= min && dshh.get(i).getSoLuong() <= max) {
                dshh.get(i).inThongTin();
            }
        }
    }
}
