package BaiTap;

import java.util.Scanner;

public class NhapThangKiemTraNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tháng : ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào Năm :");
        int year= Integer.parseInt(sc.nextLine());

        switch (month){
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("Thang "+month+" co 29 ngay!");
                        } else {
                            System.out.println("Thang "+month+" co 28 ngay!");
                        }
                    } else {
                        System.out.println("Thang "+month+" co 29 ngay!");
                    }
                } else {
                    System.out.println("Thang "+month+" co 28 ngay!");
                }
                break;
            case 3:
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang"+month+" co 31 ngay!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang" + month + " co 30 ngay!");
                break;
            default:
                System.out.println(" Thang do khong ton tai !");
        }
    }
}
