/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Ho la: "+ hoTen.toUpperCase().substring(0, hoTen.indexOf(" ")).trim());
        System.out.println("Ten dem la: "+hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" ")).trim());
        System.out.println("Ten dem la: "+hoTen.toUpperCase().substring(hoTen.lastIndexOf(" "), hoTen.length()).trim());
        
    }
}
