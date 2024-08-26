/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuoi_BieuThuc;

/**
 *
 * @author Hawin
 */
public class Chuoi {
    public static void main(String[] args) {
        String chuoi1 = "HllO  ";
        String chuoi2 = "abc";
        
        System.out.println("Chuyển in thường: "+chuoi1.toLowerCase());
        System.out.println("Chuyển in hoa: "+chuoi1.toUpperCase());   
        System.out.println(chuoi1+chuoi2);
        chuoi1 = chuoi1.trim();//bỏ ký tự trắng đầu, cuối
        System.out.println(chuoi1+chuoi2);
        System.out.println("-----------------------------");
        System.out.println("độ dài chuỗi:" + chuoi1.length());
        System.out.println("lấy chuỗi con:" + chuoi1.substring(1,3));
        System.out.println("Lấy ký tự tại vị trí: "+chuoi1.charAt(3));
        
        //Tìm và thay thế
        chuoi1 = chuoi1.replaceAll("l", "m");//thay chữ "l" = "m"
        System.out.println(chuoi1);
        
        String chuoi3 = "Hoa hong nhung ";
        chuoi3 = chuoi3.replaceAll(" ", "");
        System.out.println(chuoi3);
        
        //chuyển chuỗi thành mảng
        String[] mang = chuoi1.split("m");
        for (String string : mang) {
            System.out.println(string);
        }
        
        System.out.println("So sánh chuỗi hoa/thg: "+ "a".equals("A"));
        System.out.println("So sánh chuỗi ko p.biet: "+ "a".equalsIgnoreCase("A"));
        System.out.println("Kiểm tra tồn tại: "+ "abc".contains("B"));//có phân biệt hoa/thường
        System.out.println("Bắt đầu bởi: " +"abc".startsWith("a"));
        System.out.println("Kết thúc bởi: "+"abc".endsWith("C"));
        
        System.out.println(chuoi1);
        System.out.println("vị trí đầu: " +chuoi1.indexOf("m"));
        System.out.println("vị trí cuối: " +chuoi1.lastIndexOf("m"));
    }
}
