/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap6;

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
public class SachService {

    ArrayList<Sach> listSach = new ArrayList<>();

    public SachService() {
        listSach.add(new Sach("thu", "Tiểu thuyết", 55000));
        listSach.add(new Sach("hawin", "Trinh thám", 55000));
        listSach.add(new Sach("hzdch", "Tiểu thuyết", 55000));
        listSach.add(new Sach("dùu", "Tiểu thuyết", 55000));
        listSach.add(new Sach("reifsj", "Trinh thám", 55000));
    }

    ArrayList<Sach> getListSach() {
        return listSach;
    }

    Boolean add(Sach sach){
        listSach.add(sach);
        return true;
    }
    Boolean delete(int i) {
        listSach.remove(i);
        return true;
    }

    public String docFile(String filename) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                return "File không tồn tại";

            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listSach.add((Sach) ois.readObject());
                }
            }
            return "Đọc thành công";
        } catch (Exception e) {
            return "Đọc thất bại";
        }
    }

    public String ghiFile(String filename) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                file.createNewFile();

            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (Sach sach : listSach) {
                    oos.writeObject(sach);

                }
            }
            return "Ghi thành công";
        } catch (Exception e) {
            return "Ghi thất bại";
        }
    }
}
