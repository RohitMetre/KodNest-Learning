import java.util.Scanner;

public class TempratureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter temprature convert farenhaite ro celcius");
		double fahrenheit=scan.nextDouble();
		
		TemperatureConverter tc=new TemperatureConverter();
		
		System.out.println(tc.convertFahrenheitToCelsius(fahrenheit));

	}


}
