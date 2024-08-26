/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Thi_3;

/**
 *
 * @author Hawin
 */
public class Vaccine {
    private String MaVC;
    private String TenVC;
    private float thoigianTD;
    private String ngayHetTD;

    public Vaccine() {
    }

    public Vaccine(String MaVC, String TenVC, float thoigianTD, String ngayHetTD) {
        this.MaVC = MaVC;
        this.TenVC = TenVC;
        this.thoigianTD = thoigianTD;
        this.ngayHetTD = ngayHetTD;
    }

    public String getMaVC() {
        return MaVC;
    }

    public void setMaVC(String MaVC) {
        this.MaVC = MaVC;
    }

    public String getTenVC() {
        return TenVC;
    }

    public void setTenVC(String TenVC) {
        this.TenVC = TenVC;
    }

    public float getThoigianTD() {
        return thoigianTD;
    }

    public void setThoigianTD(float thoigianTD) {
        this.thoigianTD = thoigianTD;
    }

    public String getNgayHetTD() {
        return ngayHetTD;
    }

    public void setNgayHetTD(String ngayHetTD) {
        this.ngayHetTD = ngayHetTD;
    }

    @Override
    public String toString() {
        return "Vaccine{" + "MaVC=" + MaVC + ", TenVC=" + TenVC + ", thoigianTD=" + thoigianTD + ", ngayHetTD=" + ngayHetTD + '}';
    }

   public void inThongTin(){
       System.out.println("Vaccine{" + "MaVC=" + MaVC + ", TenVC=" + TenVC + ", thoigianTD=" + thoigianTD + ", ngayHetTD=" + ngayHetTD + '}');
   }
}
