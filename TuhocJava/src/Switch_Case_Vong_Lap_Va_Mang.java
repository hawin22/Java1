


import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class Switch_Case_Vong_Lap_Va_Mang {
    public static void main(String[] args) {
        /*Switch(biểu thức)
        { 
        case gt1:
        lệnh;
        break;
        case gt2:
        lệnh;
        break;
        ...
        default:
        lệnh
        break;
        }
        */
     
        
        // Vòng lặp while
      /*  int i=0;
        while (i<10)
        {
            System.out.println(i+ "\n");
            i++;
        }
        System.out.println("gt i sau vong lap:" + i);
*/
     
      
      // Bảng cửu chương 7
      /*
      int i =1 ;
      while (i<=10)
      {
          int m = 7 * i ;
          
          System.out.println(" 7 *" + i + "=" + m);
          i++;
          */
      
         
      
      
      // Tính TBC các số chia hết cho 3 từ 27 đến 250
     
     /* int n = 27 ;
          int tong = 0 , dem = 0;
          
          while(n<=250)
          {
              if(n%3==0){
               tong +=n;
               dem++;
              }
           n++;
              
         }
          System.out.println("TBC=" + (float)tong/dem);
*/
     
     // Vòng lặp do-while (Nên dùng khi ko xác định được vòng lặp)
       
     /* Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Nhap n lai:");
            n = sc.nextInt();
        }
        while (n<=0 || n>=10 );
        System.out.println("n="+n);*/
       
        
        // Vòng lặp For (Nên dùng khi xác định đc vòng lặp)
        
        
     /*   for ( int i = 1; i<=10;i++)
        {
            System.out.println(i + "* 7 = "+ i*7);
        }
*/        

        // Mảng
     
        
     /*   Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int []b = new int[10];
                 a[0]=5;
                 a[1]=4;
                 a[2]=7;
                 a[3]=1;
                 a[4]=a[0]+a[1];
                 // Hoặc viết như dưới sẽ nhanh hơn
        int []c = new int[]{5,4,7,1,9};
        int []d = {5,4,7,1,9} ;
        int []e = new int[5] ;
        for(int i =0 ;i<5;i++){
            System.out.println("Nhap a["+i+"]:");
        e[i] = sc.nextInt();
        }
        for (int i=0;i<5;i++) {
            System.out.println(e[i]+"");
        }    */
        // Hoặc for(int i = 0;i<e.length;i++)
            
        
        int x[]= new int[]{5,6,3,7,9,2,4,1,8};
        System.out.println(Arrays.toString(x));
        // Sắp xếp mảng tăng dần: Arrays.sort(x);(ko sắp xếp giảm dần đc) 
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        // Sắp xếp giảm dần
        for (int i = 0;i<x.length-1;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]<x[j]) {
                    int tam = x[i];
                   x[i] = x[j];
                   x[j] = tam ;
                }
    }}
        System.out.println(Arrays.toString(x));
    }}