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
public class Buoi4_1 {
        
    public static void main(String[] args) {
        
        menu();
    }
        static void menu(){
            Scanner sc = new Scanner(System.in);
            int chon;
            
            System.out.println("*****Menu*****");
             System.out.println("1.Giai pt bac nhat");
            System.out.println("2.Giai pt bac hai");
            System.out.println("3.Tien dien");
            System.out.println("4.Ket thuc");
            System.out.println("+++++Moi chon+++++");
            
            System.out.print("Chon chuc nang:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                
                ptBac1();
                    break;
                case 2:
             
                ptBac2();
                    break;
                case 3:
                
                    System.out.println(""+tinhTienDien(51));
                    break;
                case 4:
                
                ketThuc();
                    break;
                default:
                    System.out.println("Ban nhap chua dung");
                    
            }
}
      static void ptBac1(){
          System.out.println("1.Giai pt bac nhat");  
             Scanner sc = new Scanner(System.in);
              System.out.println("Nhap a,b");
              float a = sc.nextFloat();
              float b = sc.nextFloat();
              if(a==0) {
              if(b==0){
              System.out.println("PT co vo so no");
              } else {
              System.out.println("PT vo no");
                    }
              } else {
              System.out.println("No cua PT:"+ -b/a);
            }
    }
      static void ptBac2(){
          
      Scanner sc = new Scanner(System.in);
          System.out.println("2.Giai pt bac hai"); 
           System.out.println("Nhap a,b,c");
        float x = sc.nextFloat();      
        float y = sc.nextFloat();      
        float z = sc.nextFloat();    
        if(x == 0 ) {
            if (y == 0) {
                if(z == 0) {
                    System.out.println("PT vo so no");
                } else {
                    System.out.println("PT vo no");
                }
        } else {
                System.out.println("PT co no:"+ -z/y);
            }
    } else {
            double dt = Math.pow(y,2)-4*x*z;
            if(dt<0 ) {
                System.out.println("PT vo no");
            } else  if(dt == 0) {
                System.out.println("PT co no kep" + -y/(2*x));
            } else {
                System.out.println("PT co 2 no pb:"+ (-y+Math.sqrt(dt))/(2*x) + " va " + (-y-Math.sqrt(dt))/(2*x));
            }
            
      } 
             }
      static double tinhTienDien(double dien){
         Scanner sc = new Scanner(System.in);
         if (dien<=50) {
                System.out.println("Tien dien:"+ dien*1000 );
            } else {
                System.out.println("Tien dien:"+ (50*1000+(dien-50)*1200));
            }
            return 0;
      }
      
      static void ketThuc(){
          System.out.println("4.Ket thuc");
          System.exit(0);
    
}
}


