/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_QL_Oto;

/**
 *
 * @author Hawin
 */
public class Oto {
    // 1. Thuộc tính
    private int id;
    private  String hang;
    private double gia;
    private int namSx;
    private int trangThai;// 1-Mới   2-Cũ
    
    // 2. Construtor

    public Oto() {
    }

    public Oto(int id, String hang, double gia, int namSx, int trangThai) {
        this.id = id;
        this.hang = hang;
        this.gia = gia;
        this.namSx = namSx;
        this.trangThai = trangThai;
    }
    
    // 3. Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    // 4. inThongTin()

    @Override
    public String toString() {
        return "Oto{" + "id=" + id + ", hang=" + hang + ", gia=" + gia + ", namSx=" + namSx + ", trangThai=" + trangThai + '}';
       
    }
    public void inThongTin(){
        System.out.println("Oto{" + "id=" + id + ", hang=" + hang + ", gia=" + gia + ", namSx=" + namSx + ", trangThai=" + trangThai + '}');
    }
    
    
    
    
}
