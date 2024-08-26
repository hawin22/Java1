/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;


import java.util.Scanner;

/**
 *
 * @author Ha Thanh
 */
abstract public class NhanVien {
    Scanner sc = new Scanner(System.in);
    private String maNV;
    private String hoTen;
    private double luong;
    private int cv;
    
    
    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public NhanVien() {
    }
    void nhapTT(){
        
        System.out.print("Nhap ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = Double.parseDouble(sc.nextLine());
        System.out.println("nhap cv 1- truong phong/ 2- tiep thi");
        cv = Integer.parseInt(sc.nextLine());
        if(cv==1){
            System.out.println("nhap trach nhiem:");
            double trach = sc.nextDouble();
           NhanVien tp = new TruongPhuong(trach, maNV, hoTen, luong);
        }else if(cv==2){
            double hoahong, doanhso;
            System.out.println("nhap hoa hong: ");
            hoahong = Double.parseDouble(sc.nextLine());
            System.out.println("DOANH so: ");
            doanhso = Double.parseDouble(sc.nextLine());
            NhanVien tt = new TiepThi(doanhso, hoahong, maNV, hoTen, luong);
        }
            
            
        
        
           
    }
    public void xuatTT(){
        System.out.println("Ten nhan vien: "+ hoTen);
        System.out.println("Ma nhan vien: "+ maNV);
        System.out.println("Luong nhan vien: "+ luong);
         System.out.println("thu nhap:"+thuNhap());
        System.out.println("ThueTN nhan vien: "+ thueTN());
       
    }
    abstract public double thuNhap();
        
    
    public double thueTN(){
        
       if (thuNhap()<9000000) {
             
            return 0.0;
        } else if (thuNhap()<15000000) {
            return thuNhap()*0.1;
        } else  {
            return (15000000*0.1)+(thuNhap()-15000000)*0.12;
        }

        
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
       
        
    

    

    
    
        
    
}
    

