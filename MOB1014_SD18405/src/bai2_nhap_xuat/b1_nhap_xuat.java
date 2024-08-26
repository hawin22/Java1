    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_nhap_xuat;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class b1_nhap_xuat {
    public static void main(String[] args) {
        // Lớp hỗ trợ việc nhập xuất dữ liệu từ bàn phím
        // Khởi tạo đối tượng từ lớp scanner
        Scanner sc = new Scanner(System.in);  // sc: scanner( đối tượng)
        System.out.println("======Nhap======");
        System.out.println("Ten NYC:");
        String ten = sc.nextLine();
      //  String ten = sc.next(); : chỉ nhập cho đến khi có dấu cách
         // Cách 2:
        int age = Integer.parseInt(sc.nextLine());
        
        System.out.println("======Xuat======");
        System.out.println("Ten NYC:" + ten);
        
        System.out.println("Nhap tuoi NYC");
        String tuoi = sc.nextLine();
        System.out.println("Tuoi NYC" + tuoi);
       
       
        
    }
}
