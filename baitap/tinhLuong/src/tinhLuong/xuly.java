package tinhLuong;

import java.util.Scanner;

public class xuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hours, payment, rate;
		final int standard = 40;
		final float oT = (float) 1.5;
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhập số giờ làm vịêc");
		hours = Float.parseFloat(nhap.nextLine());
		System.out.println("Nhập tiền lương");
		rate = Float.parseFloat(nhap.nextLine());
		
		if (hours>40) {
			payment = standard * rate + oT*rate*(hours-standard);
		} else {
			payment = rate * hours;
		}
		System.out.println("Tiền lương là " + payment);
	}

}
