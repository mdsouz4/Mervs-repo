import java.util.Scanner;

public class GCD{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the first non-zero integer value:");
    int val1 = scan.nextInt();
    System.out.println("Please enter the second non-zero integer value:");
    int val2 = scan.nextInt();
    if(val1==0 || val2==0)
    {
      System.out.println("Error! A zero value was entered, unable to compute the GCD!!");
    }
    else
    {
      System.out.println("The greatest common divisor of the two integers that were entered is: " + GCommonDivisor(val1,val2));
    }
  }

  public static int GCommonDivisor(int val1, int val2)
  {
    if (val2==0)
    {
      return val1;
    }
    return GCommonDivisor(val2, val1%val2);
  }

}
