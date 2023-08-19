package ConditionalConstructs;

import java.util.Scanner;

public class NestedSimpleIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Loan Amount");
		int loan = scan.nextInt();

		System.out.println("Enter your loan intrest");
		int intrest = scan.nextInt();
		scan.close();

		NestedSimpleIfApp client = new NestedSimpleIfApp();
		client.sliceManager(loan, intrest);
	}
}