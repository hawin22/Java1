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
public class Lab1_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Nhap chieu dai, chieu rong cua hcn");
        double cd = sc.nextDouble();
        double cr = sc.nextDouble();
        double cv = (cd+cr)*2;
        double dt = cd*cr;
        System.out.println("Chu vi hcn:" + cv);
        System.out.println("Dien tich hcn:" + dt);
        System.out.println("Canh nho nhat:" + Math.min(cd, cr));
    }
}
