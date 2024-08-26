/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
//Viết chương trình nhập mảng số nguyên từ bàn phím.
//Sắp xếp và xuất mảng vừa nhập ra màn hình.
//Xuất phần tử có giá trị nhỏ nhất ra màn hình
//Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
public class Bai_3 {

    public static void main(String[] args) {
        System.out.println("Moi nhap mang");
        Scanner sc = new Scanner(System.in);
        int sL = Integer.parseInt(sc.nextLine());
        int[] arr = new int[sL];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu " + i + ":");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Sap xep tang dan");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }

            }

        }
        System.out.println("Sap xep giam dan: " + Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min la:" + min);
        int tong = 0, d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                tong += arr[i];
                d++;
            }
        }
        System.out.println("TBC cua cac so chia het cho 3 la:" + (double) tong / d);
    }
}
