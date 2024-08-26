/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_5;

import java.util.Scanner;

/*
- Tạo class HocSinh có các trường DL và phương thức như sau:
	- Trường: họ tên, lớp, điểm TB, tên trường
	- Phương thức: xuatTT(), hocLuc(), capHoc()
=> Các trường có đặc tả truy xuất private
	có bổ sung getter-setter
=> Các phương thức có đặc tả public
	 private với phương thức hocLuc(), capHoc()
=> xuatTT(): họ tên - lớp - cấp học - học lực - tên trường
=> Khi nhập lớp chỉ cho nhap lơp tu 1 den 12
=> Diem TB nhap vao trong khoảng tư 0-10

- Tạo 1 đối tượng học sinh, nhập và xuất thông tin cho đối tượng đó.
- Tạo 1 đối tượng học sinh không có thông tin lớp(học sinh chưa được
	xếp lớp), không có thông tin điểm
	In ra thông tin của học sinh đó.
 */
public class HocSinh {
 Scanner sc = new Scanner(System.in);
    private String hoTen;
    private String truong;
    private int lop;
    private double diem;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String truong, int lop, double diem) {
        this.hoTen = hoTen;
        this.truong = truong;
        this.lop = lop;
        this.diem = diem;
    }

    public HocSinh(String hoTen, String truong) {
        this.hoTen = hoTen;
        this.truong = truong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
  void nhapTT(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap ho ten hs");
      hoTen = sc.nextLine();
      System.out.println("Nhap lop hs");
      lop = Integer.parseInt(sc.nextLine());
      while (lop<1||lop>12) {
          System.out.println("Nhap  lai:");
          lop = Integer.parseInt(sc.nextLine());
      }
      System.out.println("Nhap diemTB cua hs");
      diem = Double.parseDouble(sc.nextLine());
      while (diem<0||diem>10) {
          System.out.println("Nhap lai diem");
          diem = Double.parseDouble(sc.nextLine());
      }
  
  }
       
        
   void xuatTT() {
       System.out.println(hoTen+ " -"+truong+" - " +lop+" - "+diem);
    }

  private void hocLuc(){
           String hL = null;
        for (int i = 0; i <=10; i++) {
           if(diem<5) {
              hL = "Yeu"; 
        }
           else if(diem<6.5){
               hL="TB";
           }
           else if(diem<7.5){
               hL="Kha";
           }
           else if(diem<9 ){
               hL="Gioi";
        } else {
               hL="Xuat sac";
           }
    }
        System.out.println(hL);
    }

    private void capHoc() {
        
    }
}
