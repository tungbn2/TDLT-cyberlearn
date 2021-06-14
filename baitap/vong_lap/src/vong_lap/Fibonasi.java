package vong_lap;

import java.util.Scanner;

public class Fibonasi {

	public Fibonasi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = Nhap(scan);
		InKQ(n);
	}
	
	public static int Nhap(Scanner scan) {
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}
	
	public static int Fibonasi(int n) {
		int a0 = 0;
		int a1 = 1;
		int an = 1;
		
		if (n < 0) {
			System.out.println("Không hợp lệ");
			return -1;
		} else if (n == 0 || n==1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				a0=a1;
				a1=an;
				an=a0+a1;
			}
			return an;
		}
	}
	
	public static void InKQ(int n) {
		System.out.println(n+" số đầu của dãy Fibonasi:");
		for (int i = 0; i<n; i++) {
			int ai = Fibonasi(i);
			System.out.print(ai+"\t");
		}
	}
	
}
