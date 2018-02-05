package a.introduction;

import java.util.Scanner;

public class HJavaDatatypes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long t = input.nextLong();
		for (int i = 0; i < t; i++) {
			try {
				long x = input.nextLong();
				System.out.println(x + " can be fitted in:");
				if (-Math.pow(2, 7) <= x && x <= (Math.pow(2, 7) - 1)) {
					System.out.println("* byte\n* short\n* int\n* long");
				} else if (-Math.pow(2, 15) <= x && x <= (Math.pow(2, 15) - 1)) {
					System.out.println("* short\n* int\n* long");
				} else if (-Math.pow(2, 31) <= x && x <= (Math.pow(2, 31) - 1)) {
					System.out.println("* int\n* long");
				} else if (-Math.pow(2, 63) <= x && x <= (Math.pow(2, 63) - 1)) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(input.next() + " can't be fitted anywhere.");
			}
		}
		input.close();
	}
}