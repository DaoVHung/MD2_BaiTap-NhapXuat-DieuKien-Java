package BaiTap;

import java.util.Scanner;

public class ThongTinSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao id sinh vien : ");
        String Id = sc.nextLine();

        System.out.println("Nhập vào tên sinh viên : ");
        String tenHocSinh = sc.nextLine();

        System.out.println("Nhập vào số tuổi : ");
        int tuoi = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào giới tính : ");
        Boolean sex = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Nhập vào email : ");
        String email = sc.nextLine();

        System.out.println("Nhập số điện thoại :");
        int sdt = Integer.parseInt(sc.nextLine());

        System.out.println(" Địa chỉ ");
        String diachi = sc.nextLine();

        System.out.printf("%10s%5s%25s%10s%20s%5d\n", "ID Hoc Sinh :", Id ,"Ten Hoc Sinh :", tenHocSinh,"Tuoi:",tuoi);
        System.out.printf("%10s%5s%20s%10s%30s%5d\n", "Giới tính :", sex ,"Email :", email,"So dien thoai :", sdt);
        System.out.printf("%10s%10s","Dia chi :",diachi);

    }
}
