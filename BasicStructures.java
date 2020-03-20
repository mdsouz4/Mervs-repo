import java.util.Scanner;

public class BasicStructures{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two integer values");
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println("For a you entered: " + a);
		System.out.println("For b you entered: " + b);

		int c = a+b;

		if(c>10)
		{
			System.out.println("The sum of the two integers that were entered is greater than 10");
		}
		else if(c<10)
		{
			System.out.println("The sum of the two integers that were entered is less than 10");
		}
		else
		{
			System.out.println("The sum of the two integers that were entered is equal to 10");
		}

		scan.close();
	}

}
