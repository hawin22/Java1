/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7_Bai5_OOP;

/**
 *
 * @author Hawin
 */
public class SinhVien{
    // 1. Thuộc tính
    //   Phải private(để chế độ riêng tư) tất cả thuộc tính
    private String msv;
    private String ten;
    private int namSinh ;
    private double diem ;
    private int gioiTinh ;  // 0:Nam  , 1: Nữ
    
    // 2. Construtor: hàm tạo => tạo đối tượng
    //2.1 Construtor ko có tham số
    // Ctrl + Space + enter
    public SinhVien() {
        System.out.println("Day la sv");
        namSinh = 2004; //
                }
    //2.2 Construtor có tham số
    // Ctrl + Space + enter 2 lần
    public SinhVien(String msv, String ten, int namSinh, double diem, int gioiTinh) {
        // this: biến tham số  tới đối tượng của lớp hiện tại
        this.msv = msv;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diem = diem;
        this.gioiTinh = gioiTinh;
    }
    // 3. Getter - setter
    // Vì thuộc tính bị private
    // Click chuột phải => Insert Code => Getter % Setter => Select All => Generate
    
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    // 4. Phương thức inthongtin()
  
    // toString()

    // Click chuột phải => Insert code => toString() => Generate

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", ten=" + ten + ", namSinh=" + namSinh + ", diem=" + diem + ", gioiTinh=" + gioiTinh + '}';
    }
    
    public void inthongtin(){
        System.out.println("SinhVien{" + "msv=" + msv + ", ten=" + ten + ", namSinh=" + namSinh + ", diem=" + diem + ", gioiTinh=" + gioiTinh + '}');

   
    
    }  
    
}