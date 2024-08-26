/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hawin
 */
public class CinemalService {
    ArrayList<Cinema> listFilm = new ArrayList<>();
    ArrayList<Cinema> listDoc = listFilm;
    public CinemalService() {
        listFilm.add(new Cinema("Hành động", "Hawin",250000 , "thu@gmail.com"));
        listFilm.add(new Cinema("Kinh dị", "Hawin1",250000 , "thu@gmail.com"));
        listFilm.add(new Cinema("Ngôn tình", "Hawin2",250000 , "thu@gmail.com"));
        listFilm.add(new Cinema("Hành động", "Hawin3",250000 , "thu@gmail.com"));
    }
    ArrayList<Cinema> getListFilm(){
        return listFilm;    
    }
    ArrayList<Cinema> doc(){
        return listDoc;
    }
    public static final String checkMail = "^[A-Za-z0-9]+@(.+)$";
    public static Boolean checkEmail(String email){
        if (email== null) {
            return false;
        }
        Pattern pattern = Pattern.compile(checkMail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    Boolean add(Cinema film){
        listFilm.add(film);
        return true;
    }
    ArrayList<Cinema> delete(String ten){
        ArrayList<Cinema> listResult = listFilm;
        for (int i = 0; i < listFilm.size(); i++) {
             if (listResult.get(i).getTenPhim().equals(ten)) {
                listResult.remove(i);
            }
        }
        return listResult;
    }
    public String DocFile(String fileName){
        File file = new File(fileName);
        
        try {
           if (!file.exists()) {
            return "File ko tồn tại";
        }
           try(FileInputStream fis = new FileInputStream(file);
               ObjectInputStream ois = new ObjectInputStream(fis)) {
               while(fis.available() > 0)
                   listFilm.add((Cinema) ois.readObject());
               return "Đọc file thành công";
               }
                   
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
    }
    public String ghiFile(String fileName){
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
                try(FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)){
                        
                    for (Cinema cinema : listFilm) {
                        oos.writeObject(cinema);
                    }
                    }
                        
            
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }
  Boolean update(int i, Cinema cin){
      listFilm.set(i, cin);
      return true;
  }
}
