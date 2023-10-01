package baiTapBuoi3_4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tenCanBo = new String[3];
        int[] namSinh = new int[3];
        String[] gioiTinh = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nhập tên cán bộ " + (i + 1) + ": ");
            tenCanBo[i] = scanner.next();
            System.out.print("Nhập năm sinh của " + tenCanBo[i] + ": ");
            namSinh[i] = scanner.nextInt();
            System.out.print("Nhập giới tính của " + tenCanBo[i] + ": ");
            gioiTinh[i] = scanner.next(); 
        }

        int namTreNhat = namSinh[0];
        String tenNamTreNhat = "";

        for (int i = 0; i < 3; i++) {
            if (gioiTinh[i].equalsIgnoreCase("nam") && namSinh[i] > namTreNhat) {
                namTreNhat = namSinh[i];
                tenNamTreNhat = tenCanBo[i];
            }
            
        } 
        if (!tenNamTreNhat.isEmpty()) {
            System.out.println("Cán bộ nam trẻ nhất là: " + tenNamTreNhat);
            System.out.println("Năm sinh của cán bộ nam trẻ nhất là: " + namTreNhat);
        } else {
            System.out.println("Không có cán bộ nam trong danh sách.");
        }
    }
}
