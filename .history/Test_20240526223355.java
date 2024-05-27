
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
  System.out.print("Enter You Age: ");
  int age = input.nextInt();
  System.out.println("Your Name: " + name);
  System.out.println("Your Age is: " + age );
  }
}