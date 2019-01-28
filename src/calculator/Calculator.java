package calculator;

import java.util.Scanner;

import checkNumber.CheckNumber;
import giaipt.giaiptb1;
import giaipt.giaiptb2;
import toanhoc.TinhToan;

public class Calculator {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	private static void menu() {
		do {
		System.out.println("1. Giải phương trình bậc nhất 1 ẩn");
		System.out.println("2. Giải phương trình bậc hai 1 ẩn");
		System.out.println("3. Tính toán");
		System.out.println("4. Kiểm tra số");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			giaiptb1.Giaipt();
			break;
		case 2:
			giaiptb2.Giaipt();
			break;
		case 3:
			TinhToan.TinhToan();
			break;
		case 4:
			CheckNumber.checkNumber();
			break;
		default:
			System.out.println("Tạm biệt thím");
			System.exit(0);
			break;
		}
		} while (true);
	}

}
