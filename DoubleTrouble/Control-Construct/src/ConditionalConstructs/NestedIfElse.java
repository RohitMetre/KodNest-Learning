package ConditionalConstructs;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Nationality");
		String Nat = scan.next();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		scan.close();

		NestedIfElseApp vc=new NestedIfElseApp();
		vc.votingCheck(Nat,age);

	}

}
