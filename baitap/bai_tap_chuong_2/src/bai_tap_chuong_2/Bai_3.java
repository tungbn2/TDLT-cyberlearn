package bai_tap_chuong_2;

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float xC, yC, r, xM, yM, khoangCach;
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhập tọa độ tâm C (xC, yC)");
		xC = Float.parseFloat(nhap.nextLine());
		yC = Float.parseFloat(nhap.nextLine());
		System.out.println("Nhập bán kình R");
		r = Float.parseFloat(nhap.nextLine());
		System.out.println("hập toạ độ điểm M (xM, yM)");
		xM = Float.parseFloat(nhap.nextLine());
		yM = Float.parseFloat(nhap.nextLine());
		
		khoangCach = (float) Math.sqrt (Math.pow((xM-xC),2) + Math.pow ((yM-yC),2));
		
		if (khoangCach > r) {
			System.out.println("M không nằm trong (C)");
		} else {
			System.out.println("M nằm trong (C)");
		}
	}

}

