/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class DSCauHoi {
    public static void main(String[] args) {
        ArrayList<String> ds =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Nhap n:");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap cau hoi thu "+(i+1));
            String ch = sc.nextLine();
            ds.add(ch);
        }
        Collections.shuffle(ds);// Xáo trộn ds
        System.out.println("Gia tri cac phan tu:\n");
        for (String d : ds) {
            System.out.println(d);
        }
    }
}
