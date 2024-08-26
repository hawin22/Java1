/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_5;

/**
 *
 * @author Hawin
 */
public class IPhone extends DienThoai {
    private String mauSac;

    public IPhone() {
    }

    public IPhone(String mauSac) {
        this.mauSac = mauSac;
    }

    public IPhone(String mauSac, int ID, String seri, String ten, int gia, int dungLuong) {
        super(ID, seri, ten, gia, dungLuong);
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "IPhone{" + "mauSac=" + mauSac + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("IPhone{" + "mauSac=" + mauSac + '}');
    }
    
}
