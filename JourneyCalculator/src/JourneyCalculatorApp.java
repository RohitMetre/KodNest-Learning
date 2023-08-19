import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculatorApp cal=new JourneyCalculatorApp();
		System.out.println(cal.calculatorDistance(speed,time));
	}
	public double calculatorDistance(double speed,double time) {
		return speed*time;
	}

}
