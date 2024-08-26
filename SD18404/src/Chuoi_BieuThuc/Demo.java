/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuoi_BieuThuc;

/**
 *
 * @author Hawin
 */
public class Demo {
    public static void main(String[] args) {
    String chuoi =  "Nguyen Hong Bao Minh";
        System.out.println("Ho la : "+ chuoi.substring(0, chuoi.indexOf(" ")));
        System.out.println("Ten dem : "+chuoi.substring(chuoi.indexOf(" "), chuoi.lastIndexOf(" ")));
        System.out.println("Ten la : "+chuoi.substring(chuoi.lastIndexOf(" "), chuoi.length()));
}}
