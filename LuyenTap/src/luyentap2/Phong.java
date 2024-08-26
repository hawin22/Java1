/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap2;

/**
 *
 * @author Hawin
 */
public class Phong {
    private int soPhong;
    private String khuVuc;
    private String loaiPhong;

    public Phong() {
    }

    public Phong(int soPhong, String khuVuc, String loaiPhong) {
        this.soPhong = soPhong;
        this.khuVuc = khuVuc;
        this.loaiPhong = loaiPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }
    
    
}
