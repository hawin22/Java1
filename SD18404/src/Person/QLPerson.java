/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class QLPerson {

    ArrayList<Person> dsNguoi = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Person nguoi;

    public void nhapTT() {
        String tiepTuc;
        do {
        nguoi = new Person();
        System.out.println("Nhap ho ten: ");
        nguoi.setHoTen(sc.nextLine());
        System.out.println("Nhap tuoi: ");
        nguoi.setTuoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap gioi tinh: ");
        nguoi.setGioiTinh(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap chieu cao: ");
        nguoi.setChieuCao(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap can nang: ");
        nguoi.setCanNang(Double.parseDouble(sc.nextLine()));
            dsNguoi.add(nguoi);
            System.out.println("B co muon nhap tiep ko [yes]:Co-[No]:Ko");

            tiepTuc = sc.nextLine();
               

        } while (tiepTuc.equals("yes"));

    }

    public void xuatTT() {
         if (dsNguoi.isEmpty()) {
            return;
         }
             for (Person person : dsNguoi) {
                 person.xuat();
             }
    }
    public void xuatNu(){
        for (int i = 0; i < dsNguoi.size(); i++) {
            if(dsNguoi.get(i).getGioiTinh()==2){
            dsNguoi.get(i).xuat();
            }
        }
    }
    public void dem(){
        int dem = 0;
        for (int i = 0; i < dsNguoi.size(); i++) {
            if(dsNguoi.get(i).getTuoi()<18){
            dem ++;
            dsNguoi.get(i).xuat();
            }
        }
        System.out.println("So ps co so tuoi it hon 18t: "+dem);
    }
    
}
