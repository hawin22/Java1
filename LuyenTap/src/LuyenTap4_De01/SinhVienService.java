/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap4_De01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hawin
 */
public class SinhVienService {

    ArrayList<SinhVien> listSV = new ArrayList<>();
    ArrayList<SinhVien> listDoc = listSV;

    public SinhVienService() {
        listSV.add(new SinhVien("SV1", "Hawin", "Nữ", 2002));
        listSV.add(new SinhVien("SV2", "Trang", "Nữ", 2004));
        listSV.add(new SinhVien("SV3", "Nam", "Nam", 2001));
        listSV.add(new SinhVien("SV4", "Thúy Phương", "Nữ", 2002));

    }

    ArrayList<SinhVien> getListSinhVien() {
        return listSV;
    }

    ArrayList<SinhVien> getList() {
        return listDoc;
    }

    public String docFile(String filename) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                return "File không tồn tại";
            }
            try (
                    FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listSV.add((SinhVien) ois.readObject());
                }
            }
            return "Đọc file thành công";

        } catch (Exception e) {
            return "Đọc file thất bại";
        }
    }

    public String ghiFile(String filename) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                    FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SinhVien sinhVien : listSV) {
                    oos.writeObject(sinhVien);
                }
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }
    Boolean add(SinhVien sv){
        if (sv.getMaSV().trim().isEmpty() || sv.getTenSV().trim().isEmpty() || sv.getGioiTinh().trim().isEmpty() ) {
            return false;
        }
        else{
            listSV.add(sv);
            return true;
        }
    }
    Boolean delete(int i){
        listSV.remove(i);
        return true;
    }
}
