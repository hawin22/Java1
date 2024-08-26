package bai2_nhap_xuat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class b2_ep_kieu {
    public static void main(String[] args) {
        // Phần 1: Ép kiểu giữa các số 
        // Ép kiểu ngầm định
        int a =10 ;
        double b = a;
        System.out.println("b" + b);
        // Ép kiểu tường minh
       double c = 7.4;
       int d = (int)c;
        System.out.println("d=" +d);
        // Phần 2: Ép kiểu từ String về số
        String num1 = "4";
        String num2 = "6";
        String sum = num1 + num2;
        System.out.println("sum:" + sum);
        ////
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int tong = n1 + n2 ;
        System.out.println("tong:" + tong);
        /* Lớp bao: Wrapper
        Đối với mỗi kiểu dữ liệu nguyên thủy
        =>1 lớp bao tương ứng
        int=> Integer
        double => Double 
        float => Float
        char => Character...
        */
        double so1 = Double.parseDouble(num1);
        double so2 = Double.parseDouble(num2);
        double num= so1 + so2 ;
        System.out.println("num:" + num);
    }
}
