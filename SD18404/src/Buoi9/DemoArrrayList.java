/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi9;

import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class DemoArrrayList {

    public static void main(String[] args) {
        // Khởi tạo danh sách ko định kiểu
        ArrayList dsach = new ArrayList();
        dsach.add("abc");
        dsach.add(1);
        dsach.add(3.5);
        // Khởi tọa danh sách có định kiểu
        // ArrayList<Lớp bao> ten = new ArrayList<>();
        // ArrayList<Kiểu tự định nghĩa> ten = new ArrayList<>();
       
        ArrayList <Integer> dsach1 = new ArrayList<>();
         dsach1.add(3,6); // thêm gt 6 vào vị trí thứ 3(thứ tự 4)
         dsach1.add(20);  // thêm gt 20 vào vị trí cuối cùng
         dsach1.add(6);
         dsach1.add(41);
         
        for (Integer i : dsach1) {
            System.out.print("\t"+ i);
        }
        dsach1.remove(2); // Xóa pt tại vị trí thứ 2 trong ds
        
    }
    }
    

