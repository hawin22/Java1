/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab_1;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Lab1_Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        String ht = sc.nextLine();
        System.out.println("Nhap diem TB:");
        float diem = sc.nextFloat();
        System.out.printf("%s dat %.1f diem \n",ht,diem);
        
    }
    
}
