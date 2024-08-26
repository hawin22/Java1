/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai_4 {
    /*
    Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên. 
    Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
    Yếu: điểm < 5
    Trung bình: 5 <= điểm < 6.5
    Khá: 6.5 <= điểm < 7.5
    Giỏi: 7.5<= điểm < 9
    Xuất sắc: điểm >= 9
    Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang:");
        int sL = Integer.parseInt(sc.nextLine());
        String[] hoTen;
        double[] diem ;
        hoTen = new String[sL];
        diem = new double[sL];
        for (int i = 0; i < hoTen.length; i++) {
            System.out.println("Nhap ho ten sv thu "+ (i+1)+" : ");
            hoTen[i] = sc.nextLine();
            System.out.println("Nhap diem sv thu "+ (i+1)+" : ");
            diem[i] = Double.parseDouble(sc.nextLine());
            while (diem[i]<1||diem[i]>10) {
                System.out.println("Nhap lai diem:");
                diem[i] = Double.parseDouble(sc.nextLine());
            }}
            String hL;
        for (int i = 0; i < hoTen.length; i++) {
           if(diem[i]<5) {
              hL = "Yeu"; 
        }
           else if(diem[i]<6.5){
               hL="TB";
           }
           else if(diem[i]<7.5){
               hL="Kha";
           }
           else if(diem[i]<9 ){
               hL="Gioi";
        } else {
               hL="Xuat sac";
           }
            System.out.println(hoTen[i]+" co "+diem[i]+" dat loai:"+hL);
        }
        System.out.println("Sap xep tang dan");
        Arrays.sort(diem);
        for (double d : diem) {
            System.out.println(d);
        }
    }
}
