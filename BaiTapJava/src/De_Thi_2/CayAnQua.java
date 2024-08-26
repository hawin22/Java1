/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Thi_2;

/**
 *
 * @author Hawin
 */
public class CayAnQua extends Cay{
    private int soQua;

    public CayAnQua() {
    }

    public CayAnQua(int soQua) {
        this.soQua = soQua;
    }

    public CayAnQua(int soQua, int ID, String loaiCay, String ten) {
        super(ID, loaiCay, ten);
        this.soQua = soQua;
    }

    public int getSoQua() {
        return soQua;
    }

    public void setSoQua(int soQua) {
        this.soQua = soQua;
    }

    @Override
    public String toString() {
        return "CayAnQua{" + "soQua=" + soQua + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("CayAnQua{" + "soQua=" + soQua + '}');
    }
    
}
