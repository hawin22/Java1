/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12_Truu_Tuong;

/**
 *
 * @author Hawin
 */
public class Hinh_Tron  extends Hinh{
    private double r;

    public Hinh_Tron() {
    }

    public Hinh_Tron(double r) {
        this.r = r;
    }

    public Hinh_Tron(double r, String ten) {
        super(ten);
        this.r = r;
    }

    @Override
    public double tinhChuVi() {
       return 2*3.14*r;
    }

    @Override
    public double tinhDt() {
        return 3.14*r*r;
    }
    
    
}
