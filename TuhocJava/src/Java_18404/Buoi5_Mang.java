/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_18404;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Buoi5_Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] a;
//        int b[];
//        int[] c = new int[4];
//        int[] d = {1,2,4,7};
//        
//        // In ra mảng:
//        for (int i = 0; i < d.length; i++) {
//            System.out.println("Phan tu thu "+i+":"+d[i]);
//        }
            int[] a;
            int n;
            System.out.println("Nhap so phan tu mang");
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("GT cho phan tu thu "+i );
                a[i] = sc.nextInt();
            
        }
            for (int i : a) {
                System.out.print(i+"\t");
        }
            System.out.println("");
        
    }
    
}
