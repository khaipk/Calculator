package giaipt;

import java.util.Scanner;

public class giaiptb1 {
	public static void Giaipt() {
		System.out.println("Giải pt bậc nhất 1 ẩn ax + b = 0");
		System.out.print("Nhập a:");
		double a = new Scanner(System.in).nextDouble();
		System.out.print("Nhập b:");
		double b = new Scanner(System.in).nextDouble();
		if (a==0 && b==0)
			System.out.println("Phương trình vô số nghiệm");
		if (a==0 && b!=0)
			System.out.println("Phương trình vô nghiệm");
		if (a!=0)
			System.out.println("Phương trình có nghiệm x = "+(-b*1.0/a));
	}
}
