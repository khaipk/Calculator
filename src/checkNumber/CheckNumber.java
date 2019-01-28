package checkNumber;

import java.util.Scanner;

public class CheckNumber {
public static void checkNumber() {
	System.out.println("Nhập số cần check:");
	int n = new Scanner(System.in).nextInt();
	if(CheckSNT.isPrimeNumber(n)==true) System.out.println(n+" là số nguyên tố");
	else System.out.println(n +" không phải số nguyên tố");
	
}
}
