/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai_2 {
    // Viết chương trình xuất ra màn hình bảng cửu chương

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i+" = "+(n * i) );
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+ j+ " = "+ (i*j));
            }
        }
    }
}
