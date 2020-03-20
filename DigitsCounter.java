import java.util.Scanner;

public class DigitsCounter{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer value");
		int value = scan.nextInt();
		System.out.println("You entered: " + value);

		int digits=1;
		for(int i=1; value!=0; i++)
		{
			value=value/10;
			digits=i;
		}
		System.out.println("The number of digits in the integer that you entered is: " +digits);

	}

}
