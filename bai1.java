package baiTapBuoi3_4;


import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         String[] tenSinhVien = new String[3];
         int[] namSinhSinhVien = new int[3];
         
       
         for (int i = 0; i < 3; i++) {
             System.out.print("Nhập tên của sinh viên " + (i + 1) + ": ");
             tenSinhVien[i] = scanner.nextLine();
             
             System.out.print("Nhập năm sinh của sinh viên " + (i + 1) + ": ");
             namSinhSinhVien[i] = scanner.nextInt();
             
            
             scanner.nextLine();
         }
     
         int namSinhTreNhat = namSinhSinhVien[0];
         String tenSinhVienTreNhat = tenSinhVien[0];
         
         for (int i = 1; i < 3; i++) {
             if (namSinhSinhVien[i] > namSinhTreNhat) {
                 namSinhTreNhat = namSinhSinhVien[i];
                 tenSinhVienTreNhat = tenSinhVien[i];
             }
         }
         
       
         System.out.println("Sinh viên trẻ nhất là " + tenSinhVienTreNhat + " với năm sinh là " + namSinhTreNhat);
    }
    
}
