import java.util.Scanner;
public class Circle{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the radius of the circle (cm): ");
    float radius = scan.nextFloat();
    System.out.println("The diameter of the circle is: ");
    System.out.println(diameter(radius) + " cm");
    System.out.println("The area of the circle is: ");
    System.out.println(area(radius) + " cm^2");
    System.out.println("The circumference of the circle is: ");
    System.out.println(circumference(radius) + " cm");
  }

  public static float diameter(float radius)
  {
    return 2*radius;
  }

  public static double area(float radius)
  {
    return Math.PI*Math.pow(radius,2);
  }

  public static double circumference(float radius)
  {
    return 2*Math.PI*radius;
  }
}
