/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class NhanVien {

    Scanner sc = new Scanner(System.in);
    String maNV;
    String tenNV;
    int ngayCong;
    
    
    void nhapTT() {
        System.out.println("****Nhap tt****");
        System.out.println("Nhap ma nv");
        maNV = sc.nextLine();
        System.out.println("Nhap ten nv");
        tenNV = sc.nextLine();
        System.out.println("Nhap ngay cong");
        ngayCong = sc.nextInt();

    }

    void xuatTT() {
        System.out.println(maNV + "-" + tenNV + "-" + ngayCong);
    }
}
