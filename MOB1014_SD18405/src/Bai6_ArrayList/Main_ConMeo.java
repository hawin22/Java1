/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class Main_ConMeo {
    public static void main(String[] args) {
        
    
    /* 2. Tạo class ConMeo gồm các thuộc tính
 * - id: int
 * - ten: string
 * - tuoi: int
 * - loai: string
 * - canNang: double
 * - gioiTinh: bool (true- đực, false- cái)
     */
  Con_Meo meo1 = new Con_Meo(01,"tuti",3,"fog",5,true);
  Con_Meo meo2 = new Con_Meo(02,"tuti",3,"fog",5,true);
  Con_Meo meo3 = new Con_Meo(03,"tuti",3,"fog",5,false);
  Con_Meo meo4 = new Con_Meo(04,"tuti",3,"fog",5,true);
  Con_Meo meo5 = new Con_Meo(05,"tuti",3,"fog",5,false);

    // tạo 1 list mèo
    ArrayList<Con_Meo> lstMeo = new ArrayList<>();
    // add đối tượng vào list
    lstMeo.add(meo1) ;
    lstMeo.add(meo2) ;
    lstMeo.add(meo3) ;
    lstMeo.add(meo4) ;
    lstMeo.add(meo5) ;
     System.out.println(lstMeo.get(1));
        System.out.println(lstMeo.get(1).getTen());
        lstMeo.get(1).inFor();
    //4. duyệt list 
    //-> lstMeo.get(i): lấy ra đối tượng trong danh sách
        for (int i = 0; i < lstMeo.size(); i++) {
            lstMeo.get(i).inFor();
        }
        for (Con_Meo conMeo : lstMeo) {
            conMeo.inFor();
        }

}

    
  
    }
