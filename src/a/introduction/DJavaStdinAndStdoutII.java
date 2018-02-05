package a.introduction;

import java.util.Scanner;

public class DJavaStdinAndStdoutII {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i = input.nextInt();
		Double d = input.nextDouble();
		input.nextLine();
		String s = input.nextLine();

		System.out.println("String: " + s + "\nDouble: " + d + "\nInt: " + i);

		input.close();
	}
}
