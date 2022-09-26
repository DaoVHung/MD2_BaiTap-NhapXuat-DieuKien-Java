package BaiTap;

import java.util.Scanner;

public class DienTichChuViHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh a :");
        int a = sc.nextInt();
        System.out.println("Nhap vao canh b :");
        int b = sc.nextInt();
        System.out.println("Dien tich hinh chu nhat la =  "+ a*b);
        System.out.println("Chu vi hinh chu nhat la =  "+ (a+b)*2);
    }
}
