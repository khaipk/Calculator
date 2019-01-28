package giaipt;

import java.util.Scanner;

public class giaiptb2 {
	
	public static void Giaipt() {
		System.out.println("Giải phương trình bậc hai ax2 + bx + c = 0");
		System.out.print("Nhập a:");
		double a = new Scanner(System.in).nextDouble();
		System.out.print("Nhập b:");
		double b = new Scanner(System.in).nextDouble();
		System.out.print("Nhập c:");
		double c = new Scanner(System.in).nextDouble();
		
		if (a==0) {
			if (c==0 && b==0)
				System.out.println("Phương trình vô số nghiệm");
			if (b==0 && c!=0)
				System.out.println("Phương trình vô nghiệm");
			if (b!=0)
				System.out.println("Phương trình có nghiệm x = "+(-c*1.0/b));
		}
		if (a!=0) {
			double delta = b*b - 4*a*c;
			if (delta<0)
				System.out.println("Phương trình vô nghiệm");
			if (delta==0)
				System.out.println("Phương trình có nghiệm kép x = "+(-b*0.5/a));
			if (delta>0){
				System.out.println("Phương trình có 2 nghiệm \n x1 = "+((-b - Math.sqrt(delta))/(2*a))
						+"\n x2 = "+ ((-b + Math.sqrt(delta))/(2*a)));
			}
		}
	}

}
