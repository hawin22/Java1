/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author Hawin
 */
public class MyClass {
//    void method(int x, int y){ x = 5; y = 5; } public static void main(String[] args){ MyClass o = new MyClass(); int x = 1, y = 1; o.method(x, y); System.out.printf("x=%d, y=%d", x, y); }
//    void method(int[] x){ x[0] = 5; x[1] = 5; } public static void main(String[] args){ MyClass o = new MyClass(); int[] x = {1, 1}; o.method(x); System.out.printf("x=%d, y=%d", x[0], x[1]); }
    static public int X = 2; public static void main(String[] args){ MyClass o1 = new MyClass(); MyClass o2 = new MyClass(); o2.X = 5; System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClass.X); }
}
