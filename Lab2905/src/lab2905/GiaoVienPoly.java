/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2905;

/**
 *
 * @author Hawin
 */
public class GiaoVienPoly extends GiaoVien{
    private String nganhDay;

    public GiaoVienPoly() {
    }

    public GiaoVienPoly(String nganhDay) {
        this.nganhDay = nganhDay;
    }

    public GiaoVienPoly(String nganhDay, int id, String ten, double soGioDay) {
        super(id, ten, soGioDay);
        this.nganhDay = nganhDay;
    }

    public String getNganhDay() {
        return nganhDay;
    }

    public void setNganhDay(String nganhDay) {
        this.nganhDay = nganhDay;
    }

    @Override
    public String toString() {
        return "GiaoVienPoly{" + "nganhDay=" + nganhDay + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("GiaoVienPoly{" + "nganhDay=" + nganhDay + '}');
    }
    
}
