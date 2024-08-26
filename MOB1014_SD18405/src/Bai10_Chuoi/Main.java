/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10_Chuoi;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main {

    public static void main(String[] args) {
        xuLyChuoi();
        String ten = kiemTraDauVao("ten", "^[a-zA-Z]+$"); //[a-zA-Z\\s]+$ ( dấu cộng là ko giới hạn kí tự)
        System.out.println("Ten = "+ten);
        int tuoi = Integer.parseInt(kiemTraDauVao("tuoi", "[0-9]+$")) ;
        System.out.println("Tuoi: "+tuoi);
        String sdt = kiemTraDauVao("sdt", "^0[0-9]{9,10}$");
        System.out.println("SDT: "+sdt);
        // Kiểm tra số điện thoại có 10 số và bắt đầu = 0 
        // Kiểm tra số double: VD cân nặng
        // Kiểm tra email có cấu trúc: chữ@fpt.edu.vn
        
    }

    public static void xuLyChuoi() {
        String[] arrTen = {"Hoa", "hong", "Ngoc", "Nhung"};
        System.out.println("*****StartWith*****");
        // Kiểm tra xem chuỗi có bắt đầu bằng H ko
        for (String ten : arrTen) {
            if (ten.toUpperCase().startsWith("H")) {

                System.out.println(ten);
            }
        }
        System.out.println("*****Contains*****");
        // Kiểm tra sự tồn tại của n 
        for (String ten : arrTen) {
            if (ten.toLowerCase().contains("n")) {
                System.out.println(ten);
            }
        }
        System.out.println("*****Spit*****");
        // Cắt chuỗi
        String poly = "    FPT  PolyTechnic    Ha Noi   ";
        String[] arrPoly = poly.trim().split("\\s+ ");
        System.out.println("arrPoly[2] = " + arrPoly[2]);
        for (String p : arrPoly) {
            System.out.println(p);
        }
        System.out.println("*****Join*****");
        String result = String.join("- ", arrPoly);
        System.out.println(result);
        System.out.println("*****SubString*****");
        String str1 = result.substring(5);
        String str2 = result.substring(5, 10);
        System.out.println(str1);
        System.out.println(str2);
    }
    public static String kiemTraDauVao(String msg, String pattern){
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("Moi nhap "+msg+": ");
            input= sc.nextLine();
        } while (!input.matches(pattern));
        return input;
    
    }
}
