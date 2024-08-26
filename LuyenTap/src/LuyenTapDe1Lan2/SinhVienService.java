/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTapDe1Lan2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class SinhVienService {
    ArrayList<SinhVien> listSV = new ArrayList<>();

    public SinhVienService() {
        listSV.add(new SinhVien("Ma01", "Hawin","Nữ", 2002));
        listSV.add(new SinhVien("Ma02","Thu" ,"Nam", 2000));
        listSV.add(new SinhVien("Ma03", "Lâm","Nữ", 2001));
        listSV.add(new SinhVien("Ma04","Nhân" ,"Nam", 2001));
        listSV.add(new SinhVien("Ma05", "Như","Nữ", 2003));
    }
    ArrayList<SinhVien> getListSinhVien(){
        return listSV;
    }
    public String docFile(String fileName){
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                return "File không tồn tại";
            }
            try(FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                    while(fis.available() > 0){
                        listSV.add((SinhVien) ois.readObject());
                    }
                    }
                    return "Đọc file thành công";
        } catch (Exception e) {
            return "Đọc file thất bại";
        }}
    
         public String ghiFile(String fileName){
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try(FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    for (SinhVien sinhVien : listSV) {
                    oos.writeObject(sinhVien);
                }
                    }
                    return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }
         Boolean xoa(int i){
             listSV.remove(i);
             return true;
         }
         Boolean add(SinhVien sv){
             listSV.add(sv);
             return true;
         }
}
