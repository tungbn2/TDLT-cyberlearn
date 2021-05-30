package timSoBeNhat;

import java.util.Scanner;

public class tinhTong3So {
	
	public static float tongBaSo(float a, float b, float c) {
		float tong = a + b +c;
		return tong;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x, y, z;
		Scanner nhap = new Scanner (System.in);
		System.out.println("nhập 3 số ");
		x = Integer.parseInt(nhap.nextLine());
		y = Integer.parseInt(nhap.nextLine());
		z = Integer.parseInt(nhap.nextLine());
		
		float tong = tongBaSo(x, y, z);
		System.out.println("Tôngr 3 số là " + tong);
	}

}
