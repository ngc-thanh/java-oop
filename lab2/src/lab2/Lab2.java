/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab2 {

    private static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lab 2 - bài 1");
        System.out.print("Nhập hệ số a, b của phương trình bậc nhất: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.printf("Nghiệm của phương trình là: %f%n", -b / a);
        }
    }

    private static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lab 2 - bai 2");
        System.out.print("Nhập các hệ số a, b, c của phương trình bậc 2: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.printf("Phương trình có nghiệm kép x1 = x2 = %f%n", -b / (2 * a));
        } else {
            System.out.printf("Phương trình có nghiệm x1 = %f, x2 = %f%n", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
        }
    }

    private static void bai3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lab 2 - bài 3");
        System.out.print("Nhập vào số điện sử dụng trong tháng: ");
        int x = sc.nextInt();
        int res = 0;
        if (x < 50) {
            res = x * 1000;
        } else {
            res = 50 * 1000 + (x - 50) * 1200;
        }

        System.out.printf("Tiền điện của tháng là: %d%n", res);
    }

    private static void bai4() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Lab 2 - bài 4");
            System.out.println("+---------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiên điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------+");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Giải phương trình bậc nhất");
                    Lab2.bai1();
                    break;
                case 2:
                    System.out.println("2. Giải phương trình bậc hai");
                    Lab2.bai2();
                    break;
                case 3:
                    System.out.println("3. Tính tiên điện");
                    Lab2.bai3();
                    break;
                case 4:
                    System.out.println("4. Kết thúc");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }

            System.out.printf("%n%n");
        } while (choice != 4);
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
//        Lab2.bai1();
//        Lab2.bai2();
//        Lab2.bai3();
        Lab2.bai4();
    }
}
