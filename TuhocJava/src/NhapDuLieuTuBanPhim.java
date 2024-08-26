
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class NhapDuLieuTuBanPhim {
    public static void main(String[] args) {
       /* String hoten = "PhamThu" ;
        int tuoi = 21 ;
        System.out.println("" + hoten + "nam nay" + tuoi + "tuoi"); // println: in có xuống dòng
        System.out.print("" + hoten + "nam nay" + tuoi + "tuoi");   // print: in ko xuống dòng
        System.out.println("\n");
        System.out.printf("%s nam nay %d tuoi",hoten,tuoi);  // tương tự như C     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        String hoTen = sc.nextLine();
        System.out.println("Nhap tuoi");
        int tuoi = sc.nextInt();
    
        System.out.println("Nhap ma SV:");
        String maSV = sc.nextLine();
        System.out.println("Nhap diem:");
        float diem = sc.nextFloat();
        System.out.println("======Xuat======");
        System.out.println("Ho ten :" + hoTen);
        System.out.println("Tuoi:" + tuoi);
        System.out.println("Ma SV:" + maSV);
        System.out.println("Diem:"+ diem);
    }
}
