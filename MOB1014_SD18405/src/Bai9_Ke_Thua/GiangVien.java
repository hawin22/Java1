/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author Hawin
 */

// Kế thừa lại lớp cha(Người())

//Lớp con: GiangVien
//Lớp cha: Nguoi
// => GiangVien kế thừa từ Người = từ khóa "extends"

// Lớp con có thể kế thừa tất cả thuộc tính của lớp cha
// Trừ constructor

public class GiangVien extends Nguoi{
    private  String account;
    private String mailFE;
    
    // constructor: ctrl cách enter

    public GiangVien() {
    }

    public GiangVien(String account, String mailFE) {
        this.account = account;
        this.mailFE = mailFE;
    }
   // this: Biến tham chiếu tới đối tượng của lớp hiện tại
    // super: Biến tham chiếu tới đối tườn của lớp cha(Nguoi())
    public GiangVien(String account, String mailFE, String ten, int namSinh, int gioiTinh) {
        super(ten, namSinh, gioiTinh);
        this.account = account;
        this.mailFE = mailFE;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getMailFE() {
        return mailFE;
    }

    public void setMailFE(String mailFE) {
        this.mailFE = mailFE;
    }
    
    
    // override: ghi đè phương thức
    // chuột phải => Insert code => override Method =>chọn Method => inThongTin()

    @Override
    public String toString() {
        return "GiangVien{" + "account=" + account + ", mailFE=" + mailFE + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("GiangVien{" + "account=" + account + ", mailFE=" + mailFE + '}');
    }
    
    
}
