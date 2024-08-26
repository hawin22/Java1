/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapjava;
 import java.util.Scanner;
/**
 *
 * @author Hawin
 */
public class BaiTapJava_Try_Catch {
   
    /**
     * @param args the command line arguments
     */
    //Nhập vào 1 số từ bàn phím. Nếu là dg thì tính và xuất căn 2 của số đó
    public static void main(String[] args) {
        // TODO code application logic here
        int so;
        try{
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap n:");
        so = scanner.nextInt();
        if(so>0){
            double sqrt = Math.sqrt(so);
            System.out.println("Can 2 cua n:"+sqrt);
        } 
              
    } catch (Exception ex){
            System.out.println("Loi"+ ex.getMessage());
    }
        System.out.println("Ket thuc");
    
}}
