package bai_tap_chuong_2;

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long vnd, usd;
		final int tyGia = 23500;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Nhập số tiền USD");
		usd = Long.parseLong(input.nextLine());
		
		vnd = tyGia * usd;
		
		String str = String.format("%,d", vnd);
		
		System.out.println("Số tiền VNĐ tương ứng là " + str + " đ");
	}

}
