/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Kiem_Tra;

/**
 *
 * @author Hawin
 */
public class KemOcQue extends Kem {

    private int vi;

    public KemOcQue() {
    }

    public KemOcQue(int vi) {
        this.vi = vi;
    }

    public KemOcQue(int vi, String ma, String ten, double gia, int soLuong) {
        super(ma, ten, gia, soLuong);
        this.vi = vi;
    }

    public int getVi() {
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
    }

    @Override
    public String toString() {
        return "KemOcQue{" + "vi=" + vi + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("KemOcQue{" + "vi=" + (vi == 1 ? "Socola" : "Vani") + '}');
    }

}
