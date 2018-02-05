package a.introduction;

import java.util.Scanner;

public class BJavaStdinAndStdoutI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			System.out.println(input.nextInt());
		}
		input.close();
	}

}
