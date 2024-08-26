/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap6;

import java.io.Serializable;

/**
 *
 * @author Hawin
 */
public class Sach implements Serializable{
    private String ten;
    private String theLoai;
    private Integer giaSach;

    public Sach() {
    }

    public Sach(String ten, String theLoai, Integer giaSach) {
        this.ten = ten;
        this.theLoai = theLoai;
        this.giaSach = giaSach;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Integer getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(Integer giaSach) {
        this.giaSach = giaSach;
    }

    @Override
    public String toString() {
        return "Sach{" + "ten=" + ten + ", theLoai=" + theLoai + ", giaSach=" + giaSach + '}';
    }
    
    
}
