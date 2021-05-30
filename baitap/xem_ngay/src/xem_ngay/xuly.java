package xem_ngay;

import java.util.Scanner;

public class xuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day, month, year, dayOfWeek, top = 1;
		boolean flag = true;
		String thu;
		
		Scanner input = new Scanner (System.in);
		System.out.println("nhập ngày");
		day = Integer.parseInt(input.nextLine());
		System.out.println("nhập tháng");
		month = Integer.parseInt(input.nextLine());
		System.out.println("nhập năm");
		year = Integer.parseInt(input.nextLine());
		
		if (year < 1582) {
			flag = false;
		}
		
		if ((month > 12) || (month < 1)) {
			flag = false;
		}
		
		switch (month) {
		case 1: 
		case 3: 
		case 5: 
		case 7:
		case 8:
		case 10:
		case 12:
			top = 31;
			break;
		case 2:
			if (((year%4 == 0)&&(year%100 != 0))||(year%400 == 0)) {
				top = 29;
			} else {
				top = 28;
			}
			break;
		default:
			top = 30;
		}
		
		if ((day > top)||(day < 1)) {
			flag = false;
		}
		
		if (flag) {
			int a = (14 - month)/12;
			year -= a;
			month += (12*a - 2);
			dayOfWeek = (day + year + year/4 - year/100 + year/400 + 31*month/12)%7;
			switch (dayOfWeek) {
			case 0:
				thu = "Chủ nhật";
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				thu = "Thứ "+ (dayOfWeek+1);
				break;
			default:
				thu = "";
				break;
			}
			System.out.println("Ngày "+ day + " tháng " + month + " năm "+ year + " là " + thu);
		} else {
			System.out.println("ngày tháng năm không hợp lệ");
		}
		}
	}

