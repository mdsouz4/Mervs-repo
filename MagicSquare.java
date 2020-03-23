
import java.util.Scanner;
public class MagicSquare{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the number of rows and columns (single entry) for your square matrix:");
    int n = scan.nextInt();
    int[][]mag_square = new int [n][n];
    System.out.println("\nPlease enter the elements of your two dimensional array:");
    for(int i=0; i<mag_square.length;i++)
    {
      for(int j=0; j<mag_square[i].length; j++)
      {
        mag_square[i][j] = scan.nextInt();
      }
    }
    if(MagSquare(mag_square,n)==true)
      System.out.println("\nThe two dimensional array is a Magic square!");
    else
      System.out.println("\nThe two dimensional array is not a Magic square!");


  }
  public static boolean MagSquare(int[][]mag_square, int n)
  {
    int sumofdiag1 = 0;
    int sumofdiag2 = 0;
    for(int i =0; i<n; i++)
    {
      sumofdiag1 = sumofdiag1 + mag_square[i][i];
    }
    for(int i=0; i<n; i++)
    {
      sumofdiag2 = sumofdiag2 + mag_square[i][n-1-i];
    }
    if(sumofdiag1!=sumofdiag2)
      return false;
    for(int i=0; i<n; i++)
    {
      int sumofcolumns=0;
      for(int j=0; j<n; j++)
      {
        sumofcolumns = sumofcolumns + mag_square[j][i];
      }
      if(sumofcolumns!=sumofdiag1)
        return false;
    }
    for(int i=0; i<n;i++)
    {
      int sumofrows = 0;
      for(int j=0; j<n; j++)
      {
        sumofrows = sumofrows + mag_square[i][i];
      }
      if(sumofrows!=sumofdiag1)
        return false;
    }
    return true;

  }

}
