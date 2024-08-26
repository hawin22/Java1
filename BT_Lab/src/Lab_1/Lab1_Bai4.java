/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_1;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Lab1_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a,b,c");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float dt = (float) (Math.pow(b,2) - 4 * a * c);
        if(Math.sqrt(dt)>=0) {
            System.out.println("Can delta la:" + Math.sqrt(dt));
        } else {
            System.out.println("Ko co can");
        }
                
}}
