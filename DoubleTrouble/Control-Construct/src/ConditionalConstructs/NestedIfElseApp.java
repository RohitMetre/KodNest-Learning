package ConditionalConstructs;

public class NestedIfElseApp {

	void votingCheck(String Nat, int age) {
		if (Nat.equalsIgnoreCase("India")) {
			if (age >= 18) {
				System.out.println("Eligible for voting");
			} else {
				System.out.println("Still you are kid...LOL!");
			}

		} else {
			System.out.println("You are from another country so not eligible!...Get Lost!!!");
		}
	}
}
