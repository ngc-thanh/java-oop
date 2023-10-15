/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab1 {

    private static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lab 1 - bài 1");
        System.out.print("Họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = sc.nextDouble();
        System.out.printf("%s %f điểm%n", hoTen, diemTB);
    }
    
    private static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lab 1 - bai 2");
        System.out.println("Nhập độ dài 2 cạnh của hình chữ nhật: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("Chu vi hình chữ nhật: %d%n", (x + y) * 2);
        System.out.printf("Diện tích hình chữ nhật: %d%n", x * y);
        System.out.printf("Cạnh nhỏ nhất hình chữ nhật: %d%n", Math.min(x, y));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM does not support mandatory encoding UTF-8");
        }

        //Lab1.bai1();
        Lab1.bai2();
    }

}
