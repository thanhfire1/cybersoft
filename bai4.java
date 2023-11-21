package baiTapBuoi3_4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double truongDaiHocX = 10.0; 
        double truongDaiHocY = 20.0; 

        String[] tenSinhVien = new String[3];
        double[] toaDoX = new double[3];
        double[] toaDoY = new double[3];

      
        for (int i = 0; i < 3; i++) {
            System.out.print("Nhập tên sinh viên " + (i + 1) + ": ");
            tenSinhVien[i] = scanner.nextLine();
            System.out.print("Nhập tọa độ X của nhà của " + tenSinhVien[i] + ": ");
            toaDoX[i] = scanner.nextDouble();
            System.out.print("Nhập tọa độ Y của nhà của " + tenSinhVien[i] + ": ");
            toaDoY[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

       
        double[] khoangCachDenTruong = new double[3];
        for (int i = 0; i < 3; i++) {
            double deltaX = truongDaiHocX - toaDoX[i];
            double deltaY = truongDaiHocY - toaDoY[i];
            khoangCachDenTruong[i] = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }

        
        int sinhVienXaNhatIndex = 0;
        double khoangCachXaNhat = khoangCachDenTruong[0];

        for (int i = 1; i < 3; i++) {
            if (khoangCachDenTruong[i] > khoangCachXaNhat) {
                sinhVienXaNhatIndex = i;
                khoangCachXaNhat = khoangCachDenTruong[i];
            }
        }

     
        System.out.println("Sinh viên ở xa trường đại học nhất là: " + tenSinhVien[sinhVienXaNhatIndex]);
        System.out.println("Khoảng cách đến trường đại học là: " + khoangCachXaNhat);
    }
}
