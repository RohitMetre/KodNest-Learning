import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 2 number");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(sub(num1, num2));

		System.out.println("Enter the 2 number");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(mul(num1, num2));

		System.out.println("Enter the 2 number");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(div(num1, num2));

		System.out.println("Enter the 2 number");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(rem(num1, num2));
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static double div(int num1, int num2) {
		return num1 / num2;
	}

	public static double rem(int num1, int num2) {
		return num1 % num2;
	}

}
