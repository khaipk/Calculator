package toanhoc;

import java.util.Scanner;

public class TinhToan {

	public static void TinhToan() {
		boolean flag = true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Bạn cần thực hiện phép tính nào?");
			System.out.println("1. Cộng 2 số");
			System.out.println("2. Trừ 2 số");
			System.out.println("3. Nhân 2 số");
			System.out.println("4. Chia 2 số");
			System.out.println("5. Tính giai thừa của 1 số");
			System.out.println("6. Tính lũy thừa");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.print("Nhập số hạng 1:");
				double a = sc.nextDouble();
				System.out.print("Nhập số hạng 2:");
				double b = sc.nextDouble();
				System.out.println("Kết quả: "+a+"+"+b+"="+(a+b));
				break;
			case 2:
				System.out.print("Nhập số bị trừ:");
				 a = sc.nextDouble();
				System.out.print("Nhập số trừ:");
				 b = sc.nextDouble();
				System.out.println("Kết quả: "+a+"-"+b+"="+(a-b));
				break;
			case 3:
				System.out.print("Nhập thừa số 1:");
				 a = sc.nextDouble();
				System.out.print("Nhập thừa số 2:");
				 b = sc.nextDouble();
				System.out.println("Kết quả: "+a+"*"+b+"="+(a*b));
				break;
			case 4:
				System.out.print("Nhập số bị chia:");
				 a = sc.nextDouble();
				System.out.print("Nhập số chia:");
				 b = sc.nextDouble();
				 if (b==0) {
					 System.out.println("Số chia không thể là 0");
					 break;
				 }
				System.out.println("Kết quả: "+a+"/"+b+"="+(a/b));
				break;
			case 5:
				System.out.println("Bạn muốn tính giai thừa của số nào:");
				int c = sc.nextInt();
				System.out.println("Kết quả: "+tinhGiaiThua(c));
				break;
			case 6:
				System.out.print("Nhập thừa số:");
				int thuaso= sc.nextInt();
				System.out.print("Nhập lũy thừa:");
				int mu = sc.nextInt();
				double kq =1;
				for(int i=1;i<=mu;i++) {
					kq *= thuaso;
				}
				System.out.println("Kết quả : "+kq);
				break;

			default:
				flag = false;
				break;
			}

		} while(flag == true);
	}
	private static long tinhGiaiThua(int c) {
		if(c>0) {
			return c*tinhGiaiThua(c-1);
		} else return 1;
	}
}
