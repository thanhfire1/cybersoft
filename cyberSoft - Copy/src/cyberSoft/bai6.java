package cyberSoft;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {

		double tyGia = 23500.0;

		Scanner scanner = new Scanner(System.in);
		char tiepTuc;

		do {

			System.out.print("Nhập số tiền USD: ");
			double soUSD = scanner.nextDouble();

			double soVND = soUSD * tyGia;

			System.out.println("Số tiền VND tương ứng là: " + soVND + " đ");

			System.out.print("Bạn có muốn chuyển đổi tiếp không? (Nhấn 'y' để tiếp tục): ");
			tiepTuc = scanner.next().charAt(0);
		} while (tiepTuc == 'y' || tiepTuc == 'Y');

		System.out.println("chương trình đã đóng!!!!");
		scanner.close();
	}
}
