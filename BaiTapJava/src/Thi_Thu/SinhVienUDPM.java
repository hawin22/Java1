/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_Thu;

/**
 *
 * @author Hawin
 */
public class SinhVienUDPM extends SinhVien {

    private double diemJava;
    private double diemCsharo;

    public SinhVienUDPM() {
    }

    public SinhVienUDPM(double diemJava, double diemCsharo) {
        this.diemJava = diemJava;
        this.diemCsharo = diemCsharo;
    }

    public SinhVienUDPM(double diemJava, double diemCsharo, int MaSV, String ten, int namSinh, double diemCsharp) {
        super(MaSV, ten, namSinh, diemCsharp);
        this.diemJava = diemJava;
        this.diemCsharo = diemCsharo;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCsharo() {
        return diemCsharo;
    }

    public void setDiemCsharo(double diemCsharo) {
        this.diemCsharo = diemCsharo;
    }

    @Override
    public String toString() {
        return "SinhVienUDPM{" + "diemJava=" + diemJava + ", diemCsharo=" + diemCsharo + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("SinhVienUDPM{" + "diemJava=" + diemJava + ", diemCsharo=" + diemCsharo + '}');
    }

}
