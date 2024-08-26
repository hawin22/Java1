/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Lab2_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a,b,c");
        float a = sc.nextFloat();      
        float b = sc.nextFloat();      
        float c = sc.nextFloat();    
        if(a == 0 ) {
            if (b == 0) {
                if(c == 0) {
                    System.out.println("PT vo so no");
                } else {
                    System.out.println("PT vo no");
                }
        } else {
                System.out.println("PT co no:"+ -c/b);
            }
    } else {
            double dt = Math.pow(b,2)-4*a*c;
            if(dt<0 ) {
                System.out.println("PT vo no");
            } else  if(dt == 0) {
                System.out.println("PT co no kep" + -b/(2*a));
            } else {
                System.out.println("PT co 2 no pb:"+ (-b+Math.sqrt(dt))/(2*a) + " va "+ (-b-Math.sqrt(dt))/(2*a));
            }
}}}
