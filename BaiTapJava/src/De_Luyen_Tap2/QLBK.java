/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLBK {

    ArrayList<BanhKeo> lstbk = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    BanhKeo bk;

    public QLBK() {
        lstbk.add(new BanhKeo(1, 5, "dcs", "sd", 52, true));
        lstbk.add(new BanhKeo(2, 55, "fd", "sd", 62, false));
        lstbk.add(new BanhKeo(3, 12, "Ccs", "sd", 72, true));
        lstbk.add(new BanhKeo(4, 19, "dcs", "sd", 12, false));
        lstbk.add(new BanhKeo(5, 36, "ccs", "sd", 72, false));
        lstbk.add(new BanhKeo(6, 67, "dcs", "sd", 25, true));
    }

    public void nhap() {
        String tiepTuc;
        do {
            bk = new BanhKeo();

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap code: ");
            bk.setCode(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap ten BK:");
            bk.setTenBK(sc.nextLine());
            System.out.println("Nhap ten hang sx: ");
            bk.setTenHangSX(sc.nextLine());
            System.out.println("Nhap so luong: ");
            bk.setSoLuong(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap gia : ");
            bk.setGia(Double.parseDouble(sc.nextLine()));
            System.out.println("Nhap trang thai: ");
            bk.setTrangThai(Boolean.parseBoolean(sc.nextLine()));
            lstbk.add(bk);
            System.out.println("B co muon tiep tuc ko ");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("yes"));
    }

    public void xuat() {
        if (lstbk.isEmpty()) {
            return;
        }
        for (BanhKeo banhKeo : lstbk) {
            banhKeo.inThongTin();
        }
    }

    public void xuatConHan() {

        for (int i = 0; i < lstbk.size(); i++) {
            if (lstbk.get(i).isTrangThai()) {
                lstbk.get(i).inThongTin();
            }
        }
    }

    public void sapXepGiam() {
        Collections.sort(lstbk, new Comparator<BanhKeo>() {
            @Override
            public int compare(BanhKeo o1, BanhKeo o2) {
                return -Integer.compare(o1.getSoLuong(), o2.getSoLuong());
            }
        }
        );
    }

    public void sapXepTang() {
        Collections.sort(lstbk, new Comparator<BanhKeo>() {
            @Override
            public int compare(BanhKeo o1, BanhKeo o2) {
                return o1.getTenHangSX().compareTo(o2.getTenHangSX());
            }
        }
        );
    }

    public void tim() {
        System.out.println("Nhap code can tim: ");
        int searchCode = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstbk.size(); i++) {
            if (lstbk.get(i).getCode() == searchCode) {
                lstbk.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Ko tim thay code!!!");
    }

    public void xuatC() {
        for (int i = 0; i < lstbk.size(); i++) {
            if (lstbk.get(i).getTenBK().toUpperCase().startsWith("C")) {
                lstbk.get(i).inThongTin();
            }
        }
        System.out.println("Ko tim thay");
    }

    public void xoa() {
        int count = 0;
        System.out.println("Nhap code can xoa: ");
        int removeCode = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstbk.size(); i++) {
            if (lstbk.get(i).getCode() == removeCode) {
                lstbk.remove(i);
                count++;
                System.out.println("Da xoa thanh cong");
                return;
            }
        }
        if (count==0) {
              System.out.println("Ko tim thay code");
        }
    }

    public void xuatSL() {
        int dem = 0;
        for (int i = 0; i < lstbk.size(); i++) {
            if (lstbk.get(i).getSoLuong() >= 50) {
                lstbk.get(i).inThongTin();
                dem++;

            }
        }
        if (dem == 0) {

            System.out.println("Ko tim thay");
        } else {
            System.out.println("So banh keo co so luong>=50" + dem);
        }
    }

    public void capNhat() {
        System.out.println("Nhap code can cap nhat: ");
        int reCode = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstbk.size(); i++) {
            if (lstbk.get(i).getCode() == reCode) {
                lstbk.get(i).inThongTin();
                System.out.println("Cap nhat:1-ten, 2-gia,3-so luong,4-trang thai ");
                System.out.println("Moi chon:");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("Nhap trang thai ms:");
                        lstbk.get(i).setTrangThai(Boolean.parseBoolean(sc.nextLine()));
                        break;
                    default:

                }

                lstbk.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Ko tim thay!!!");
    }

    public void maxGia() {
        //Tìm vị trí của bánh kẹo có giá Max
        double max = lstbk.get(0).getGia();
        int viTri = 0;
        for (int i = 0; i < lstbk.size(); i++) {
            if (max < lstbk.get(i).getGia()) {
                max = lstbk.get(i).getGia();

            }
        }
        for (int i = 0; i < lstbk.size(); i++) {
            if (lstbk.get(i).getGia() == max) {
                System.out.println("Vi tri: " + i);
                System.out.println("Max: " + max);
            }
        }

    }

    public void keThua() {

        BanhKeo banh = new BanhTrungThu("dau xanh", 1, 5, "fcx", "fcx", 542, true);
        banh.inThongTin();
    }
}
