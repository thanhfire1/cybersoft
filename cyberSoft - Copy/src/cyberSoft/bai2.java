package cyberSoft;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập giá trị của a: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập giá trị của n (số nguyên không âm): ");
		int n = scanner.nextInt();

		System.out.print("Nhập giá trị của x: ");
		double x = scanner.nextDouble();

		double result = calculateDonThuc(a, n, x);
		System.out.println("Giá trị đơn thức P(x) = " + a + "x^" + n + " là: " + result);

		scanner.close();
	}

	public static double calculateDonThuc(double a, int n, double x) {
		if (n < 0) {
			throw new IllegalArgumentException("n phải là số nguyên không âm.");
		}

		return a * Math.pow(x, n);
	}
}
