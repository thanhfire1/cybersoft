package cyberSoft;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tt;
        do {
        	System.out.print("Nhập nhiệt độ ở độ C: ");
            double C = scanner.nextDouble();

            
            double F = (C * 1.8) + 32;

        
            System.out.println("Nhiệt độ ở độ F là: " + F);

            
            System.out.print("Bạn có muốn chuyển đổi tiếp không? (Nhấn 'y' để tiếp tục): ");
			tt = scanner.next().charAt(0);
		} while (tt == 'y' || tt == 'Y');
    	System.out.println("chương trình đã đóng!!!!");
		scanner.close();
		
        
    }
}
