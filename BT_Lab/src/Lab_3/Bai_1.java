/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai_1 {
    // Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là
   // số nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
    public static boolean soNguyenTo(int n){
     
    Scanner sc = new Scanner(System.in) ;
       
   
        for (int i = 2; i < n-1; i++) {
            if(n%i==0){
               return false;
                
            }
                
            }
       return true;
    }
    
     
    
    
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
         System.out.println("Nhap n:");
        n = sc.nextInt();
        
        if(soNguyenTo(n)){
            System.out.println("n la so nguyen to");
        } else {
            System.out.println("n ko la so nguyen to");
        
    }
}}
