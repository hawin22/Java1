/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_18404;

import java.util.Scanner;



/**
 *
 * @author Hawin
 */
public class Buoi4_2 {
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.println("+++++Menu+++++");
        System.out.println("1,Nhap thong tin thu cung");
        System.out.println("2.So sanh thu cung");
        System.out.println("3.Kiem tra thu cung");
        System.out.println("4.Thoat");
        System.out.println("*****Moi chon cn*****");
        chon =  sc.nextInt();
        switch (chon){
            case 1:
                System.out.println("1,Nhap thong tin thu cung");
                tt();
                break;
                
            case 2:
                System.out.println("2.So sanh thu cung");
                ss();
                break;
                
            case 3:
                System.out.println("3.Kiem tra thu cung");
                ktra();
                break;
                
            case 4:
               
                ketThuc();
                break;
            default:
                System.out.println("B nhap sai");
                
        }
    }
    static void tt(){
          System.out.println("1.Nhap thong tin thu cung");    
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten, can nang, ng tang");
        String ten = sc.nextLine();
        float nang = Float.parseFloat(sc.nextLine());
        String ngTang = sc.nextLine();
        System.out.println("Ten:" + ten);
        System.out.println("nang:" + nang);
        System.out.println("Nguoi tang:" + ngTang);
    
    }
    static  void ss(){
        System.out.println("2.So sanh thu cung");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can nang thu 1 va thu 2:");
       float thu1 = sc.nextFloat();
        float thu2 = sc.nextFloat();
        System.out.println("Thu nang hon la:" +((thu1>thu2)?"thu1":"thu2"));
        
    } 
    
     static void ktra(){
        System.out.println("3.Kiem tra thu cung");
        Scanner sc =new Scanner(System.in);
        int tuoi = sc.nextInt();
        if(tuoi>=6) {
            System.out.println("Nuoi tot, nhung gia");
        }
        else if(tuoi>=3){
            System.out.println("Nuoi tot, khoe manh");
        } else if(tuoi>=1){
            System.out.println("Can cho an nhieu");
        } else if(tuoi>=0){
            System.out.println("Can cho uong sua");
        } else{
              System.out.println("Lam gi co thu cung nao");
                }
     }

     static void ketThuc(){
          System.out.println("4.Ket thuc");
          System.exit(0);
    
}
//      public static void main(String[] args) {
//        menu();
//    }
//    static void menu(){
//            Scanner sc = new Scanner(System.in);
//            int check;
//            do {  
//                 
//                System.out.println("---------menu-------------");
//                System.out.println("1. Can bac 2");
//                System.out.println("2.  Sinh vien");
//                System.out.println("0. Thoat");
//                System.out.println("------------------------------");
//                System.out.print("Moi ban nhap lua chon: ");
//                check = Integer.parseInt(sc.nextLine());
//
//                switch (check) {
//                    case 1:
//                        canBac2();
//
//                        break;
//                    case 2:
//                        sinhVien();
//
//                        break;
//                    case 0:
//                        thoat();
//                        break;
//                    default:
//                        System.out.println("nhap sai moi nhap lai");
//                }
//            
//             } while (check!=0);
//            
//    }
//    static void thoat(){
//        System.exit(0);
//    }
//    static void canBac2(){
//        Scanner sc = new Scanner(System.in);
//        double a;
//        
//        System.out.print("moi ban nhap mot so de tinh can bac 2: ");
//        a = sc.nextDouble();
//        
//        if (a>0) {
//            System.out.println("can bac 2 cua "+a+"la "+Math.sqrt(a) );
//            
//        } else {
//            System.out.println(a+" la so am");
//        }
//    }
//    static void sinhVien(){
//        Scanner sc = new Scanner(System.in);
//        String hoTen,lop;
//        double diemTb=0;
//        System.out.print("moi ban nhap ten: ");
//        hoTen=sc.nextLine();
//        System.out.print("moi ban nhap diem: ");
//        
//        do {            
//            try {
//            diemTb=Double.parseDouble(sc.nextLine());
//        } catch (Exception e) {
//             System.out.println("nhap sai nhap lai");
//        }
//            if (diemTb<0 || diemTb >10) {
//                System.out.println("nhap sai nhap lai");
//                diemTb=0;
//            }
//            
//           
//        } while (diemTb<=0 || diemTb >10);
//        
//        System.out.print("moi ban nhap lop: ");
//        lop = sc.nextLine();
//        
//        System.out.println(hoTen+"-"+diemTb+"-"+lop);
//        
//    }
    
}

    

