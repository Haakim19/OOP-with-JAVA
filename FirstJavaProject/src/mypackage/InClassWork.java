
package mypackage;

import java.util.Scanner;

public class InClassWork {
    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);
    
    //    Question 01
//Imagine you are developing a simple payroll system for a small business. The company offers a
//yearly bonus to employees based on their years of service. Write a java program that asks the
//user to input an employee's years of service and their current salary. The program should
//calculate and display the bonus amount based on the following conditions:
//  • If the employee has more than 10 years of service, they receive a 10% bonus on their salary.
//  • If the employee has between 5 to 10 years of service, they receive a 5% bonus on their salary.
//  • If the employee has less than 5 years of service, they receive a 2% bonus on their salary.
        
//        double bonus = 0 , salary = 0;
//        int serviceYear = 0;
//        System.out.print("Enter Your Current Salary- ");
//        salary = Scan.nextDouble();
//        System.out.print("Enter Your Years Of Salary- ");
//        serviceYear = Scan.nextInt();
//        
//        if (serviceYear >= 0){
//            if (serviceYear >= 10){
//            bonus = salary * 0.1;
//            }
//            else if (serviceYear >=5){
//             bonus = salary * 0.05;
//            }
//            else if (serviceYear >0){
//             bonus = salary * 0.02;
//            }
//        }
//        else {
//            System.out.println("Enter a Valide Value");
//        }
//        
//        System.out.println("Your Bonus Salary is- " + bonus);

    
    
    //Question 02
//A telecommunication company offers three packages for their customers. Write a java program
//to input the package type and the number of units called (in seconds) by a customer using the
//selected package. The program should output the monthly final bill amount of the customer. If
//the user enters a wrong package type, display a relevant error message.



//        int packageType = 0;
//        double numberOfUnit = 0;
//        double finalBill = 0;
//        
//        System.out.print("Package Type- ");
//        packageType = Scan.nextInt();
//        
//        if (packageType <=0){
//            System.out.println("Invalid Package Type!");
//        }
//        else {
//            System.out.print("Number Of Units Called- ");
//            numberOfUnit = Scan.nextInt();
//        switch(packageType){
//            case 1 -> finalBill = 2500 + numberOfUnit * 2;
//            case 2 -> finalBill = 1500 + numberOfUnit * 3;
//            case 3 -> finalBill = 1000 + numberOfUnit * 3.5;
//           
//        }
//        System.out.println("Your Final Bill is - " + finalBill "LKR");
//        }
//        
        //Question 03
//A plant sales company will do N number of sales per day (N – User input value). Program must
//accept a number of sales per month. Then calculate the average daily sales. Find the number of
//days that they exceeded the average sales and display the message according to the following
//criteria.
        
//        double salesPerMonth = 0;
//
//
//        System.out.print("Sales Per Month- ");
//        salesPerMonth = Scan.nextDouble();
//        double salesPerDay = salesPerMonth/30;
//        if (15 <=salesPerDay){
//            System.out.println("Exellent");
//        }
//        else if (10 <= salesPerDay){
//            System.out.println("Good");
//        }
//        else if (5 <= salesPerDay){
//            System.out.println("Need More Product Advertising");
//        }
//        else {
//            System.out.println("Wada hariyata karapang");
//        }
        
    //Question 04
//Write a java program to accept monthly average rain fall figure for the year 2020 (January to
//December) into an array. Display the following:
//● Annual rain-fall figure of year 2020.
//● Month which had the heaviest rain fall.
//● Month which had the minimum rain fall.
//● Display the rain fall figures from December – January
         int[] rainFall = new int[12];
         int annualRainFall = 0;
         int min = 10000, max = 0 , maxindex = 0, minindex = 0;
         
         for (int x = 0 ; x < 12 ; x++){
             System.out.print("Enter The Monthly Rain Fall For Month "+(x+1)+"- ");
             rainFall[x] = Scan.nextInt();
             annualRainFall = annualRainFall + rainFall[x];
             
             if(rainFall[x] > max){
                 max = rainFall[x];
                 maxindex = x +1;
             }
             if(rainFall[x] < min){
                 min = rainFall[x];
                 minindex = x +1;
             }
         }
         System.out.println("Annual Rain Fall- " + annualRainFall);
         System.out.println("Heaviest Rain Fall- Month " + maxindex);
         System.out.println("Minimum rain fall-Month "+ minindex);
         
         for (int i = 11 ; i >=0 ; i --){
             System.out.println("Month " + i +"-"+rainFall[i]);
         }
            
    }
}
    
    
    


