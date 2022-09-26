package BaiTap;

import java.util.Scanner;

public class PhienAm1so {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Nhập vào số từ 0 -> 9 muốn phiên âm");
        int so = Integer.parseInt(sc.nextLine());

        switch (so){
            case 1:
                System.out.println(" Phiên âm là : Một ");
                break;
            case 2:
                System.out.println(" Phiên âm là : Hai ");
                break;
            case 3:
                System.out.println(" Phiên âm là : Ba ");
                break;
            case 4:
                System.out.println(" Phiên âm là : Bốn ");
                break;
            case 5:
                System.out.println(" Phiên âm là : Năm ");
                break;
            case 6:
                System.out.println(" Phiên âm là : Sáu ");
                break;
            case 7:
                System.out.println(" Phiên âm là : Bảy ");
                break;
            case 8:
                System.out.println(" Phiên âm là : Tám ");
                break;
            case 9:
                System.out.println(" Phiên âm là : Chín ");
                break;
            case 0:
                System.out.println(" Phiên âm là : Khum ");
                break;
        }
    }
}
