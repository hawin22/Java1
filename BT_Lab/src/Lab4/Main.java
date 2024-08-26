/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main {
    public static void main(String[] args) {
         // Bai 2
         SanPham sp1 = new SanPham();
         SanPham sp2 = new SanPham();
         Scanner sc = new Scanner(System.in);
         sp1.nhapTT();
         sp2.nhapTT();
         sp1.xuatTT();
         sp2.xuatTT();
         SanPham sp3 = new SanPham("Sua", 12000);
         SanPham sp4 = new SanPham("Banh",30000,1200);
         
       
         ArrayList <SanPham> dsSanPham = new ArrayList<>();
         
            // Nhập vào  số sp cần nhập inf
         
            int n ;
            System.out.println("Nhap so luong sp");
            n =Integer.parseInt(sc.nextLine());
         // Nhập inf cho từng sp
        for (int i = 0; i <n; i++) {
         SanPham sp = new SanPham();
         sp.nhapTT();
        }
         // In ra inf các sp 
         
         for (SanPham sanPham : dsSanPham) {
             System.out.println(sanPham);
        }
                
        
    }
    
}
