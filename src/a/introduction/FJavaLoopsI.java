package a.introduction;

import java.util.Scanner;

public class FJavaLoopsI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (i * n));
		}
		input.close();
	}

}
