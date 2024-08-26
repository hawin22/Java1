/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_nhap_xuat;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class B4_If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien ban co:");
        int tien = Integer.parseInt(sc.nextLine());
        if (tien>=15) {
            System.out.println("Mua Roll Royce");
            
        } else if(tien>=10) {
            System.out.println("Mua May bach");
        } else if(tien>=5){
            System.out.println("Mua porsche");           
        } else {
            System.out.println("Mua kia");
    }
    
}}

