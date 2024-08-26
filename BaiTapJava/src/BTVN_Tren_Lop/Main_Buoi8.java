/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Tren_Lop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Main_Buoi8 {
    public static void main(String[] args) {
// * - id: int
// * - hang: string
// * - congSuat: int
// * - gia: double
// * - xuatXu: string

        Scanner sc = new Scanner(System.in);
        Buoi8 dieuHoa1 = new Buoi8(01,"Panasonic",4000,30000000,"VietNam");
        Buoi8 dieuHoa2 = new Buoi8(02,"Toshiba",2000,15000000,"NhatBan");
        Buoi8 dieuHoa3 = new Buoi8(03,"SamSung",4000,330000000,"Han Quoc");
        Buoi8 dieuHoa4 = new Buoi8(04,"Panasonic",2300,20000000,"VietNam");
        Buoi8 dieuHoa5 = new Buoi8();
        System.out.println("*****Nhap thong tin*****");
        System.out.print("Nhap id: ");
        dieuHoa5.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap hang: ");
        dieuHoa5.setHang(sc.nextLine());
        System.out.print("Nhap cong suat: ");
        dieuHoa5.setCongSuat(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap gia: ");
        dieuHoa5.setGia(Double.parseDouble(sc.nextLine()));
        System.out.print("Nhap xuat xu: ");
        dieuHoa5.setXuatXu(sc.nextLine());
        
        System.out.println("*****Xuat thong tin*****");
        
        dieuHoa5.kiemTra();
        dieuHoa5.inThongTin();
        ArrayList <Buoi8> lstDH = new ArrayList<>();
        lstDH.add(dieuHoa1);
        lstDH.add(dieuHoa2);
        lstDH.add(dieuHoa3);
        lstDH.add(dieuHoa4);
        lstDH.add(dieuHoa5);
        for (int i = 0; i < lstDH.size(); i++) {
            lstDH.get(i).inThongTin();
        }
    }
     
}
