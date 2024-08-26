/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> lstSP = new ArrayList();
        int n;
        System.out.println("Nhap so luong sp : ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            lstSP.add(sp);
        }
        for (SanPham sanPham : lstSP) {
            if (sanPham.getHang().equals("nokia")) {
                sanPham.xuat();
                System.out.println("");
            }
        }
    }
}
