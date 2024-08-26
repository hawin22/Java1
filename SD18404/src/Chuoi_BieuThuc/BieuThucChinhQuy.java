/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuoi_BieuThuc;

import java.util.Scanner;


/**
 *
 * @author Hawin
 */
public class BieuThucChinhQuy {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        String chuoi;
        String pchuoi = "[a-d]{3}@fpt.edu.vn"; //biểu thức chính quy
        String pacount = ".*PH[0-9]{5}";
        
        //System.out.print("Nhập 1 chuỗi: ");
        //chuoi = sc.nextLine();
        //System.out.println("Check: "+chuoi.matches(pchuoi));
        
        System.out.print("Nhập 1 chuỗi: ");
        chuoi = sc.nextLine();
        System.out.println("Check: "+chuoi.matches(pacount));
         System.out.println("Nhap chuoi: ");
         chuoi = sc.nextLine();
         System.out.println("Check: "+ chuoi.matches(pchuoi));
        
    }
}
