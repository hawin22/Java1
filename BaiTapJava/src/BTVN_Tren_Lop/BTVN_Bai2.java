/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Tren_Lop;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class BTVN_Bai2 {
    public static void main(String[] args) {
        System.out.println("----Nhap----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id cua cho:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten cua cho:");
        String ten = sc.nextLine();
        System.out.println("Nhap can nang:");
        double kg = sc.nextDouble() ;
        sc.nextLine();
        String kq ; 
        System.out.println("Nhap loai cho:");
        String loai = sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        int gt = sc.nextInt() ;
        if(kg>=20) {
            kq = "Beo phi";
        } else if(kg>=10) {
            kq = "Cho dep dang xinh" ;            
        } else if(kg>=5) {
            kq = "Can tang can" ;           
        } else {
            kq = "Suy dinh duong" ;
        }
        System.out.println("----Xuat----");
        System.out.println("id cua cho:"+id);
        System.out.println("Ten cua cho:"+ten);
        System.out.println("Loai cua cho:"+loai);
        System.out.println("Can nang cua cho:"+kq);
        System.out.println("Gioi tinh cua cho:"+(gt==1?"Duc":"Cai"));
    }
    
}
