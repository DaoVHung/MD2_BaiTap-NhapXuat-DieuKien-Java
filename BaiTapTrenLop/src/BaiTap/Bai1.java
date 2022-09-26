package BaiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner canhA= new Scanner(System.in);
        System.out.print("Nhap vao canh a cua hinh vuong");
        int a = canhA.nextInt();
        System.out.println(" Dien tich hinh vuong la:" + a*a);
        System.out.println(" Chu vi hinh vuong la:" + 4*a);
    }
}
