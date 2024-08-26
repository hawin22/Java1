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
public class Buoi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  int a;
        System.out.println("a=");
        a = sc.nextInt();
        System.out.println("a la "+ ((a>0) ? "So duong" : "So am"));
*/
     
      
   /*   int i ;
        System.out.println("Nhap i:");
      i = sc.nextInt();
        if (i>0) {
            System.out.println("I love you");
        }
        else if(i==0) {
            System.out.println("I'm happy");
        }
        else {
            System.out.println("I hate you");
        }
              
*/
  
   
   /* Bt: Nhập vào tên, điểm TB, lớp của Sv
   Hiển thị ra màn hình thông tin sau:
   Họ tên - Học lực - Lớp
   */
      /*  System.out.println("Nhap ho ten:");
   String hoTen = sc.nextLine();
   String hocLuc;
        System.out.println("Nhap diem TB:");
   double diem = Double.parseDouble(sc.nextLine());
    if (diem>=9) {
            hocLuc = "Xs";
        } else if( diem>=8) {
            hocLuc = "Gioi";
        } else if (diem>=7) {
           hocLuc = "Kha";
        } else if(diem>=5.5) {
            hocLuc = "TB";
        } else {
            hocLuc = "Yeu";
        }
        System.out.println("Nhap lop:");
        String lop = sc.nextLine();
       
        System.out.println("=====Xuat=====");
        System.out.println("Ho ten:" +hoTen);
        System.out.println("Hoc luc:" +hocLuc );
        System.out.println("Lop:"+lop);
        
        */
       
       int i ;
       do {
           System.out.println("=====Menu=====");
           System.out.println("1. An bun bo");
           System.out.println("2. An pho");
           System.out.println("3. An nuong");
           System.out.println("0. The end");
           System.out.println("Moi chon");
       
        System.out.println("Nhap i:");
        i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("An bun bo");
                break;
            case 2:
                System.out.println("An pho");
                break;
            case 3:
                System.out.println("An nuong");
                break;
            case 4:
	       System.out.println("0.The end");
                break;
            default:
                System.out.println("Xin moi nhap lai");
                break;
               
        }} while (i!=0 );
    }
}
