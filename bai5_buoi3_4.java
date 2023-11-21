//package baiTapBuoi3_4;
//
//import java.util.Scanner;
//
//public class bai5_buoi3_4 {
//
//	public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Nhập tên mặt hàng: ");
//		String tenMatHang = scanner.nextLine();
//
//		System.out.print("Nhập số lượng mua: ");
//		int soLuong = scanner.nextInt();
//		long donGia;
//		do {
//			System.out.print("Nhập đơn giá (phải lớn hơn 0): ");
//			donGia = scanner.nextLong();
//		} while (donGia <= 0);
//
//		
//		long tongTien = (soLuong * donGia);
//
//		if (soLuong >= 50 && soLuong <= 100) {
//
//			tongTien *= 0.92;
//	
//		} else if (soLuong > 100) {
//
//			tongTien *= 0.88;
//		}
//
//		System.out.println("Tên mặt hàng: " + tenMatHang);
//		System.out.println("Số lượng mua: " + soLuong);
//		System.out.println("Đơn giá: " + donGia);
//		System.out.println("Tổng tiền phải trả: " + tongTien);
//
//	}
//}
