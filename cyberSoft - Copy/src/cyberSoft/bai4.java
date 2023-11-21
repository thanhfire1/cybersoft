package cyberSoft;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int tong = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            tong += scanner.nextInt();
        }

        double trungBinh = (double) tong / 5;
        System.out.println("Giá trị trung bình của 5 số là: " + trungBinh);

        scanner.close();
    }
}
