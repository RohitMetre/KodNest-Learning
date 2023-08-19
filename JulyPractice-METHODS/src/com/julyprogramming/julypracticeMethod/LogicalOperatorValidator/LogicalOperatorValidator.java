package com.julyprogramming.julypracticeMethod.LogicalOperatorValidator;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Is input valid (true/false):");
		boolean isValid = scan.nextBoolean();
		
		System.out.println("Does input meet a certain condition (true/false):");
		boolean meetsCondition = scan.nextBoolean();
		scan.close();
		
		System.out.println(isValidInput(isValid, meetsCondition));

		if (isValid && meetsCondition) {
			System.out.println("Input is valid");
		} else {
			System.out.println("Input is not invalid");
		}

	}

	public static boolean isValidInput(boolean isValid, boolean meetsCondition) {

		return (isValid && meetsCondition);
	}
}
