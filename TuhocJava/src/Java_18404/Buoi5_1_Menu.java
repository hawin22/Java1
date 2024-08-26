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
public class Buoi5_1_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap menu:");
        int chon;
        do {
            chon = sc.nextInt();
            System.out.println("*****Menu*****");
            System.out.println("Cn 1");
            System.out.println("Cn 2");
            System.out.println("Ket thuc");
            switch(chon){
                case 1:
                System.out.println("Cn 1");
                break;
                case 2:
                System.out.println("Cn 2");
                break;
                case 3:
                    System.out.println("bye bye");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai, nhap lai");
            }
            
        } while(true);
    }
}
