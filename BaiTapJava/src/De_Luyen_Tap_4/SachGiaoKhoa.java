/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_4;

import De_Luyen_Tap_4.Sach;

/**
 *
 * @author Hawin
 */
public class SachGiaoKhoa extends Sach {
    private int lop;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(int lop) {
        this.lop = lop;
    }

    public SachGiaoKhoa(int lop, String code, String ten, String theLoai, int namXuatBan, String nhaXuatBan, double gia) {
        super(code, ten, theLoai, namXuatBan, nhaXuatBan, gia);
        this.lop = lop;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" + "lop=" + lop + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println( "SachGiaoKhoa{" + "lop=" + lop + '}');
    }
    
    
}
