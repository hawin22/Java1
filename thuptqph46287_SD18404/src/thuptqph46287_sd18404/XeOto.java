/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuptqph46287_sd18404;

/**
 *
 * @author Hawin
 */
public class XeOto extends Xe{
    private int maLuc;

    public XeOto() {
    }

    public XeOto(int maLuc) {
        this.maLuc = maLuc;
    }

    public XeOto(int maLuc, String maXe, String hangSX, String mau, double gia) {
        super(maXe, hangSX, mau, gia);
        this.maLuc = maLuc;
    }

    public int getMaLuc() {
        return maLuc;
    }

    public void setMaLuc(int maLuc) {
        this.maLuc = maLuc;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
    }
    
    
}
