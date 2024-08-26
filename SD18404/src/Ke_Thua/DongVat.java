/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ke_Thua;

/**
 *
 * @author Hawin
 */
public class DongVat {
    int soChan = 2;
     private  String ten;
    protected double canNang = 12;
    public  String mauSac;
    
    public void diChuyen(){
        System.out.println("Dv di chuyen.");
    }

    public DongVat() {
    }

    public DongVat(String ten, String mauSac) {
        this.ten = ten;
        this.mauSac = mauSac;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

  

    
}
