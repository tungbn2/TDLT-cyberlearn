package vong_lap;

import java.util.Scanner;

public class BT_TH_1 {

	public BT_TH_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = Nhap(scan);
		XuLy(n);
	}
	
	public static int Nhap(Scanner scan) {
		System.out.println("Nhập số n: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}
	
	public static void XuLy(int n) {
		int soBanDau; //tạo bản sao của n
		int soDangTach;
		int tongChuSo = 0;
		int dem = 0;
		int soDaoNguoc=0;
		soBanDau = n;
		
		do {
			soDangTach = soBanDau % 10;
			dem++;
			tongChuSo += soDangTach;
			soBanDau /= 10;
		} while (soBanDau != 0);
		
		System.out.println("Số "+n+" có "+dem + " chữ số");
		System.out.println("Chữ số cuối cùng là "+ n%10);
		System.out.println("Chữ số đầu tiên là " + soDangTach);
		System.out.println("Tổng chữ số là " + tongChuSo);
		
		do {
			dem --;
			soDaoNguoc = soDaoNguoc * 10 + n%10;
			n/=10;
		} while (dem != 0);
		
		System.out.println("số đảo ngược của n là "+soDaoNguoc);
	}
}
