/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Thi_2;

/**
 *
 * @author Hawin
 */
public class Cay {
   private  int ID;
   private  String loaiCay;
   private  String ten;

    public Cay() {
    }

    public Cay(int ID, String loaiCay, String ten) {
        this.ID = ID;
        this.loaiCay = loaiCay;
        this.ten = ten;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLoaiCay() {
        return loaiCay;
    }

    public void setLoaiCay(String loaiCay) {
        this.loaiCay = loaiCay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Cay{" + "ID=" + ID + ", loaiCay=" + loaiCay + ", ten=" + ten + '}';
    }
   public void inThongTin(){
       System.out.println( "Cay{" + "ID=" + ID + ", loaiCay=" + loaiCay + ", ten=" + ten + '}');
   } 
    
}
