/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Tren_Lop;

/**
 *
 * @author Hawin
 */

    /*BTVN
 * P1. Tạo class DieuHoa gồm các thuộc tính
 * - id: int
 * - hang: string
 * - congSuat: int
 * - gia: double
 * - xuatXu: string
 * => private tất cả thuộc tính, 
 * tạo constructor ko tham số và có tham số,
 * có đầy đủ Getter & Setter, tạo phương thức inThongTin()
 * 
 * tạo phương thức kiemTra(): boolean 
 * => kiểm tra nếu gia > 20,000,000 và công suất >=3000 trả về đúng, và ngược lại
 * 
 * bổ sung vào thêm phương thức inThongTin():
 * in ra "Hàng Chất Lượng Cao"
 * nếu kiemTra() trả về kết quả đúng
 * P2.
 * - tạo 4 đối tượng bằng ctor có tham số
 * - tạo 1 đối tượng bằng ctor không tham số -> nhập thông tin từ bàn phím
 * - tạo ArrayList<DieuHoa> chứa tất cả 5 đối tượng trên
 * - sau đó in thông tin ra màn hình 
     */
public class Buoi8 {

    private int id;
    private String hang;
    private int congSuat;
    private double gia;
    private String xuatXu;

    public Buoi8() {
    }

    public Buoi8(int id, String hang, int congSuat, double gia, String xuatXu) {
        this.id = id;
        this.hang = hang;
        this.congSuat = congSuat;
        this.gia = gia;
        this.xuatXu = xuatXu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public String toString() {
        return "Buoi8{" + "id=" + id + ", hang=" + hang + ", congSuat=" + congSuat + ", gia=" + gia + ", xuatXu=" + xuatXu + '}';
    }
    public void inThongTin(){
        System.out.println("Buoi8{" + "id=" + id + ", hang=" + hang + ", congSuat=" + congSuat + ", gia=" + gia + ", xuatXu=" + xuatXu + '}');
         
        if ( kiemTra()) {
            System.out.println("Hang chat luong cao");
        } else if(false){
            System.out.println("");
        }
    }

    public boolean kiemTra() {
        if (gia > 20000000 && congSuat >= 3000) {
            return true;
        }
        return false;
    }

   

}
