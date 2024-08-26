/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin*/
import java.util.Scanner;


public class NhanVien {
    Scanner sc = new Scanner(System.in);
    
    //Trường
    private String maNV, chucVu;
    private int tuoi;
    private double luong;
    
    //constructor

    public NhanVien() {
    }

    public NhanVien(String maNV, String chucVu, int tuoi, double luong) {
        this.maNV = maNV;
        this.chucVu = chucVu;
        this.tuoi = tuoi;
        this.luong = luong;
    }
    
    
    //Phương thức    
    public void nhapTT(){
        System.out.print("Nhap ma NV: ");
        maNV = sc.nextLine();       
        System.out.print("Nhap luong NV: ");
        luong = Double.parseDouble(sc.nextLine());        
        System.out.print("Nhap tuoi NV: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap chuc vu NV: ");
        chucVu = sc.nextLine();
    }
    
    public void xuatTT(){
        System.out.println("MaNV: "+maNV+" - "+"luong: "+luong+" - "+"Tuoi: "+tuoi+" - "+"Chuc vu: "+chucVu+" - "+"Thue: "+thue());
    }
    
    public double thue(){
        return luong*0.1;
    }
    
    //getter & setter

    public String getMaNV() {
        return maNV;
    }

    public void setmaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}

