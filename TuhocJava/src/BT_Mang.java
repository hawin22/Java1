
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class BT_Mang {
    
    //Tính  tổng của mảng và tìm GTLN trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int e[] = new int [5];
  for(int i =0 ;i<5;i++){
            System.out.println("Nhap a["+i+"]:");
      e[i] = sc.nextInt();}
       // Tính tổng của mảng
            int tong = 0;
            for(int i = 0;i<5 ;i++) {
            tong += e[i] ;
    }       System.out.println("Tong cua mang:" + tong);
    
      // Tìm GTLN trong mảng
      int max = 0;
      for (int i = 0; i<5;i++){
          if(max<e[i])
              max=e[i];
      } System.out.println("GTLN trong mang la:"+ max);
}}
