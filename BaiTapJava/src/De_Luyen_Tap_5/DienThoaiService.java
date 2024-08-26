/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class DienThoaiService {

    ArrayList<DienThoai> lstDt = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    DienThoai dt = new DienThoai();

    public DienThoaiService() {
        lstDt.add(new DienThoai(01, "SD", "samsung", 15000000, 64));
        lstDt.add(new DienThoai(05, "sa", "iphone", 20000000, 128));
        lstDt.add(new DienThoai(03, "ad", "samsung", 1400000, 45));
        lstDt.add(new DienThoai(04, "bh", "samsung", 1100000, 36));
        lstDt.add(new DienThoai(06, "tf", "oppo", 8000000, 48));
        lstDt.add(new DienThoai(02, "ug", "redme", 9000000, 64));
    }

    public String kiemTraDauVao(String msg, String pattern) {
        String input;

        do {
            System.out.println("Nhap " + msg + " : ");
            input = sc.nextLine();
            if (!input.matches(pattern)) {
                System.out.println("Moi nhap lai: ");
            }
        } while (!input.matches(pattern));
        return input;
    }

    public void nhapTT() {
        int tiepTuc;
        do {
            System.out.println("Nhap ID: ");
            dt.setID(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap seri: ");
            dt.setSeri(sc.nextLine());
            System.out.println("Nhap ten: ");
            dt.setTen(sc.nextLine());
//            System.out.println("Nhap gia: ");
            dt.setGia(Integer.parseInt(kiemTraDauVao("gia", "^[^0][0-9]+$")));
//          dt.setGia(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap dung luong: ");
            dt.setDungLuong(Integer.parseInt(sc.nextLine()));
            lstDt.add(dt);
            System.out.println("B co muon nhap tiep ko : 1-Co, 2-Ko");
            tiepTuc = Integer.parseInt(sc.nextLine());
        } while (tiepTuc == 1);

    }

    public void xuatTT() {
        if (lstDt.isEmpty()) {
            return;
        }
        for (DienThoai dienThoai : lstDt) {
            dienThoai.inThongTin();
        }
    }

    public void hienThiSa() {
        int dem = 0;
        for (int i = 0; i < lstDt.size(); i++) {
            if (lstDt.get(i).getTen().toLowerCase().startsWith("sa")) {
                lstDt.get(i).inThongTin();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Ko tim thay!!!");
        }
    }

    public void tim1() {
        String searchTen;
        int count = 0;
        System.out.println("Nhap ten can tim: ");
        searchTen = sc.nextLine();
        for (int i = 0; i < lstDt.size(); i++) {
//            if (lstDt.get(i).getTen().equalsIgnoreCase(searchTen)) {
//                lstDt.get(i).inThongTin();
//                count++;
//            }
            if (tim(lstDt.get(i).getTen(), searchTen)) {
                lstDt.get(i).inThongTin();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ko tim thay!!!");
        }
    }

    public boolean tim(String s, String t) {
        if (s.equalsIgnoreCase(t)) {
            return true;
        } else {
            return false;
        }
    }

    public void tim2() {
        int searchID;
        int count = 0;
        System.out.println("Nhap id can tim: ");
        searchID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstDt.size(); i++) {
//            if (lstDt.get(i).getID() == searchID) {
//                lstDt.get(i).inThongTin();
//                count++;
//            }
            if (tim(lstDt.get(i).getID(), searchID) == 1) {
                lstDt.get(i).inThongTin();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ko tim thay!!!");
        }
    }

    public int tim(int s, int t) {
        if (s == t) {
            return 1;
        } else {
            return 2;
        }
    }
//    public int count(){
//       for (int i = 0; i < lstDt.size(); i++) {
//            if (lstDt.get(i).getID() == searchID) {
//                
//            }
//    }

    public void xoa() {
//        String reSeri;
//        System.out.println("Nhap seri can xoa: ");
//        reSeri = sc.nextLine();
        String reSeri = seRi();
        for (int i = 0; i < lstDt.size(); i++) {
            if (lstDt.get(i).getSeri().equalsIgnoreCase(reSeri)) {
                lstDt.get(i).inThongTin();
                lstDt.remove(i);
                System.out.println("Da xoa thanh cong");
                return;
            }
        }
        System.out.println("Ko tim thay!!!");
        xuatTT();
    }

    public String seRi() {
        String moSeri;
        System.out.println("Nhap seri can xoa: ");
        moSeri = sc.nextLine();
        return moSeri;
    }
//
//    public boolean xoa1(String sr, String searchsr) {
//        if (sr.equalsIgnoreCase(searchsr)) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public void sapXepG() {
        Collections.sort(lstDt, new Comparator<DienThoai>() {
            @Override
            public int compare(DienThoai o1, DienThoai o2) {
                return -o1.getTen().compareTo(o2.getTen());
            }
        }
        );
        xuatTT();
    }

    public void sapXepT() {
        Collections.sort(lstDt, new Comparator<DienThoai>() {
            @Override
            public int compare(DienThoai o1, DienThoai o2) {
                return Integer.compare(o1.getGia(), o2.getGia());
            }
        }
        );
        xuatTT();
    }

    public void xuatDL() {
//        int count = 0;
//        for (int i = 0; i < lstDt.size(); i++) {
//            if (lstDt.get(i).getDungLuong() == 64 || lstDt.get(i).getDungLuong() == 128) {
//                lstDt.get(i).inThongTin();
//                count++;
//            }
//        }
//        if (count == 0) {
//            System.out.println("Ko tim thay!!!");
//        }
    }

    public void xuatDl() {
        ArrayList<DienThoai> newList = getXuatDl();
        if (newList.isEmpty()) {
            System.out.println("Ko tim thay!!");
            return;
        }
        for (DienThoai dienThoai : newList) {
            dienThoai.inThongTin();
        }
    }

    public ArrayList<DienThoai> getXuatDl() {
        ArrayList<DienThoai> list = new ArrayList<>();
        for (int i = 0; i < lstDt.size(); i++) {
            if (lstDt.get(i).getDungLuong() == 64 || lstDt.get(i).getDungLuong() == 128) {
                list.add(lstDt.get(i));
            }
        }
        return list;
    }
    
   

    public void minMax() {
        int min = lstDt.get(0).getGia(), max = lstDt.get(0).getGia();
        for (int i = 0; i < lstDt.size(); i++) {
            if (min > lstDt.get(i).getGia()) {
                min = lstDt.get(i).getGia();
            }
        }
        for (int i = 0; i < lstDt.size(); i++) {
            if (min == lstDt.get(i).getGia()) {
                lstDt.get(i).inThongTin();
            }
        }
        for (int i = 0; i < lstDt.size(); i++) {
            if (max < lstDt.get(i).getGia()) {
                max = lstDt.get(i).getGia();
            }
        }
        for (int i = 0; i < lstDt.size(); i++) {
            if (max == lstDt.get(i).getGia()) {
                lstDt.get(i).inThongTin();
            }
        }
    }

    public void timKiemTrongKhoang() {
        int count = 0;
        int min = 0, max = 0;
        System.out.println("Nhap min: ");
        min = Integer.parseInt(sc.nextLine());
        do {
            System.out.println("Nhap max: ");
            max = Integer.parseInt(sc.nextLine());
            if (min < max) {
                break;

            } else {
                System.out.println("Max phai lon hon min!!!. Moi nhap lai max ");
            }
        } while (true);
        for (int i = 0; i < lstDt.size(); i++) {
            if (lstDt.get(i).getGia() >= min && lstDt.get(i).getGia() <= max) {
                lstDt.get(i).inThongTin();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ko tim thay!!!");
        }
    }

    public void keThua() {
        IPhone ip = new IPhone("Trang", 2, "thu", "pro max", 15000000, 126);
        IPhone ip1 = new IPhone();
        System.out.println("Nhap ID: ");
        ip1.setID(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap seri: ");
        ip1.setSeri(sc.nextLine());
        System.out.println("Nhap ten: ");
        ip1.setTen(sc.nextLine());
        System.out.println("Nhap gia: ");
        ip1.setGia(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap dung luong: ");
        ip1.setDungLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap mau sac: ");
        ip1.setMauSac(sc.nextLine());
        ip1.inThongTin();
        ip.inThongTin();
        
    }
}
