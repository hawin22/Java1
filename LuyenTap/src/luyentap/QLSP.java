/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * 1. Tạo lớp SanPham có các thuộc tính sau: maSP - String, tenSP - String,
 * soLuong int, giaBan - int, maDanhMuc - String, trangThai - String
 *
 * 2. Hiển thị các thông tin sau: mã sản phẩm, tên sản phẩm, số lượng, giá bán,
 * thành tiên = số lương* giá bán, danh mục, trạng thái 3. Thêm mới 1 sản phẩm (
 * Kiểm tra nếu mã sản phẩm đã tồn tại thì không cho thêm mới) 4. Xoá 1 sản phẩm
 * 5. Tìm kiếm sản phẩm theo khoảng giá
 *
 * 6. Đọc ghi file
 *
 * @author Hawin
 */
public class QLSP {

    ArrayList<SanPham> listSanPham = new ArrayList<>();

    public QLSP() {
        listSanPham.add(new SanPham("Ma01", "Bánh kẹo", 120, 31, 3720, "Danh mục 1", "Còn hàng"));
        listSanPham.add(new SanPham("Ma02", "Đường", 213, 20, 4260, "Danh mục 2", "Hết hàng"));
        listSanPham.add(new SanPham("Ma03", "Snack", 54, 10, 540, "Danh mục 2", "Còn hàng"));
        listSanPham.add(new SanPham("Ma04", "Nước có ga", 134, 12, 1608, "Danh mục 3", "Còn hàng"));
    }

    ArrayList<SanPham> getListSanPham() {
        return listSanPham;
    }

    Boolean add(SanPham sp) {
        for (SanPham sanPham : listSanPham) {
            if (sanPham.getMaSP().equals(sp.getMaSP())) {
                return false;
            }
        }
        listSanPham.add(sp);
        return true;
    }

    Boolean remove(int i) {
        listSanPham.remove(i);
        return true;
    }

    ArrayList<SanPham> search(int giaMin, int giaMax) {
        ArrayList<SanPham> result = new ArrayList<>();
        for (SanPham sanPham : listSanPham) {
            if (sanPham.getGiaBan() > giaMin && sanPham.getGiaBan() < giaMax) {
                result.add(sanPham);
            }
        }
        return result;
    }

    // Đọc file
    public String docFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                return "File ko tồn tại";
            }
            try (
                    FileInputStream fis = new FileInputStream(file); 
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                    while (fis.available() > 0) {
                    listSanPham.add((SanPham) ois.readObject());
                }
                
            }
            return "Đọc file thành công";
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
    }

    // Ghi file
    public String ghiFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SanPham sp : listSanPham) {
                    oos.writeObject(sp);
                }
            }
            return "Ghi file thành công";

        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }
}
