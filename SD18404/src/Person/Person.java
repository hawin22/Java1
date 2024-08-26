/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Person {
    Scanner sc = new Scanner(System.in);
    private String hoTen;
    private int tuoi, gioiTinh;
    private double chieuCao, canNang;

    public Person() {
    }

    public Person(String hoTen, int tuoi, int gioiTinh, double chieuCao, double canNang) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "Person{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh="
                + gioiTinh + ", chieuCao=" + chieuCao + ", canNang=" + canNang + '}';
    }
   
    
    public void xuat() {
        System.out.println("Person{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ","
                + " gioiTinh=" + (gioiTinh==1?"Nam":"Nu") + ", chieuCao=" + chieuCao + ", canNang=" + canNang + '}');
    }
}
