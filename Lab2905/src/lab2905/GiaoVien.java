package lab2905;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class GiaoVien {
    private int id;
    private String ten;
    private double soGioDay;

    public GiaoVien() {
    }

    public GiaoVien(int id, String ten, double soGioDay) {
        this.id = id;
        this.ten = ten;
        this.soGioDay = soGioDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(double soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "id=" + id + ", ten=" + ten + ", soGioDay=" + soGioDay + '}';
    }
   public void inThongTin(){
       System.out.println("GiaoVien{" + "id=" + id + ", ten=" + ten + ", soGioDay=" + soGioDay + '}');
   }
    
}
