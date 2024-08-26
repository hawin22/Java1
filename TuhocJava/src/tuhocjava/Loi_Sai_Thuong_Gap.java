/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuhocjava;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Loi_Sai_Thuong_Gap {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        String hoTen = sc.nextLine();
        System.out.println("Nhap tuoi");
        int tuoi = sc.nextInt();
        sc.nextLine(); // Loại bỏ kí tự thừa( Do thừa kí tự nên mã SV là kí tự thừa đó)
        // Hoặc int tuoi= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ma SV:");
        String maSV = sc.nextLine();
        System.out.println("Nhap diem:");
        float diem = sc.nextFloat();
        System.out.println("======Xuat======");
        System.out.println("Ho ten :" + hoTen);
        System.out.println("Tuoi:" + tuoi);
        System.out.println("Ma SV:" + maSV);
        System.out.println("Diem:"+ diem);
     
    }
}
