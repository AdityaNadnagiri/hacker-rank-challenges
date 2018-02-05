package a.introduction;

import java.util.Scanner;

public class EJavaOutputFormatting {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++) {
			String s=input.next();
			int j=input.nextInt();
			System.out.printf("%-15s%03d\n",s,j);
		}
		System.out.println("================================");
		input.close();
	}
}