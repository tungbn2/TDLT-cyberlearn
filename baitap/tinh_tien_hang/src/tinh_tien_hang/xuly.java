package tinh_tien_hang;

import java.util.Scanner;

public class xuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tenHang;
		float donGia, thanhTien;
		int soLuong;
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhập tên hàng");
		tenHang = nhap.nextLine();
		System.out.println("Nhập số lượng");
		soLuong = Integer.parseInt(nhap.nextLine());
		System.out.println("Nhập đơn giá");
		donGia = Float.parseFloat(nhap.nextLine());
		
		if(soLuong>100) {
			thanhTien = 100*donGia + 0.88f * donGia * (soLuong-100);
		} else if (soLuong >= 50) {
			thanhTien = 50*donGia + 0.92f*donGia*(soLuong-50);
		} else {
			thanhTien = donGia * soLuong;
		}
		
		System.out.println("tên: "+ tenHang + "\t Số lượng: "+ soLuong);;
		System.out.println("Thành tiền là "+thanhTien);
	}

}
