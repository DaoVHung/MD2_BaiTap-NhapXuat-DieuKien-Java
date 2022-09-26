package BaiTap;

import java.util.Scanner;

public class InSoDaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số có 3 chữ số");
        int num = Integer.parseInt(sc.nextLine());
        int a = num/100;
        num = num%100;
        int b = num/10;
        int c = num%10;
        System.out.println("Số đảo ngược lại là : " +c+b+a);
    }
}
