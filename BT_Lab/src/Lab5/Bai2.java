/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai2 {
    private ArrayList<String> ds = new ArrayList<>();
    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        do {
            System.out.println("Nhap ho ten:");
            String ht = sc.nextLine();
            if(ht.isEmpty())
               break;
            ds.add(ht);
        } while (true);
    
    }
    public void xuat(){
        System.out.println("*****Xuat*****");
        for (String d : ds) {
            System.out.println("Ho ten:"+d);
        }
    }
    public void xuatNgauNhien(){
        Collections.shuffle(ds);
        xuat();
    }
    public void sapXep(){
    Collections.sort(ds, (a,b)->a.compareTo(b));
    xuat();
    }
    public void timVaXoa(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten can tim va xoa");
        String hoTen = sc.nextLine();
        for (String d : ds) {
            if(d.equals(hoTen))
                ds.remove(d);
            break;
        }
        for (String d : ds) {
           
            System.out.println("Danh sach sau khi xoa: "+d);
        }
    }
    public void menu(){
    Scanner sc = new Scanner(System.in);
        int chon;
        do {
            
               System.out.println("**********************");
        System.out.println("****Menu chuc nang****");
        System.out.println("1.Nhap danh sach");
        System.out.println("2.Hien thi danh sach");
        System.out.println("3.Sap xep danh sach");
        System.out.println("4.Hien thi ngau nhien");
        System.out.println("5.Tim kiem va xoa ho ten");
        System.out.println("6.Thoat chuong trinh");
        System.out.println("Xin moi b chon");
        chon = sc.nextInt();
        
            switch (chon) {
                case 1:
                     System.out.println("1.Nhap danh sach");
                     nhap();
                    break;
                case 2:
                    System.out.println("2.Hien thi danh sach");
                    xuat();
                    break;
                case 3:
                    System.out.println("3.Sap xep danh sach");
                    sapXep();
                    break;
                case 4:
                    System.out.println("4.Hien thi ngau nhien");
                    xuatNgauNhien();
                    break;
                case 5:
                    System.out.println("5.Tim kiem va xoa ho ten");
                    timVaXoa();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("B nhap sai");
            }
        } while (chon!=0);
    } 
}

