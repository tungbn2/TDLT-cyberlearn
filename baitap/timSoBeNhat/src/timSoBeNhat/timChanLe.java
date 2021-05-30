package timSoBeNhat;

import java.util.Scanner;

public class timChanLe {
	
	public static void timChanLe(int a) {
		boolean chanLe = true;
		if (a%2 == 0) {
			System.out.println(" số " + a + " là số chẵn");;
		} else {
			System.out.println(" số " + a + " là số lẻ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("nhập số kiểm tra");
		x = Integer.parseInt(nhap.nextLine());
		
		timChanLe (x);
	}

}
