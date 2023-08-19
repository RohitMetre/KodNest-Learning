package ConditionalConstructs;

import java.util.Scanner;

public class ElseifLadder {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter Score");
         int score=scan.nextInt();
         scan.close();
         
         ElseifLadderApp eil=new ElseifLadderApp();
         eil.checkScore(score);
	}

}
