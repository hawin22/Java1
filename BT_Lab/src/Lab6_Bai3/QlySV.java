/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QlySV {
    ArrayList <SinhVien> lstSv = new ArrayList();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        
                SinhVien sv = new SinhVien();
                
                for (int i = 0; i < 5; i++) {
                    System.out.println("Nhap ho ten sv: ");
                    sv.setHoTen(sc.nextLine());
                    System.out.println("Nhap email:");
                    sv.setEmail(sc.nextLine());
                    System.out.println("Nhap sdt: ");
                    sv.setSdt(sc.nextLine());
                    System.out.println("Nhap cmnd: ");
                    sv.setCmnd(sc.nextLine());
        }
       }
}
