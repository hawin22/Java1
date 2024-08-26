/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Tren_Lop;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main_May_Tinh {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      // Khởi tạo đối tượng 
      May_Tinh mt1 = new May_Tinh("xn12","HP",2002,23,1);
      May_Tinh mt2 = new May_Tinh();
        System.out.println("*****Nhap thong tin*****");
        System.out.println("Nhap ma");
        mt2.setMa(sc.nextLine());
        System.out.println("Nhap hang");
        mt2.setHang(sc.nextLine());
        System.out.println("Nhap nam sx");
        mt2.setNamSX(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap inch");
        mt2.setInch(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap trang thai");
        mt2.setTrangThai(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Xuat thong tin");
        mt2.inInf();
            
    
    }
    

    
}
