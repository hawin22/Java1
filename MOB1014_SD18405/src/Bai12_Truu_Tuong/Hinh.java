/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12_Truu_Tuong;

/**
 *
 * @author Hawin
 */
public abstract class Hinh {
    // vì lớp chứa phương thức trừu tượng
    // => lớp 
    private String ten;

    public Hinh() {
    }

    public Hinh(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

   
    public abstract double tinhChuVi();
    
    public abstract double tinhDt();
    
}
