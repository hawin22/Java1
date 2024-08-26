/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuhocjava;

/**
 *
 * @author Hawin
 */
import java.util.Scanner  ; // Phải có khi muốn nhập từ bàn phím
public class HamNhapTuBanPhim {
    public static void main(String[] args) {
       // sử dụng hàm scanner
       // scanner.nextLine(): Nhập 1 dòng nhập từ bàn phím
       // scanner.nextInt(): Nhập 1 số nguyên từ bàn phím
       // scanner.nextDouble(): Nhập 1 số thực từ bàn phím
       String hoten;
       int tuoi;
       Scanner scanner = new Scanner(System.in);//Phải có khi muốn nhập từ bàn phím
       System.out.print("Nhap ho ten:");
       hoten = scanner.nextLine();
       System.out.print("Nhap tuoi:");
       tuoi = scanner.nextInt();
        System.out.printf("%s nam nay %d tuoi\n",hoten,tuoi);
    }
}
