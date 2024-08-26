/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Mang;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bt1_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa hoc:");
        String toa = sc.nextLine();
        System.out.println("Nhap tang hoc:");
        int tang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so phong hoc tai tang "+tang+" toa " + toa);
        int soPhong = Integer.parseInt(sc.nextLine());
        int [] arrPhong = new int[soPhong];
        System.out.println("*****Nhap mang*****");
        for (int i = 0; i < arrPhong.length; i++) {
            System.out.println("Nhap Sv phong "+ toa+tang+(i+1)+"=");
            arrPhong[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("*****Xuat*****");
        for (int i = 0; i < arrPhong.length; i++) {
            System.out.println("SV phong "+ toa + tang+ (i+1)+"="+arrPhong[i]);
            
        }
    }
    
}
