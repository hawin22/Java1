/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_5;

/**
 *
 * @author Hawin
 */
public class DienThoai {
    private int ID;
    private String seri;
    private String ten;
    private int gia;
    private int dungLuong;

    public DienThoai() {
    }

    public DienThoai(int ID, String seri, String ten, int gia, int dungLuong) {
        this.ID = ID;
        this.seri = seri;
        this.ten = ten;
        this.gia = gia;
        this.dungLuong = dungLuong;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "ID=" + ID + ", seri=" + seri + ", ten=" + ten + ", gia=" + gia + ", dungLuong=" + dungLuong + '}';
    }
    
    
    public void inThongTin(){
        System.out.println("DienThoai{" + "ID=" + ID + ", seri=" + seri + ", ten=" + ten + ", gia=" + gia + ", dungLuong=" + dungLuong + '}');
    }
    
}
