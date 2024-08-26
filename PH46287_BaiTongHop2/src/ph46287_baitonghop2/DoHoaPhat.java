/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph46287_baitonghop2;

/**
 *
 * @author Hawin
 */
public class DoHoaPhat extends DoVat{
    private String chatLieu;

    public DoHoaPhat() {
    }

    public DoHoaPhat(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public DoHoaPhat(String chatLieu, String maDoVat, String tenDoVat, int loai, double gia) {
        super(maDoVat, tenDoVat, loai, gia);
        this.chatLieu = chatLieu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    @Override
    public String toString() {
        return "DoHoaPhat{" + "chatLieu=" + chatLieu + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("DoHoaPhat{" + "chatLieu=" + chatLieu + '}');
    }
    
}
