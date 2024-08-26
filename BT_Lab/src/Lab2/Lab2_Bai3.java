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
public class Lab2_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien");
        float dien = sc.nextFloat();
        if (dien<=50) {
            System.out.println("Tien dien:"+ dien*1000 );
        } else {
            System.out.println("Tien dien:"+ (50*1000+(dien-50)*1200));
        }
    }
}
