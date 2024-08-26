/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Thi_3;

/**
 *
 * @author Hawin
 */
public class VaccineVN extends Vaccine{
    private String QuocGia;

    public VaccineVN() {
    }

    public VaccineVN(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public VaccineVN(String QuocGia, String MaVC, String TenVC, float thoigianTD, String ngayHetTD) {
        super(MaVC, TenVC, thoigianTD, ngayHetTD);
        this.QuocGia = QuocGia;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    @Override
    public String toString() {
        return "VaccineVN{" + "QuocGia=" + QuocGia + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("VaccineVN{" + "QuocGia=" + QuocGia + '}');
    }
    
    
}
