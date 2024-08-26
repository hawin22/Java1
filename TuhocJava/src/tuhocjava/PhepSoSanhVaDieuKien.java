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
public class PhepSoSanhVaDieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Nhap so a:");
        int a = sc.nextInt();
        System.out.println("Nhap so b:");
        int b = sc.nextInt();
        System.out.println("=====Xuat=====");
        System.out.println("a=b:"+(a==b));
        System.out.println("a<b:"+(a<b));
        System.out.println("a>b:"+(a>b));*/
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        String kq = (n%2==0)? "So chan": "So le";
        System.out.println(n +" la " + kq);
    }
    
}
