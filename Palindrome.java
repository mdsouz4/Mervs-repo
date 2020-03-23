
import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Scanner scans = new Scanner(System.in);
    System.out.println("Please select from the Menu below:");
    System.out.println("\nPress 1 for case sensitive Palindrome check.");
    System.out.println("Press 2 for case insensitive Palindrome check.");
    System.out.println("Press 3 for a Palindrome check that ignores spaces.");
    int choice = scan.nextInt();
    if(choice==1)
    {
      System.out.println("Enter the string: ");
      String s = scans.nextLine();
      System.out.println("\nYou entered: " + s);
      if(isPalindrome(s)==true)
      {
        System.out.println("The string is a palindrome!");
      }
      else
        System.out.println("The string is not a palindrome!");
    }
    else if(choice==2)
    {
      System.out.println("Enter the string: ");
      String s = scans.nextLine();
      System.out.println("\nYou entered: " + s);
      String str = s.toLowerCase();
      if(isPalindromeNotCase(str)==true)
      {
        System.out.println("The string is a palindrome!");
      }
      else
        System.out.println("The string is not a palindrome!");
    }
    else if(choice==3)
    {
      System.out.println("Enter the string: ");
      String s = scans.nextLine();
      System.out.println("\nYou entered: " + s);
      String space_str = s.replaceAll("\\s","");
      if(isPalindromeSpace(space_str)==true)
      {
        System.out.println("The string is a palindrome!");
      }
      else
        System.out.println("The string is not a palindrome!");
    }
    else
      System.out.println("\nInvalid choice entered!");
  }

  public static boolean isPalindrome(String s)
  {
    String old = s;
    String reversed = "";
    for(int i = s.length()-1; i>=0; i--)
    {
      reversed = reversed + s.charAt(i);
    }
    if(old.equals(reversed))
      return true;
    else
      return false;
  }

  public static boolean isPalindromeNotCase(String str)
  {
      String original = str;
      String newstring = "";
      for(int i = str.length()-1; i>=0; i--)
      {
        newstring = newstring + str.charAt(i);
      }
      if(original.equals(newstring))
        return true;
      else
        return false;
  }

  public static boolean isPalindromeSpace(String space_str)
  {
      String former = space_str;
      String latter = "";
      for(int i = space_str.length()-1; i>=0; i--)
      {
        latter = latter + space_str.charAt(i);
      }
      if(former.equals(latter))
        return true;
      else
        return false;
  }

}
