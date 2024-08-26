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
public class Lab2_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap a,b");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a==0) {
            if(b==0){
                System.out.println("PT co vo so no");
            } else {
                System.out.println("PT vo no");
            }
        } else {
            System.out.println("No cua PT:"+ -b/a);
    }
}}
