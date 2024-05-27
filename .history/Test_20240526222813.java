
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.lang.System;

public class Test
{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter You Name: ");
  String name = input.nextLine();
  System.out.print("Enter Number 1: ");
  int a = input.nextInt();
  System.out.print("Enter Number 2: ");
  int b = input.nextInt();
  int c = a + b;
  System.out.println("Your Name is: " + name);
  System.out.println("First Number is: " + a);
  System.out.println("Second NUmber is: " + b);
  System.out.println("Sum of Two NUmbers is: " + c);
  }
}
  