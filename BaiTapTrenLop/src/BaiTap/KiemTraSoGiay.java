package BaiTap;

import java.util.Scanner;

public class KiemTraSoGiay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số giây để in ra số Giờ , Phút , Giây");
        int num = sc.nextInt();;
        int a = num/3600;
        int b = (num%3600)/60;
        int c = (num%3600)%60;
        System.out.println("Giờ = " + c + "  Phút = " + b + "  Giây = " + a);

    }
}
