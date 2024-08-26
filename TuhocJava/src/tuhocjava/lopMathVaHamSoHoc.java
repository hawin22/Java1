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
public class lopMathVaHamSoHoc {
    public static void main(String[] args) {
      // double a,b;
        Scanner sc = new Scanner(System.in);
      /*System.out.println("Nhap vao so a:") ;
        a= sc.nextDouble();
        System.out.println("Nhap vao so b:");
        b= sc.nextDouble();
        // Tính gt tuyệt đối
        System.out.println("|a|=" + Math.abs(a));
        // Tính min
        System.out.println("Min(a,b)" + Math.min(a,b));
        // Hàm ceil( làm tròn lên sỗ nguyên lớn hơn)( Với số thập phân)
        System.out.println("ceil(a)=" + Math.ceil(a));
        // Hàm Floor( làm tròn xuống số nguyên nhỏ hơn)( Với số thập phân
        System.out.println("floor(a)=" + Math.floor(a));
        // Tính căn bậc 2
        System.out.println("Can(a)=" + Math.sqrt(a));
        // Tính a mũ b
        System.out.println("a^b=" + Math.pow(a,b));   */
        double r;
        System.out.println("Nhap ban kinh:");
        r= sc.nextFloat();
        double cv = 2*r* Math.PI ;
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi hinh tron:" + cv);
        System.out.println("Dien tich hinh tron:"+dt);
    }
}