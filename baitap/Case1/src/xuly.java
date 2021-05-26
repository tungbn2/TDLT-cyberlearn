import java.util.Scanner;

public class xuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int giaVeTreEm, giaVeNguoiLon, soVeTreEm, soVeNguoiLon, tyLeTuThien,tongVe;
		float tongThu, tuThien, conLai;
		String tenPhim;
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhập tên phim");
		tenPhim = nhap.nextLine();
		System.out.println("Nhập giá vẻ người lớn");
		giaVeNguoiLon = Integer.parseInt(nhap.nextLine());
		System.out.println("nhập giá vé trẻ em");
		giaVeTreEm = Integer.parseInt(nhap.nextLine());
		System.out.println("nhập số vé người lớn");
		soVeNguoiLon = Integer.parseInt(nhap.nextLine());
		System.out.println("nhập số vé trẻ em");
		soVeTreEm = Integer.parseInt(nhap.nextLine());
		System.out.println("nhập phần trăm từ thiện");
		tyLeTuThien = Integer.parseInt(nhap.nextLine());
		
		tongVe = soVeNguoiLon + soVeTreEm;
		
		tongThu = giaVeNguoiLon * soVeNguoiLon + giaVeTreEm * soVeTreEm;
		
		tuThien = (1.0f) * tyLeTuThien * tongThu / 100; // nhân 1.0f để ép kiểu về float
		
		conLai = tongThu - tuThien;
		
		String text = String.format("%-20s","Bắt_đầu").replace(' ','*');
		System.out.println(text);
		System.out.println("Tên phim:___________________" + tenPhim);
		System.out.println("Số vé đã bán:_______________" + tongVe);
		System.out.println("Doanh thu:__________________" + tongThu);
		System.out.println("% từ thiện:_________________" + tyLeTuThien + "%");
		System.out.println("Từ thiện:___________________" + tuThien);
		System.out.println("Còn lại:____________________" + conLai);
		
		int kyTu = -20;
		String text2 = String.format("%1$"+kyTu+"s","Kết-thúc").replace(' ','_').replace('-',' ');
		System.out.println(text2);
	}

}
