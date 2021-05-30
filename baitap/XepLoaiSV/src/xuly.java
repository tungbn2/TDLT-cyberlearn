import java.util.Scanner;

public class xuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float diemToan, diemLy, diemHoa, diemTB;
		String hoTen, xepLoai;
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhập tên SV");
		hoTen = nhap.nextLine();
		System.out.println("Nhập điểm toán:");
		diemToan = Float.parseFloat(nhap.nextLine());
		System.out.println("Nhập điểm lý:");
		diemLy = Float.parseFloat(nhap.nextLine());
		System.out.println("Nhập điểm hóa:");
		diemHoa = Float.parseFloat(nhap.nextLine());
		
		diemTB = (1.0f)*(diemHoa + diemLy + diemToan)/3;
		
		if (diemTB >= 8.5f) {
			xepLoai = "Xếp loại Giỏi";
		} else if (diemTB >= 6.5f) {
			xepLoai = "Xếp loại Khá";
		} else if (diemTB >= 5.0f) {
			xepLoai = "Xếp loại Trung Bình";
		} else {
			xepLoai = "Xếp loại Yếu";
		}
		
		System.out.println("Điểm trung bình: \t"+diemTB + "\n" + xepLoai);
	}

}
