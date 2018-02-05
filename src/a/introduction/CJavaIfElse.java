package a.introduction;

import java.util.Scanner;

public class CJavaIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n==1||n % 2 == 1 || (n % 2 == 0 && (6 <= n && n <= 20))) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}

		input.close();
	}

}
