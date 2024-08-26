/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ke_Thua;

/**
 *
 * @author Hawin
 */
public class Main {

    public static void main(String[] args) {
        DongVat dvCha = new DongVat();
        DongVatTrenCan dvCon = new DongVatTrenCan();
        DongVatDuoiNuoc dvCon2 = new DongVatDuoiNuoc();
        System.out.println("So chan cua CHA: " + dvCha.soChan);
        dvCha.diChuyen();
        System.out.println("*************");

        System.out.println("So chan cua con: " + dvCon.soChan);
        dvCha.diChuyen();
        System.out.println("Ten cua con: " + dvCon.getTen());
        System.out.println("Can nang cua con: " + dvCon.canNang);

        dvCon2.diChuyen();
        System.out.println("So chan cua con: " + dvCon2.getSoChan());
        System.out.println("Ten cua con: " + dvCon2.getTen());
        System.out.println("Can nang cua con: " + dvCon2.canNang);
    }
}
