/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        QLPerson nguoi = new QLPerson();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("************");
            System.out.println("****Menu****");
            System.out.println("1.Nhap ds");
            System.out.println("2.Xuat ds");
            System.out.println("3.Dua ra ps nu");
            System.out.println("4.Dem so ps nu<18t");
            System.out.println("0.Thoat");
            System.out.println("*****Moi chon*****");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap ds");
                    nguoi.nhapTT();
                    break;
                case 2:
                    System.out.println("2.Xuat ds");
                    nguoi.xuatTT();
                    break;
                case 3:
                    System.out.println("3.Dua ra ps nu");
                    nguoi.xuatNu();
                    break;
                case 4:
                    System.out.println("4.Dem so ps nu<18t");
                    nguoi.dem();
                    break;
                default:
                    System.out.println("B nhap sai");
            }
        } while (chon!=0);

    }

}
