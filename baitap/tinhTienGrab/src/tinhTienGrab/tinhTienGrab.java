package tinhTienGrab;

import java.util.Scanner;

public class tinhTienGrab {
	
	static final int GRAB_CAR_1KM = 8000;
	static final int GRAB_SUV_1KM = 9000;
	static final int GRAB_BLACK_1KM = 10000;
	
	static final int GRAB_CAR_1_19KM = 7500;
	static final int GRAB_SUV_1_19KM = 8500;
	static final int GRAB_BLACK_1_19KM = 9500;
	
	static final int GRAB_CAR_19KM = 7000;
	static final int GRAB_SUV_19KM = 8000;
	static final int GRAB_BLACK_19KM = 9000;
	
	static final int GRAB_CAR_WAIT = 2000;
	static final int GRAB_SUV_WAIT = 3000;
	static final int GRAB_BLACK_WAIT = 3500;
	
	public static float nhapKm(Scanner scan) {
		float soKm;
		System.out.println("nhập số KM");
		soKm = Float.parseFloat(scan.nextLine());
		return soKm;
	}
	
	public static int nhapThoiGianCho(Scanner scan) {
		int thoiGianCho;
		System.out.println("nhập thời gian chờ");
		thoiGianCho = Integer.parseInt(scan.nextLine());
		return thoiGianCho;
	}
	
	public static int chonGrab (Scanner scan) {
		int loai;
		System.out.println("Chọn loại Grab");
		System.out.println("1. Grab Car");
		System.out.println("2. Grab SUV");
		System.out.println("3. Grab Black");
		loai = Integer.parseInt(scan.nextLine());
		return loai;
	}
	public static float tinhTienKmDauTien (int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM;
		} else {
			tien = GRAB_BLACK_1KM;
		}
		return tien;
	}
	
	public static float tinhTienKm1Den19 (float soKm, int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + (soKm - 1) * GRAB_CAR_1_19KM;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + (soKm - 1) * GRAB_SUV_1_19KM;
		} else {
			tien = GRAB_BLACK_1KM + (soKm - 1) * GRAB_BLACK_1_19KM;
		}
		return tien;
	}
	
	public static float tinhTienKmTren19 (float soKm, int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + 18*GRAB_CAR_1_19KM +  (soKm - 19) * GRAB_CAR_19KM;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + 18*GRAB_SUV_1_19KM +  (soKm - 19) * GRAB_SUV_19KM;
		} else {
			tien = GRAB_BLACK_1KM + 18*GRAB_BLACK_1_19KM +  (soKm - 19) * GRAB_BLACK_19KM;
		}
		return tien;
	}
	
	public static float tinhTienCho (int loaiGrab, int thoiGianCho) {
		float tien = 0;
		if (thoiGianCho >= 3) {
			int soLanTinh = Math.round(thoiGianCho*(1.0f)/3);
			if (loaiGrab == 1) {
				tien = soLanTinh * GRAB_CAR_WAIT;
			} else if (loaiGrab == 2) {
				tien = soLanTinh * GRAB_SUV_WAIT;
			}else {
				tien = soLanTinh * GRAB_BLACK_WAIT;
			}
		}
		return tien;
	}
	
	public static float tinhTienTra(int loaiGrab, float soKm, int thoiGianCho) {
		float tien = 0;
		if (soKm <= 1) {
			tien = tinhTienKmDauTien(loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
		} else if (soKm <= 19) {
			tien = tinhTienKm1Den19(soKm, loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
		} else {
			tien = tinhTienKmTren19(soKm, loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
		}
		return tien;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner (System.in);
		int loaiGrab = chonGrab(nhap);
		float soKm = nhapKm(nhap);
		int thoiGianCho = nhapThoiGianCho(nhap);
		float tienTra = tinhTienTra(loaiGrab, soKm, thoiGianCho);
		System.out.println("số tiền trả "+ tienTra);
	}

}
