
import java.util.Scanner;
import java.util.Arrays;

public class Bubble{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the  number of elements in your array: ");
    int n = scan.nextInt();
    int[]array = new int[n];
    System.out.println("Please enter the integer value for each element in your array:");
    for(int i =0; i<n; i++)
    {
      array[i] = scan.nextInt();
    }
    System.out.println("\nYou entered: ");
    for(int i=0; i<array.length; i++)
    {
      System.out.print(array[i] + " ");
    }
    int store=0;
    for(int m=0; m<array.length; m++)
    {
      for(int j=0; j<array.length-1; j++)
      {
        if(array[j]>array[j+1])
        {
          store = array[j];
          array[j] = array[j+1];
          array[j+1] = store;

        }
      }
    }

    System.out.println("\n\nThe sorted array (using Bubble sort) is as follows:");
    for(int i=0; i<array.length; i++)
    {
      System.out.print(array[i]+" ");
    }
  }
}
