/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap4_De2;

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
public class DienThoaiService {

    ArrayList<DienThoai> listDT = new ArrayList<>();

    public DienThoaiService() {
        listDT.add(new DienThoai("01", "Apple", "Đen", "512GB", 12000000));
        listDT.add(new DienThoai("02", "SamSung", "Trắng", "128GB", 12000000));
        listDT.add(new DienThoai("03", "Apple", "Đen", "64GB", 12000000));
        listDT.add(new DienThoai("04", "Oppo", "Vàng", "256GB", 12000000));
        listDT.add(new DienThoai("05", "Oppo", "Đen", "64GB", 12000000));
    }

    ArrayList<DienThoai> getListDienThoai() {
        return listDT;
    }

    Boolean add(DienThoai dt) {

        listDT.add(dt);
        return true;

    }

    public String ghiFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                    FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (DienThoai dienThoai : listDT) {
                    oos.writeObject(dienThoai);
                }
            }
            return "Ghi thành công";

        } catch (Exception e) {
            return "Ghi thất bại";
        }
    }

    public String docFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                return " File ko tồn tại";
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listDT.add((DienThoai) ois.readObject());
                }
            }
            return "Đọc file thành công";
        } catch (Exception e) {
            return "Đọc file thất bại";

        }
    }
}
