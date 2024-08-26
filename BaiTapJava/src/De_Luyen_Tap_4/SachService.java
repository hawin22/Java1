/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Luyen_Tap_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Hawin
 */
public class SachService {

    ArrayList<Sach> _lstSach = new ArrayList();
    Scanner _sc = new Scanner(System.in);
    Sach sach;

    public SachService() {
        _lstSach.add(new Sach("S15949", "thu gau", "truyen", 2002, "Kim dong", 120400));
        _lstSach.add(new Sach("S51065", "acb", "khoa hoc", 2000, "Kim dong", 14050));
        _lstSach.add(new Sach("S25124", "mkg", "ngu ngon", 1999, "Kim dong", 4400));
        _lstSach.add(new Sach("S94625", "qfg", "cuoi", 2000, "Kim dong", 11400));
        _lstSach.add(new Sach("S41526", "pol", "khoa hoc", 2012, "Kim dong", 1100));
        _lstSach.add(new Sach("S1", "gau", "truyen", 1980, "Kim dong", 1200));
    }
//
//    public String kiemTraDauVao(String msg, String pattern) {
//        String input;
//        do {
//            System.out.println("Nhap" + msg + " : ");
//            input = _sc.nextLine();
//            if (!input.matches(pattern)) {
//                System.out.println("Moi nhap lai: ");
//            }
//        } while (!input.matches(pattern));
//        return input;
//    }
    public String kiemTraDauVao(String msg, String pattern){
        String input;
        do {
            System.out.println("Nhap " + msg + " : "); 
            input = _sc.nextLine();
            if(!input.matches(pattern)){
                System.out.println("Moi nhap lai: ");
            }
        } while (!input.matches(pattern));
        return input;
    }
    public void nhap() {
        sach = new Sach();
        int tiepTuc;
        do {
            // Code chỉ đc số hoặc chữ, và chỉ đc 6 kí tự =>Nhập sai, nhập lại
            System.out.println("Nhap code sach: ");
            sach.setCode(_sc.nextLine());
//          sach.setCode(kiemTraDauVao("code", "^[a-zA-Z0-9]{6}$"));           
            System.out.println("Nhap ten sach: ");
            sach.setTen(_sc.nextLine());
            System.out.println("Nhap the loai: ");
            sach.setTheLoai(_sc.nextLine());
            System.out.println("Nhap nam xuat ban: ");
            sach.setNamXuatBan(Integer.parseInt(kiemTraDauVao("namXuatBan", "^[0-9]{4}$")));
          // sach.setNamXuatBan(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap nha xuat ban: ");
            sach.setNhaXuatBan(_sc.nextLine());
            System.out.println("Nhap gia sach: ");
            sach.setGia(Double.parseDouble(_sc.nextLine()));
            _lstSach.add(sach);
            System.out.println("B co muon nhap tiep tuc nhap ko: 1-Co,2-Ko ");
            tiepTuc = Integer.parseInt(_sc.nextLine());
        } while (tiepTuc == 1);
    }

    public void xuat() {
        if (_lstSach.isEmpty()) {
            return;
        }
        for (Sach sach1 : _lstSach) {
            sach1.inThongTin();
        }
    }
    public void xuatTrongKhoang(){
        int dem = 0;
        double min = 0;
        System.out.println("Nhap min: ");
        min = Double.parseDouble(_sc.nextLine());
        double max =0;
        System.out.println("Nhap max: ");
        do {  
            max = Double.parseDouble(_sc.nextLine());
            if(min<max){
              break;
            } else{
                System.out.println("Min phai nho hon max, nhap lai max");
            }
        } while (true);
        for (int i = 0; i < _lstSach.size(); i++) {
            
            if(_lstSach.get(i).getGia()>=min&&_lstSach.get(i).getGia()<=max){
                _lstSach.get(i).inThongTin();
                dem++;
            }
        }
         if (dem == 0) {
            System.out.println("Ko tim thay");
        }
    }
    public void sXGTheoNam(){
        Collections.sort(_lstSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
               return -Integer.compare(o1.getNamXuatBan(), o2.getNamXuatBan());
            }
        }
        );
        xuat();
    }
    public void timTheoCode(){
        String searchCode ;
        System.out.println("Nhap code can tim: ");
        searchCode = _sc.nextLine();
        for (int i = 0; i < _lstSach.size(); i++) {
            if(_lstSach.get(i).getCode().equalsIgnoreCase(searchCode)){
                _lstSach.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Ko tim thay!!!");
    }
    public void xoa(){
        String reCode;
        System.out.println("Nhap code can xoa: ");
        reCode = _sc.nextLine();
        for (int i = 0; i < _lstSach.size(); i++) {
            if(_lstSach.get(i).getCode().equalsIgnoreCase(reCode)){
                 _lstSach.get(i).inThongTin();
                 _lstSach.remove(i);
                 System.out.println("Da xoa!!!");
                 return;
            }
        }
        System.out.println("Ko tim thay!!!");
        xuat();
    }
    public void sXTTheoTen(){
        Collections.sort(_lstSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
              return o1.getTen().compareTo(o2.getTen());
            }
        }
        );
        xuat();
    }
    public void sXGTheoGia(){
        Collections.sort(_lstSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
               return -Double.compare(o1.getGia(), o2.getGia());
            }
        }
        );
        xuat();
    }
    public void sachSauNam2000(){
        int count = 0;
        for (int i = 0; i < _lstSach.size(); i++) {
            if(_lstSach.get(i).getNamXuatBan()>2000){
                _lstSach.get(i).inThongTin();
                count++;
            }
        }
         if (count == 0) {
            System.out.println("Ko tim thay");
        }
       
    }
    public void xuatKhoaHoc(){
        int d = 0;
        for (int i = 0; i < _lstSach.size(); i++) {
            if(_lstSach.get(i).getTheLoai().equalsIgnoreCase("Khoa hoc")){
                _lstSach.get(i).inThongTin();
                d++;
            }
        }
        if(d==0){
            System.out.println("Ko tim thay!!!");
        }
    }
    
    public void timTenGD() {
        System.out.println("Nhap ten can tim: ");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstSach.size(); i++) {
            if (_lstSach.get(i).getTen().contains(input)) {
                _lstSach.get(i).inThongTin();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ko thay ten");
        }

    }
    public void minMax(){
        double min = _lstSach.get(0).getGia(), max = _lstSach.get(0).getGia();
        for (int i = 0; i < _lstSach.size(); i++) {
            if(min>_lstSach.get(i).getGia()){
                min = _lstSach.get(i).getGia();
            }
        }
        for (int i = 0; i < _lstSach.size(); i++) {
            if(min == _lstSach.get(i).getGia()){
                System.out.println("Min: "+min);
                _lstSach.get(i).inThongTin();
            }
        }
         for (int i = 0; i < _lstSach.size(); i++) {
            if(max<_lstSach.get(i).getGia()){
                max = _lstSach.get(i).getGia();
            }
        }
        for (int i = 0; i < _lstSach.size(); i++) {
            if(max == _lstSach.get(i).getGia()){
                System.out.println("Max: "+max);
                _lstSach.get(i).inThongTin();
            }
        }
    }
    public void dem(){
        System.out.println("Nhap min, max: ");
        int count = 0;
        double min = Double.parseDouble(_sc.nextLine());
        double max = Double.parseDouble(_sc.nextLine());
        for (int i = 0; i < _lstSach.size(); i++) {
            if(_lstSach.get(i).getGia()<min||_lstSach.get(i).getGia()>max){
                _lstSach.get(i).inThongTin();
               count++;
            }
        }
        if(count==0){
            System.out.println("Ko tim thay!!!");
        }
    }
    public void searchMa(){ 
        int dem = 0;
        for (int i = 0; i < _lstSach.size(); i++) {
            if(_lstSach.get(i).getCode().startsWith("SGK")){
                _lstSach.get(i).inThongTin();
                dem ++;
            }
        }
        if(dem==0){
            System.out.println("Ko tim thay!!");
        }
    }
    public void keThua(){
        SachGiaoKhoa sach = new SachGiaoKhoa();
        SachGiaoKhoa sach1 = new SachGiaoKhoa(1, "02", "Tieng Viet", "SGK", 2018, "Kim Dong", 21000);
        System.out.println("Nhap code: ");
        sach.setCode(_sc.nextLine());
        System.out.println("Nhap ten: ");
        sach.setTen(_sc.nextLine());
        System.out.println("Nhap the loai: ");
        sach.setTheLoai(_sc.nextLine());
        System.out.println("Nhap nam san xuat: ");
        
        sach.setNamXuatBan(Integer.parseInt(_sc.nextLine()));
        System.out.println("Nhap nha san xuat: ");
        sach.setNhaXuatBan(_sc.nextLine());
        System.out.println("Nhap gia: ");
        sach.setGia(Double.parseDouble(_sc.nextLine()));
        System.out.println("Nhap lop: ");
        sach.setLop(Integer.parseInt(_sc.nextLine()));
        sach.inThongTin();
    }
}
