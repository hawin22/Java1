/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Mang;

import java.util.Arrays;

/**
 *
 * @author Hawin
 */
public class B1_Array {
    public static void main(String[] args) {
        // 1.Khai báo mảng
        int[] arrSo;  
        int arrSo1[];
     
        // 2.Khởi tạo mảng
        //Khởi tạo 1 mảng số nguyên gồm 4 phần tử
        arrSo = new int[]{6,8,4,9};
        // Khởi tạo 1 mảng số nguyên gồm 3 phần tử
        double[] arrDiem = new double[] {8.5,6.8,9.5};
        // Khởi tạo 1 mảng có kích thước bằng 5
        String[] arrTen = new String[5] ;
        
        System.out.println("length="+arrTen.length);
        // 3.Gán gt
        arrTen[0] = "Linh";
        arrTen[1] = "Thu";
        arrTen[2] = "Huyen";
        arrTen[3] = "Tra";
        arrTen[4] = "Xanh";
      //  arrTen[5] = "Chi";
      //4. Truy xuất phần tử
        System.out.println("arrDiem=" + arrDiem[1]);
      //5. Duyệt mảng ( dùng vòng for)
       
       // Cách 1: for i ( in vị trí, cũng có thể bị duyệt thiếu)
        for (int i = 0; i <arrTen.length ; i++) {
            System.out.println("arr["+i+"]:" + arrTen[i]);
        }
        // Cách 2: for each => fore + tab (duyệt đủ giá trị, nhưng ko in vị trí)
        for (String ten : arrTen) {
            System.out.println(ten);
        }
        /////////////////////////////////////
        System.out.println("Sort: Sap xep tang dan");
        Arrays.sort(arrDiem);
        //{8.5,6.8,9.5}
        for (double d : arrDiem) {
            System.out.println(d);
        }
        // {6,8,4,9}
        // binarySearch : thuật toán tìm kiếm nhị phân
        // => phải dung sort trc khi tìm kiếm để sắp xếp
        // index = 0 1 2 3 (vị trí)
        // value = 4 6 8 9 (giá trị)
        Arrays.sort(arrSo);
        int viTri =  Arrays.binarySearch(arrSo,4 );
        System.out.println("Vi tri: " + viTri);
        
}}
