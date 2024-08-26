/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Hawin
 */
public class B1_ArrayList {
    public static void main(String[] args) {
        // Phần 1: ArrayList ko định kiểu( có thể thêm tất cả các kiểu dữ liệu)
        // 1.1: khởi tạo arrList
        // import java.util.ArrayList;
        ArrayList arrLstPoly = new ArrayList();
        // 1.2: Thêm phần tử vào arrList
        arrLstPoly.add(2);  //0
        arrLstPoly.add(5);  //1
        arrLstPoly.add(8);  //2
        arrLstPoly.add(21); //3
        arrLstPoly.add(1);  //4
        arrLstPoly.add(10); //5
        
        arrLstPoly.add("Huyennk6");
        arrLstPoly.add(true) ;
        // 1.3: Truy xuất phần tử  => get(index)
        System.out.println("Gia tri: "+arrLstPoly.get(0));
        // 1.4:  Duyệt mảng
        // C1: for + tab
        for (int i = 0; i <arrLstPoly.size(); i++) {
            System.out.println("arrLstPoly = "+ arrLstPoly.get(i));
        }
        // C2: fore + tab
        for (Object object : arrLstPoly) {
            System.out.println("object= "+ object);
        }
        
        // Phần 2: ArrayList Có định kiểu
        // Ko làm việc với kiểu nguyên thủy => Chỉ làm việc vs lớp bao, String,lớp...
        ArrayList<Integer> arrLstTuoi = new ArrayList<Integer>();
        arrLstTuoi.add(5);
        arrLstTuoi.add(42);
        arrLstTuoi.add(12);
        arrLstTuoi.add(3);
        arrLstTuoi.add(8);
        
        // arrLstTuoi.add("poly");
        for (int i = 0; i < arrLstTuoi.size(); i++) {
            System.out.println(arrLstTuoi.get(i));
        }
        System.out.println("sort");
        // import java.util.Collections;
        Collections.sort(arrLstTuoi);
        for (Integer tuoi : arrLstTuoi) {
            System.out.println(tuoi);
        }
        // Đảo ngược danh sách bên trên
        System.out.println("Reverse");
        Collections.reverse(arrLstTuoi);
         for (Integer tuoi : arrLstTuoi) {
            System.out.println(tuoi);
        }
         System.out.println("Remove"); // (Xóa tại vị trí nhập)
         arrLstTuoi.remove(2);
         for (Integer tuoi : arrLstTuoi) {
             System.out.println(tuoi);
        }
         System.out.println("clear"); // Xóa toàn bộ
         arrLstTuoi.clear();
         for (Integer tuoi : arrLstTuoi) {
             System.out.println(tuoi);
        }
         ArrayList<String> arrLstTen = new ArrayList<>();
         ArrayList<Double> arrLstCanNang = new ArrayList<>();
        // import java.util.List; 
         List<String> arrLstTen2 = new ArrayList<>();
         List<Double> arrLstCanNang2 = new ArrayList<>();
    }
    
}

