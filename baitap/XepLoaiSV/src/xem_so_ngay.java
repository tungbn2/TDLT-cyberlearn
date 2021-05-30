import java.util.Scanner;

public class xem_so_ngay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thang, ngay = 0;
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhập tháng");
		thang = Integer.parseInt(nhap.nextLine());
		
		boolean flag = true;
		switch (thang) {
		case 1: 
		case 3: 
		case 5: 
		case 7:
		case 8:
		case 10:
		case 12:
			ngay = 31;
			break;
		case 2:
			ngay = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			ngay = 30;
			break;
		default:
			flag = false;
		}
		if (flag) {
			System.out.println("số ngày trong tháng "+ thang +" là: "+ ngay);
		} else {
			System.out.println("Tháng không hợp lệ");
		}
		}

}
