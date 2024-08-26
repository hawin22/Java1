/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6_ArrayList;

/**
 *
 * @author Hawin
 */
public class Con_Meo {
      /* 2. Tạo class ConMeo gồm các thuộc tính
 * - id: int
 * - ten: string
 * - tuoi: int
 * - loai: string
 * - canNang: double
 * - gioiTinh: bool (true- đực, false- cái)
     
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
   private int id ;
   private String ten;
   private int tuoi;
   private String loai;
   private double canNang;
   private boolean gioiTinh;

    public Con_Meo() {
    }

    public Con_Meo(int id, String ten, int tuoi, String loai, double canNang, boolean gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.loai = loai;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Con_Meo{" + "id=" + id + ", ten=" + ten + ", tuoi=" + tuoi + ", loai=" + loai + ", canNang=" + canNang + ", gioiTinh=" + gioiTinh + '}';
    }
   
    public void inFor(){
        System.out.println("Con_Meo{" + "id=" + id + ", ten=" + ten + ", tuoi=" + tuoi + ", loai=" + loai + ", canNang=" + canNang + ", gioiTinh=" + gioiTinh + '}');
        
    }
    public String getGioiTinh(){
        if(gioiTinh){
            return "duc";
        } 
        return "cai" ;
    }
   
}
