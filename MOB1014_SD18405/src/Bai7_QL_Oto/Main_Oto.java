/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_QL_Oto;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main_Oto {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        QL_OTO ql = new QL_OTO(); // Đặt ngoài vòng do-while
        int chon ;
        do {
            System.out.println("*****Menu*****");
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("0.Thoat");
            System.out.println("Moi chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ql.nhapDS();
                    break;
                case 2:
                    ql.xuatDX();
                    break;
                case 3:
                    ql.tinhTB();
                    
                    break;
                    
                case 4: 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi chon lai");
            }
        } while (chon!=0);
    }
}
