/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap2;

/**
 *
 * @author Hawin
 */
public class BanhTrungThu extends BanhKeo {

    private String nhanBanh;

    public BanhTrungThu() {
    }

    public BanhTrungThu(String nhanBanh) {
        this.nhanBanh = nhanBanh;
    }

    public BanhTrungThu(String nhanBanh, int code, int soLuong, String tenBK, String tenHangSX, double gia, boolean trangThai) {
        super(code, soLuong, tenBK, tenHangSX, gia, trangThai);
        this.nhanBanh = nhanBanh;
    }


    

    

    public String getNhanBanh() {
        return nhanBanh;
    }

    public void setNhanBanh(String nhanBanh) {
        this.nhanBanh = nhanBanh;
    }

    @Override
    public String toString() {
        return "BanhTrungThu{" + "nhanBanh=" + nhanBanh + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("BanhTrungThu{" + "nhanBanh=" + nhanBanh + '}');
    }

}
