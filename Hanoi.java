import java.util.Scanner;

public class Hanoi{

public static void main(String[] args)
{
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter the number of planes/discs for your Towers of Hanoi game:");
  int num = scan.nextInt();
  System.out.println("The following are the moves that need to be done to beat the game:");
  System.out.println(TowersOfHanoi(num, 1, 2, 3));

}


public static int TowersOfHanoi(int num, int left, int middle, int right)
{
  if(num>0)
  {
    TowersOfHanoi(num-1, left, right, middle);
    System.out.println("Move disk number " + num + " from Tower " + left + " to Tower " + right);
    TowersOfHanoi(num-1, middle, left, right);
  }
  return 0;
}

}
