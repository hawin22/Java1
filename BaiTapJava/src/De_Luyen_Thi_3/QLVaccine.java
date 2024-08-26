/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Thi_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLVaccine {

    ArrayList<Vaccine> lstVC = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Vaccine vc;

    public QLVaccine() {
        lstVC.add(new Vaccine("01", "dhf", 21, "fkfj"));
        lstVC.add(new Vaccine("hsdcVNs", "adf", 31, "fdj"));
        lstVC.add(new Vaccine("06", "mhf", 13, "nkfj"));
        lstVC.add(new Vaccine("sdxVNk", "sxcf", 11, "fgdj"));
        lstVC.add(new Vaccine("03", "rs", 64, "zxdj"));
    }

    public void nhapTT() {
        int tiepTuc;
        do {
            vc = new Vaccine();
            System.out.println("Nhap ma vc: ");
            vc.setMaVC(sc.nextLine());
            System.out.println("Nhap ten vc: ");
            vc.setTenVC(sc.nextLine());
            System.out.println("Nhap thoi gian td: ");
            vc.setThoigianTD(Float.parseFloat(sc.nextLine()));
            System.out.println("Nhap ngay het td: ");
            vc.setNgayHetTD(sc.nextLine());
            lstVC.add(vc);
            System.out.println("B co muon nhap tiep ko : 1-Co,2-Ko");
            tiepTuc = Integer.parseInt(sc.nextLine());

        } while (tiepTuc == 1);

    }

    public void xuat() {
        if (lstVC.isEmpty()) {
            return;
        }
        for (Vaccine vaccine : lstVC) {
            vaccine.inThongTin();
        }
    }

    public void xuatVaDem() {
        int d = 0;
        for (int i = 0; i < lstVC.size(); i++) {
            if (lstVC.get(i).getThoigianTD() >= 6) {
                lstVC.get(i).inThongTin();
                d++;
            }
        }
        if (d == 0) {
            System.out.println("KO tim thay");
        } else {
            System.out.println("Cac vc co tg td>=6 thang: " + d);
        }
    }

    public void sapXep() {
        System.out.println("Sap xep giam dan!!!");
        Collections.sort(lstVC, new Comparator<Vaccine>() {
            @Override
            public int compare(Vaccine o1, Vaccine o2) {
                return -Float.compare(o1.getThoigianTD(), o2.getThoigianTD());
            }
        }
        );
        xuat();
    }

    public void xuatMaChua() {
        int dem = 0;
        for (int i = 0; i < lstVC.size(); i++) {
            if (lstVC.get(i).getMaVC().contains("VN")) {
                lstVC.get(i).inThongTin();
                dem++;
            }
        }
        if (dem == 0) {
        System.out.println("Ko tim thay");
        }
    }
    public void min() {
        float min = lstVC.get(0).getThoigianTD();
        for (int i = 0; i < lstVC.size(); i++) {
            if (min > lstVC.get(i).getThoigianTD()) {
                min = lstVC.get(i).getThoigianTD();

            }
        }
        for (int i = 0; i < lstVC.size(); i++) {
            if (min == lstVC.get(i).getThoigianTD()) {
                System.out.println("Vi tri: " + i);
                lstVC.get(i).inThongTin();
            }
        }
    }

    public void keThua() {
        VaccineVN vc1 = new VaccineVN();
        System.out.println("Moi nhap ma vc");
        vc1.setMaVC(sc.nextLine());
        System.out.println("Nhap ten vc: ");
        vc1.setTenVC(sc.nextLine());
        System.out.println("Nhap thoi gian td: ");
        vc1.setThoigianTD(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhap ngay het td: ");
        vc1.setNgayHetTD(sc.nextLine());
        System.out.println("Nhap ma QG: ");
        vc1.setQuocGia(sc.nextLine());
        vc1.inThongTin();

    }
}
