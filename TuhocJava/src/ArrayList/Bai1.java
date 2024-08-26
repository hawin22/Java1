/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Hawin
 */
public class Bai1 {
    public static void main(String[] args) {
    ArrayList<Double> so = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap phan tu thu"+ i+":");
            double d =sc.nextDouble();
            so.add(d); 
        }
        double tong = 0;
        for (Double d : so) {
            //System.out.println(" "+d);
            //tong += d;
            if(d>20)
                System.out.println(" "+d);
        }
     //   System.out.println("Tong ds:"+tong);
        
    }
}
