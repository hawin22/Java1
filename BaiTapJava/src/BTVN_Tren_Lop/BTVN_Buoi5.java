
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Tren_Lop;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class BTVN_Buoi5 {
    public static void main(String[] args) {
        /* BTVN
 * +-------- Thông tin Ti Vi cửa hàng -------+
	- Mời nhập số lượng ti vi : 
	- Nhập mảng kích cỡ cho từng ti vi : ….
   +------  Xuất thông tin Ti Vi ------ +
	- Số lượng ti vi là :  …… 
	- Kích cỡ trung bình tivi :……  
	- Vị trí Ti vi có kích cỡ lớn nhất là : ….. 
        - Số lượng Ti vi có kích thước là số chẵn là: 
        - Mảng kích cỡ Ti Vi theo thứ tự tăng dần là: 
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Thong tin TV cua hang ");
        System.out.println("Nhap so luong tv:");
        int sL = Integer.parseInt(sc.nextLine());
   
        int [] arrSo = new int[sL];
        System.out.println("Nhap mang:");
        for (int i = 0; i < arrSo.length; i++) {
            System.out.println("Kich co cho tv thu " + (i) + " :");
            arrSo[i] = Integer.parseInt(sc.nextLine());
           
            
        }
        System.out.println("Xuat thong tin");
        System.out.println("So luong TV:" +sL);
        int tong =0 , d=0;
        for (int i = 0; i < arrSo.length; i++) {
           tong += arrSo[i];
            d++;
        }
        
          System.out.println("Kich co TB cua TV: "+ (float)tong/d);
        
        int max = 0;
        int vT = 0 ;
        for (int i = 0; i < arrSo.length; i++) {
            if(max<arrSo[i])
                max = arrSo[i];
            vT = i;
            
        }
        System.out.println("Vi tri co kich co TV cao nhat: " + vT );
        int dem = 0;
        for (int i = 0; i < arrSo.length; i++) {
             if(arrSo[i]%2==0){
                 dem ++;
             }
            
        }
        System.out.println("So luong co kich co la so chan: "+dem);
        System.out.println("Sap xep theo tt tang dan:");
        Arrays.sort(arrSo);
        for (int i : arrSo) {
            System.out.println(i);
        }
        int trc, sau;
        for (trc = 0; trc < arrSo.length-1; trc++) {
            for (sau= trc +1 ; sau< arrSo.length; sau++) {
                if(arrSo[trc]>arrSo[sau]){
                    int tam = arrSo[trc];
                    arrSo[trc] = arrSo[sau];
                    arrSo[sau] = tam;
                }
                
            }
            
        }
        System.out.println("Sap xep giam dan");
        for(int i=arrSo.length-1;i>=0;i--){
            System.out.println(arrSo[i]);
        }
    }
}
