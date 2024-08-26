
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class BTVN_B1_Tren_Lop {
    public static void main(String[] args) {
        System.out.println("-----Nhap thong tin-----");
        String hangTS, vi, topping;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang TS, Vi, Topping:");
        hangTS = sc.nextLine();
        vi = sc.nextLine();
        topping = sc.nextLine();
        int gia, sL;
        System.out.println("Nhap gia:");
      
        gia= sc.nextInt();
        System.out.println("Nhap so luong:");
         
        sL = sc.nextInt();
        System.out.println("Nhap size:");
        
         char size = sc.next().charAt(0);
         //char size = sc.nextLine().charAt(0);
         // Next(): Đọc dòng dữ liệu cho đến dấu cách đầu tiên
         // NextLine(): Đọc hết dòng dữ liệu
        System.out.println("-----Xuat thong tin-----");
        System.out.println("Ten hang TS:" + hangTS);
        System.out.println("Vi:" + vi);
        System.out.println("Topping:"+topping);
        System.out.println("Gia tien:"+gia);
        System.out.println("So luong:"+sL);
        System.out.println("size:"+size);
    }
}
