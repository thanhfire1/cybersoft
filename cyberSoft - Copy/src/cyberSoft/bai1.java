package cyberSoft;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Nhập giá trị của a: ");
//		double a = scanner.nextDouble();
//
//		System.out.print("Nhập giá trị của n (số nguyên không âm): ");
//		int n = scanner.nextInt();
//
//
//		double result = a * Math.pow(8, n);
//		System.out.println("Giá trị đơn thức P(x) = " + a + "x^" + n + " là: " + result);
//
//		scanner.close();
		System.out.println("Mời nhập số n: ");
		int n = scanner.nextInt();
		int donVi = n%10;
		int Chuc = n/10;
		int kq = donVi + Chuc;
		
		System.out.println("vậy kết quả tổng 2 ký số là: "+ kq);
	}

	

		
	}
//		double a,b,ch;
//		 
//		Scanner scanner = new Scanner(System.in);		
//		System.out.println("Nhập cạnh a: ");
//		a =scanner.nextDouble();
//		System.out.println("Nhập cạnh b: ");
//		b =scanner.nextDouble();
//	    ch = Math.sqrt((a*a) + (b*b));
//		System.out.println("cạnh huyền có độ dài: ");
//		System.out.println(ch);
//		
//	
////
//     System.out.println("Mòi nhập tên: ");
//     String ten = scanner.nextLine();
//     System.out.println("Xin chào "+ ten);

	
	
