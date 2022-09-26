package BaiTap;

import java.util.Scanner;

public class InHinhTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào cạnh a :");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào cạnh b :");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào cạnh c :");

        int c = Integer.parseInt(sc.nextLine());

        if (a + b > c && b + c > a && a + c > b) {
            if ((a*a == (b*b + c*c))||(b*b ==(a*a + c*c))||( c*c == (a*a + b*b))) {
                System.out.println("Đó là tam giác vuông");
                return;
            } else if(a==b && b==c){
                System.out.println("Đó là hình tam giác đều");
                return;
            } else  if(a==b || b==c){
                System.out.println("Đó là tam giác cân");
                return;
            }
            System.out.println("Đó là hình tam giác thường");
        }
    }
}
