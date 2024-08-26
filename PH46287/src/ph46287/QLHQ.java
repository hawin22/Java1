/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46287;

import java.security.interfaces.DSAKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLHQ {
    ArrayList<HoaQua> lstHoaQua = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    HoaQua hq ;
    public void nhapDS(){
        String chon;
        do {
            hq = new HoaQua();
            System.out.println("Nhap ma hoa qua: ");
            hq.setMa(sc.nextLine());
            System.out.println("Nhap ten hoa qua: ");
            hq.setTen(sc.nextLine());
            System.out.println("Nhap don gia: ");
            hq.setDonGia(Double.parseDouble(sc.nextLine()));
            System.out.println("Nhap nguon goc: ");
            hq.setNguonGoc(sc.nextLine());
            System.out.println("Nhap loai: ");
            hq.setLoai(Integer.parseInt(sc.nextLine()));
            lstHoaQua.add(hq);
            System.out.println("B co muon nhap tiep ko: ");
            chon = sc.nextLine();
            
        } while(chon.equals("m"));
    }
    public void xuat(){
    if(lstHoaQua.isEmpty()){
        return;
    }
        for (HoaQua hoaQua : lstHoaQua) {
            hoaQua.inThongTin();
        }
    }
    public void sapXep(){
        Collections.sort(lstHoaQua, new Comparator<HoaQua>() {
            @Override
            public int compare(HoaQua o1, HoaQua o2) {
                return -o1.getMa().compareTo(o2.getMa());
            }
        }
        );
    
    }
    public void xoa(){
        System.out.println("Nhap ma can xoa: ");
        String maXoa = sc.nextLine();
        for (int i = 0; i < lstHoaQua.size(); i++) {
            if(lstHoaQua.get(i).getMa().equalsIgnoreCase(maXoa)){
                lstHoaQua.remove(i);
                System.out.println("Da xoa thanh cong!!");
                hq.inThongTin();
               
            }
            return;
        }
        System.out.println("Ko tim thay ma ");
    }
    public void tim(){
    double min, max;
        System.out.println("Nhap 2 moc gia: ");
        min = Double.parseDouble(sc.nextLine());
        max = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < lstHoaQua.size(); i++) {
            if(lstHoaQua.get(i).getDonGia()>=min&&lstHoaQua.get(i).getDonGia()<=max){
                lstHoaQua.get(i).inThongTin();
            }
        }
    }
}
