package timSoBeNhat;

import java.util.Scanner;

public class xuLy {
	
	public static int timSoLonNhat(int a, int b, int c) {
		int soLonNhat = a;
		if (b > soLonNhat) {
			soLonNhat = b;
		}
		if (c > soLonNhat) {
			soLonNhat = c;
		}
		return soLonNhat;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhập vào 3 số");
		a = Integer.parseInt(nhap.nextLine());
		b = Integer.parseInt(nhap.nextLine());
		c = Integer.parseInt(nhap.nextLine());
		
		int max = timSoLonNhat (a,b,c);
		
		System.out.println("số lớn nhất là " + max);
	}

}
