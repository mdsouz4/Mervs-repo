import java.util.Scanner;

public class Primes{

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a positive integer value");
    int number = scan.nextInt();
    System.out.println("You entered: " + number);
    if(number>0)
    {
      System.out.println("The number that you entered is positive!");
    }
    else if(number<0)
    {
      System.out.println("The number that you entered is negative!");
    }
    else
    {
      System.out.println("The number that you entered is 0 (neither positive nor negative)");
    }

    if(isPrime(number)==false||number==0||number==1)
    {
      System.out.println("The number is not a prime number");
    }
    else
    {
      System.out.println("The number is prime");
    }
    for(int i=number+1; i<Integer.MAX_VALUE;i++)
    {
      if(isPrime(i)==true && isPrime(i+2)==true)
      {
        System.out.println("The first number of the next set of twin primes is: "+ i);
        break;
      }
    }
  }

    public static boolean isPrime(int number)
    {
      int num=2;
      while(num<=number/2)
      {
        if(number==0||number==1||number%num==0)
        {
          return false;
        }
        num++;
      }
      return true;
    }
  }
