package bai_tap_chuong_2;

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float soThu1, soThu2, soThu3, soThu4, soThu5, tong, giaTriTrungBinh;
		final int soLuong = 5;
		tong = 0;
		
		System.out.println("Nhập số thứ nhất");
		Scanner nhap = new Scanner (System.in);
		soThu1 = Float.parseFloat(nhap.nextLine());
		tong += soThu1;
		System.out.println("Nhập số thứ hai");
		soThu2 = Float.parseFloat(nhap.nextLine());
		tong += soThu2;
		System.out.println("Nhập số thứ ba");
		soThu3 = Float.parseFloat(nhap.nextLine());
		tong += soThu3;
		System.out.println("Nhập số thứ tư");
		soThu4 = Float.parseFloat(nhap.nextLine());
		tong += soThu4;
		System.out.println("Nhập số thứ năm");
		soThu5 = Float.parseFloat(nhap.nextLine());
		tong += soThu5;
		
		giaTriTrungBinh = (1.0f) * tong / soLuong;
		
		System.out.println("Giá trị trung bình của 5 số là " + giaTriTrungBinh);
	}

}
