package tongSo;

import java.util.Scanner;

public class xuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, unit, ten, hundred, sum;
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("nhập số N");
		n = Integer.parseInt (nhap.nextLine());
		
		hundred = n/100;
		ten = n%100/10;
		unit = n%10;
		
		sum = hundred + ten + unit;
		
		System.out.println("tổng 3 chữ số là "+sum);
		
	}

}
