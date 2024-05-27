
import java.util.Scanner;
import java.lang.System;

public class Test
{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter Number 1: ");
  int a = input.nextInt();
  System.out.println("Enter Number 2: ");
  int b = input.nextInt();
  int c = a + b;
  System.out.println("First Number is: " + a);
  System.out.println("Second NUmber is: " + b);
  System.out.println("Sum of Two NUmbers is: " + c);
  }
}
  