/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Tren_Lop;



/**
 *
 * @author Hawin
 */
public class May_Tinh {

    /* BTVN
 * 
 * 1. Tạo class MayTinh gồm các thuộc tính
 * - ma: string
 * - hang: string
 * - namSX: int
 * - inch: double
 * - trangThai: int (1- mới, 2- cũ)
 
 * Đối với mỗi class, thực hiện các yêu cầu sau
 * => private tất cả thuộc tính, 
 * tạo constructor ko tham số và có tham số,
 * có đầy đủ Getter & Setter, tạo phương thức inThongTin()
 * => sang Main(): 
 * - tạo 2 đối tượng bằng ctor có tham số 
 * - tạo 1 đối tượng bằng ctor không tham số 
 * và nhập thông tin từ bàn phím cho đối tượng đó
 * - in toàn bộ thông tin ra màn hình bằng phương thức inThongTin()
 *
     */

    private String ma;
    private String hang;
    private int namSX;
    private double inch;
    private int trangThai;

    public May_Tinh() {
    }

   

    
    public May_Tinh(String ma, String hang, int namSX, double inch, int trangThai) {
        this.ma = ma;
        this.hang = hang;
        this.namSX = namSX;
        this.inch = inch;
        this.trangThai = trangThai;
       
    }

    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
// Phương thức inFor()
   
    @Override
    public String toString() {
        return "May_Tinh{" + "ma=" + ma + ", hang=" + hang + ", namSX=" + namSX + ", inch=" + inch + ", trangThai=" + trangThai + '}';
    }

    

   public void inInf(){
       System.out.println("ma=" + ma + ", hang=" + hang + ", namSX=" + namSX + ", inch=" + inch + ", trangThai=" +( trangThai==1?"Moi":"Cu") + '}');
   }
    
}
