/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QlyNhanVien {

    Scanner sc = new Scanner(System.in);

    //Khởi tạo danh sách
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    //Các phương thức thực hiện CN
    public QlyNhanVien() {
        dsNhanVien.add(new NhanVien("01", "gđ", 31, 100));
        dsNhanVien.add(new NhanVien("04", "gđ", 25, 90));
        dsNhanVien.add(new NhanVien("02", "gđ", 31, 40));
        dsNhanVien.add(new NhanVien("03", "gđ", 33, 540));
        dsNhanVien.add(new NhanVien("05", "gđ", 29, 35));
    }

    public void nhapDS() {
        int n;
        System.out.print("So luong nhan vien can nhap TT: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            NhanVien trHoc = new NhanVien();
            trHoc.nhapTT();

            dsNhanVien.add(trHoc);
            System.out.println();
        }
    }

    public void xuatDS() {
        for (NhanVien nhanVien : dsNhanVien) {
            nhanVien.xuatTT();
        }
    }

    public void Nhaptt() {
        // Lặp lại thao tác nhập
        do {
            // Khởi tạo 1 đối tượng
            NhanVien nv = new NhanVien();
            nv.nhapTT();
            dsNhanVien.add(nv);
            System.out.println("B co muon nhap tiep ko ???");
            if (sc.nextLine().equalsIgnoreCase("No")) {
                break;
            }

        } while (true);
    }

    public void tim() {
        System.out.println("Nhap ma sv can tim : ");
        String ma = sc.nextLine();
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if (dsNhanVien.get(i).getMaNV().equalsIgnoreCase(ma)) {
                System.out.println("Da tim thay ma vua nhap");
                dsNhanVien.get(i).xuatTT();

            }
        }
        System.out.println("Ko tim thay ma ");
    }

    public void timTheoChucVu() {
        System.out.println("Nhap CV can tim: ");
        String cv = sc.nextLine();
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if (dsNhanVien.get(i).getChucVu().equalsIgnoreCase(cv)) {
                System.out.println("Da tim thay cv vua nhap");
                dsNhanVien.get(i).xuatTT();
            }
        }
        System.out.println("Ko tim thay");
    }

    public void timTheokhoangLuong() {
        System.out.println("Nhap gt 2 moc luong:");
        double min = 0, max = 0;
        min = Double.parseDouble(sc.nextLine());
        max = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if (dsNhanVien.get(i).getLuong() >= min && dsNhanVien.get(i).getLuong() <= max) {
                dsNhanVien.get(i).xuatTT();
            }
        }
    }

    public void sua() {
        // Sửa thông tin nhân viên theo mã
        System.out.println("Nhap ma nv can tim");
        String ma = sc.nextLine();
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if (dsNhanVien.get(i).getMaNV().equalsIgnoreCase(ma)) {
                NhanVien nv = new NhanVien();
                System.out.println("Thay doi tt nv nhu sau:");
                nv.nhapTT();
                dsNhanVien.set(i, nv);
            }
        }
    }

    public void xoa() {
        System.out.println("Xoa tt");
        System.out.println("Nhap ma nv can tim");
        String ma = sc.nextLine();
        for (int i = 0; i < dsNhanVien.size(); i++) {
         if (dsNhanVien.get(i).getMaNV().equalsIgnoreCase(ma)) {
                dsNhanVien.remove(i);
                dsNhanVien.get(i).xuatTT();

           }
        }
    }

    public void sapXep() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               return o1.getMaNV().compareTo(o2.getMaNV());
            }
        };
        Collections.sort(dsNhanVien, comp);
        xuatDS();
    }
//    public void sapXepTheoLuong(){
//    Comparable<NhanVien> comp = new Comparable<NhanVien>() {
//        @Override
//        public int compare(NhanVien o1, NhanVien o2) {
//          return 0;
//          if(o1.getLuong())
//        } 
//    };
//    }
    public void MaxTuoi(){
    int maxTuoi = 0; // Biến chứa tuổi max
    int index = 0;  // Biến chứa chỉ số của nhân viên có tuổi max
    
        for (int i = 0; i < dsNhanVien.size(); i++) {
            if(maxTuoi<dsNhanVien.get(i).getTuoi()){
            maxTuoi = dsNhanVien.get(i).getTuoi();
            index = i;
            }
        }
        System.out.println("Nhan vien co tuoi lon nhat: ");
        dsNhanVien.get(index).xuatTT();
    }
}
