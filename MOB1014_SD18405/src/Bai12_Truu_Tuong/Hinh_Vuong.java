/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12_Truu_Tuong;

/**
 *
 * @author Hawin
 */
public class Hinh_Vuong extends Hinh{
    private double canh;

    public Hinh_Vuong() {
    }

    public Hinh_Vuong(double canh) {
        this.canh = canh;
    }

    public Hinh_Vuong(double canh, String ten) {
        super(ten);
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public double tinhDt() {
        return canh*canh;
    }
     
    
}
