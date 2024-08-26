 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuhocjava;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class lenhIf_Else {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
//        int n;
//        
//        System.out.println("Nhap n:");
//        n = sc.nextInt();
//        // Kiểm tra tính chẵn lẻ
//        if(n%2==0){
//            System.out.println(n + " la so chan ");
//          
//        }
//        else { System.out.println(n +" la so le");
//    }
/* Giải phương trình bậc nhất
   Ptrinh bậc nhất: ax + b = 0
   Nếu a = 0 
        Nếu b = 0 => PT Vô số no
        Nếu b!= 0 => PT Vô no
   Nếu a!= 0
        Có nghiệm x = -b/a
*/
    /*    double a,b;
        
        System.out.println("Nhap a:");
        System.out.println("Nhap b:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a==0) {
            if(b==0) {
                System.out.println("Phuong trinh vo so no");
                
            } else { System.out.println("Phương trinh vo no");
            
            }
        } else { System.out.println("Phuong trinh co no la " + -b/a);
}*/
    
    
    
    /* Pt bậc 2: ax^2 +bx = 0
        Các biến cần có: a,b,c,x1,x2,delta
        Kiểm tra delta = b^2 - 4ac
    Nếu delta<0 => Pt vô no
    Nếu delta=0 => Pt có no kép= -b/2a
    Nếu delta>0 => Pt có 2 no x1= (-b+sqrt(delta))/(2a)
                              x2= (-b-sqrt(delta))/(2a)
    */
        double a,b,c,delta,x1,x2;
        System.out.println("Nhap a,b,c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = Math.pow(b,2)- (4*a*c);
        if (delta<0) {
            System.out.println("Phuong trinh vo no");
        } else if(delta==0) {
            System.out.println("Phuong trinh co no kep la:" + -b/(2*a));
        } else { 
            x1=(-b+ Math.sqrt(delta))/(2*a);
            x2=(-b- Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 no:" +x1 +" va"+ x2);
        }
    }
}