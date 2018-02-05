package a.introduction;

import java.util.Scanner;

public class IJavaEndOfFile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		while (input.hasNext()) {
			System.out.println(++i + " " + input.nextLine());
		}
		input.close();
	}
}
