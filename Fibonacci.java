

import java.util.Scanner;
public class Fibonacci{

public static void main(String[] args)
{
  Scanner scan = new Scanner(System.in);
  System.out.println("1. Press 1 to use iterative method!");
  System.out.println("2. Press 2 to use the recursive method!");
  int choice = scan.nextInt();
  if(choice == 1 || choice ==2)
  {
    System.out.println("Enter an integer value: ");
    int num = scan.nextInt();
    if(choice==1)
    {
      System.out.println("The Fibonacci number at the corresponding position is (found via the iterative method): " + fibo(num));
    }
    else if(choice==2)
    {
      System.out.println("The Fibonacci number at the corresponding position is (found using recursion): " + recursiveFibo(num));
    }
  }
  else
  {
    System.out.println("You entered an invalid choice!!");
  }
}


public static int fibo(int num)
{
  int val1 = 0;
  int val2 = 1;
  int val3 = 0;

  if(num==0)
  {
    return 0;
  }
  else
  {
    for(int i =2; i<=num; i++)
    {
      val3 = val1 + val2;
      val1 = val2;
      val2 = val3;
    }
    return val2;
  }
}

public static int recursiveFibo(int num)
{
  if (num==0 || num==1)
  {
    return num;
  }
  return recursiveFibo(num-1) + recursiveFibo(num-2);
}

}
