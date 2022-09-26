package BaiTap;

import java.util.Scanner;

public class ThucHienPhepToan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap vao so a :");
        float a = sc.nextFloat();
        System.out.println("Nhap vao so b :");
        float b = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap vao phep toan :");
        char c = sc.nextLine().charAt(0);
        switch (c) {
            case '+':
                System.out.println("Phep toan cong co ket qua la :" + (a + b));
                break;
            case '-':
                System.out.println("Phep toan tru co ket qua la :" + (a - b));
                break;
            case '*':
                System.out.println("Phep toan nhan co ket qua la :" + (a * b));
                break;
            case '/':
                System.out.println("Phep toan chia co ket qua la :" + (a / b));
        }
    }
}
