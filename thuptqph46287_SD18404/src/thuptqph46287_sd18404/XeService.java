/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuptqph46287_sd18404;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class XeService {

    ArrayList<Xe> lstxe = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public XeService(){
    lstxe.add(new Xe("fd","fvdc","den",12));
    lstxe.add(new Xe("xd","xscc","trang",11));
    lstxe.add(new Xe("ew","xcc","do",15));
    lstxe.add(new Xe("ax","fac","nau",10));
    lstxe.add(new Xe("qw","fc","cam",9));
    lstxe.add(new Xe("lo","qdc","den",19));
    }
    public void nhap() {
        Xe xe = new Xe();
        do {
            xe.nhapTT();
            lstxe.add(xe);
            System.out.println("B co muon nhap tiep ko: ");
        } while (sc.nextLine().equalsIgnoreCase("yes"));
        
    }

    public void xuat() {
        for (Xe xe : lstxe) {
            xe.inThongTin();
        }
    }

    public void xoa() {
        String reMa;
        System.out.println("Nhap ma xe can xoa: ");
        reMa = sc.nextLine();
        for (int i = 0; i < lstxe.size(); i++) {
            if (lstxe.get(i).getMaXe().equalsIgnoreCase(reMa)) {
                lstxe.remove(i);
                lstxe.get(i).inThongTin();
            }
        }
        System.out.println("Ko tim thay ma can xoa!!");
    }

    public void timTheoKhoang() {
        double min = 0, max = 0;
        
        System.out.println("Nhap min: ");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap max: ");
        max = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < lstxe.size(); i++) {
            if (lstxe.get(i).getGia() >= min && lstxe.get(i).getGia() <= max) {
                lstxe.get(i).inThongTin();
            }
        }
        
    }

    public void keThua() {
        XeOto oTo = new XeOto(100, "hfhdv", "dfhv", "den", 720000000);
        
    }
}
