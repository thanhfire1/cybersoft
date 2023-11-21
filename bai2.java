package baiTapBuoi3_4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLe = 0;
        int soChan = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Nhập số nguyên thứ " + i + ": ");
            int soNguyen = scanner.nextInt();

            if (soNguyen % 2 == 0) {
                soChan++;
            } else {
                soLe++;
            }
        }

        System.out.println("Số lẻ: " + soLe);
        System.out.println("Số chẵn: " + soChan);
    }
}
