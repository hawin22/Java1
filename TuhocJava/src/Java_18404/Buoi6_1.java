/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_18404;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Buoi6_1 {
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            
            System.out.println("1.Mang so nguyen");
            System.out.println("2.Thong tin sv");
            System.out.println("0.Ket thuc");
            System.out.println("Moi chon cn");
            chon = sc.nextInt();
            switch(chon){
                case 1: 
                 System.out.println("1.Mang so nguyen");
                 mangSoNguyen();
                 break;
                case 2:
                System.out.println("2.Thong tin sv");
                inFor();
                break;
                case 0:
                  System.out.println("0.Ket thuc"); 
                  ketThuc();
                 
                default:
                    System.out.println("Nhap lai");
        } 
    } while (chon!=0);
        }
    static void mangSoNguyen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int[] arrSo = new int[n];
        for (int i = 0; i < arrSo.length; i++) {
            System.out.println("Phan tu mang thu "+i+":");
            arrSo[i] = sc.nextInt();
        }
        for (int trc = 0; trc < arrSo.length-1; trc++) {
            for (int sau=trc +1 ;sau<arrSo.length;  sau++) {
                if(arrSo[trc]>arrSo[sau]){
                    int tam = arrSo[trc];
                arrSo[trc] = arrSo[sau];
                arrSo[sau] =  tam;
                
            }
            
        }}
        System.out.println("Sap xep giam dan");
       
        // System.out.println(""+Arrays.toString(arrSo));(Sắp xếp tăng dần)
       
        for (int i=arrSo.length-1 ; i>=0 ; i--) {
            System.out.println(arrSo[i]);
            
        }
        int min = arrSo[0];
        for (int i = 0; i < arrSo.length; i++) {
            if(min>arrSo[i]){
                min = arrSo[i];
            }
            
        }
        System.out.println("Min:"+min);
        
        int tong = 0;
        int d = 0;
        for (int i = 0; i < arrSo.length; i++) {
            if(arrSo[i]%3==0){
               tong+=arrSo[i];
               d ++;
            }
            
        }
        System.out.println("TBC cac so chia het cho 3:"+(double)tong/d);
        
    }
    static void inFor() {
        Scanner sc = new Scanner(System.in);
        
              
        String[] hoTen;
        double[] diem;
        System.out.println(" So luong sv");
        int sL= Integer.parseInt(sc.nextLine()); 
        hoTen  = new String[sL];
        diem  = new double[sL];
        for (int i = 0; i < hoTen.length; i++) {
            System.out.println("Thong tin sv thu "+(i+1)+":");
            hoTen[i] = sc.nextLine();
            System.out.println("Nhap diem cho sv thu "+(i+1)+":");
            diem[i] = Double.parseDouble(sc.nextLine());
            
        }
        String hL;
        for (int i = 0; i < hoTen.length; i++) {
           if(diem[i]<5) {
              hL = "Yeu"; 
        }
           else if(diem[i]<6.5){
               hL="TB";
           }
           else if(diem[i]<7.5){
               hL="Kha";
           }
           else if(diem[i]<9 ){
               hL="Gioi";
        } else {
               hL="Xuat sac";
           }
            System.out.println(hoTen[i]+" co "+diem[i]+" dat loai:"+hL);
        }
        //  Sắp xếp điểm sv tăng dần
        double hvDiem;
        String hvTen;
        for (int i = 0; i < diem.length-1; i++) {
            for (int j = i+1; j < diem.length; j++) {
               if(diem[i]>diem[j]){
                   hvDiem = diem[i];
                   diem[j]=diem[i];
                   diem[i] = hvDiem;
                   hvTen= hoTen[i];
                   hoTen[i]= hoTen[j];
                   hoTen[j] = hvTen;
               }
                
            }
            for (int j = 0; j < diem.length; j++) {
                System.out.println(hoTen[i]+":"+diem[i]);
                
            }
            
        }
           }
    static void ketThuc() {
        System.out.println("Bye bye");
        System.exit(0);
    }
} 
