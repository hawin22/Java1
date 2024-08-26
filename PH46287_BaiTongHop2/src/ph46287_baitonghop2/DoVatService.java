/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46287_baitonghop2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class DoVatService {

    ArrayList<DoVat> lstDV = new ArrayList();
    Scanner sc = new Scanner(System.in);
    DoVat dv;

    public void nhapTT() {
        
        int tiepTuc;
        do {
            dv = new DoVat();
            System.out.println("Nhap ma: ");
            dv.setMaDoVat(sc.nextLine());
            System.out.println("Nhap ten: ");
            dv.setTenDoVat(sc.nextLine());
            System.out.println("Nhap loai: ");
            dv.setLoai(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap gia: ");
            dv.setGia(Double.parseDouble(sc.nextLine()));
            lstDV.add(dv);
            System.out.println("B co muon nhap tiep ko: 1-Co, 2-Ko");
            tiepTuc = Integer.parseInt(sc.nextLine());

        } while (tiepTuc == 1);

    }

    public void xuat() {
        if (lstDV.isEmpty()) {
            return;
        }
        for (DoVat doVat : lstDV) {
            doVat.inThongTin();
        }
    }

    public void tim() {
        System.out.println("Nhap ma can tim: ");
        String searchMa = sc.nextLine();
        for (int i = 0; i < lstDV.size(); i++) {
            if (lstDV.get(i).getMaDoVat().equalsIgnoreCase(searchMa)) {
                lstDV.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Ko tim thay ma!!!");

    }

    public void xoa() {
        System.out.println("Nhap ten can xoa:");
        String reTen = sc.nextLine();
        for (int i = 0; i < lstDV.size(); i++) {
            if (lstDV.get(i).getTenDoVat().equalsIgnoreCase(reTen)) {
                lstDV.remove(i);
                lstDV.get(i).inThongTin();
            }
        }
    }

    public void SapXep() {
        Collections.sort(lstDV, new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
                return o1.getMaDoVat().compareTo(o2.getMaDoVat());
            }
        });
        xuat();
    }

    public void timTheoKhoangGia() {
        double min = 0, max = 0;
        System.out.println("Nhap 2 moc gia: ");

//        do {
            min = Double.parseDouble(sc.nextLine());
            max = Double.parseDouble(sc.nextLine());
//            if (min > max) {
//                System.out.println("Max phai lon hon min, moi nhap lai");
//            }
//        } while (true);
        for (int i = 0; i < lstDV.size(); i++) {
            if(lstDV.get(i).getGia()>=min&&lstDV.get(i).getGia()<=max){
               lstDV.get(i).inThongTin();
                        
            }
        }
    }
    public void sapXepGiamDan(){
        Collections.sort(lstDV, new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
               return -Double.compare(o1.getGia(), o2.getGia());
            }
        }
        );
        xuat();
    }
    public void keThua(){
        DoHoaPhat dv = new DoHoaPhat("thu","thu","thu",2,15000);
      dv.inThongTin();
    }
}
