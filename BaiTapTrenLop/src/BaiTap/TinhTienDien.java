package BaiTap;

import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện cũ : ");
        int soDienCu = sc.nextInt();
        System.out.println(" Nhập vào số điện mới : ");
        int soDienMoi = sc.nextInt();
        int tienDien = 0;
        int dienTieuThu = soDienMoi - soDienCu;

        if ( dienTieuThu < 50 ){
            tienDien = 10000 + dienTieuThu*700;
            System.out.println("Số tiền điện phải trả là : " + tienDien );

        }else if( dienTieuThu > 50 && dienTieuThu < 100){
            tienDien = 10000 + 50*700 + ((dienTieuThu - 50)*900);
            System.out.println("Số tiền điện phải trả là : " + tienDien );

        } else if (dienTieuThu > 100 && dienTieuThu < 150) {
            tienDien = 10000 + 50*700 + 50*900 + ((dienTieuThu-100)*1100);
            System.out.println("Số tiền điện phải trả là : " + tienDien );

        } else if ( dienTieuThu > 150 ) {
            tienDien = 10000 + 50*700 + 50*900 + 50*1100 + ((dienTieuThu-150)*1300);
            System.out.println("Số tiền điện phải trả là : " + tienDien );
        }
    }
}
