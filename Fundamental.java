                                                    //menu dniren programm//

                                                    //fundamental booster//

import java.util.Scanner;

public class Fundamental
{
    public static void main(String args[])
    {
        int number;
        double result;
        int i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("press  1  for  Qustion  (1)  :  Write a Java program take two number from user and print the sum (addition), multiply, subtract, divide and remainder of twonumbers");
        System.out.println("press  2  for  Qusttion (2)  :  write a program in java to accept Radius(in cms) of a circle from the user ,calculate and display(a)  Circumference of the circle (b) Area of the circle");
        System.out.println("press  3  for  Qustion  (3)  :  write a program to find any number of square and cube ");
        System.out.println("press  4  for  Qustion  (4)  :  write a program in java that take input a students marks in 5 subject (out of 100) and prints the percentage ,Total marks andgrade");
        System.out.println("press  5  for  Qustion  (5)  :  Write a Java program that takes a number as input and prints its multiplication table");
        System.out.println("press  6  for  Qustion  (6)  :  Write a Java program  to  count and display all even or odd number  out of 10 ");
        System.out.println("press  7  for  Qustion  (7)  :  Write a Java program to calculate the absent fine.when students absent 1 week then he/she will have to pay 7 rupees  per day and above will have to pay10 rupees perday");
        System.out.println("press  8  for  Qustion  (8)  :  Write a Java program to check   you   are eligible for vote or not/drive or not/");
        System.out.println("press  9  for  Qustion  (9)  :  Write a Java program to check whether the given number is positive negative and zero");
        System.out.println("press  10 for  Qustion  (10) : Write a program to accept an alphabet and  Check its  vowelorconsonant");

        number=input.nextInt();

        // 1. two numbers opration //

            switch(number)
            {
                case 1:
                            Scanner scanner = new Scanner(System.in);
                            System.out.print("enter the first number : ");
                            double number1 = scanner.nextDouble();
                            System.out.print("enter the second number : ");
                            double number2 = scanner.nextDouble();

                                System.out.println("Sum       =  "  +   (number1 + number2));
                                System.out.println("Multiply  =  "  +   (number1 * number2));
                                System.out.println("Subtract  =  "  +   (number1 - number2));
                                System.out.println("Divide    =  "  +   (number1 / number2));
                                System.out.println("Remainder =  "  +   (number1 % number2));
                break;
            
        
        // 2. circle opretion //
                case 2:
                            Scanner scan1 = new Scanner(System.in);
                            System.out.println("Enter The Radius Of The Circle (in cm): ");
                            double Radius =scan1.nextDouble();
                            double Circumference = 2 * Math.PI * Radius;
                            double Area = Math.PI * Radius * Radius;

                                System.out.println("Circumference: " + Circumference);
                                System.out.println("Area: " + Area);

        // 3. Squre & Cube opretion//
                case 3:
                            Scanner scanner4 = new Scanner(System.in);
                            System.out.println("Enetr a number : ");
                            double num =    scanner4.nextDouble();
                            double square = Math.pow(num, 2);
                            double cube = Math.pow(num, 3);
                                
                                System.out.println("Squre: " + square);
                                System.out.println("Cube:  "  +  cube);
                            

        // 4. Student marks opretion//
                case 4:
                            Scanner scanner6 = new Scanner(System.in);
                            System.out.println("Enter 5 Subject Marks  (out of 100): ");
                            double Totalmarks =0;
                            for(i = 1; i <= 5; i++)
                            {
                                System.out.println("Subject " + i +":");
                                Totalmarks += scanner6.nextDouble();
                            }
                                    double percentage = (Totalmarks/500)*100;
                                    System.out.println("Total Marks: "+ Totalmarks);
                                    System.out.println("percentage: "+ percentage +"%");

        // 5. multiplication table//
                case 5:
                            Scanner scan8 = new Scanner(System.in);
                            System.out.println("Enter any number and get multiplication tabel : ");
                            int tabelNumber  = scan8.nextInt();
                            for(i = 1;i <= 10; i++)
                            {
                                System.out.println(tabelNumber +"*" + i +"="+(tabelNumber * i)) ;
                            }
        
        // 6. even or odd numbers opretion //
                case 6:
                            Scanner scann9 = new Scanner(System.in);
                            int evenCount =0;
                            int oddCount =0;
                                    for(i = 1; i <= 10; i++)
                                    {
                                        if (i % 2 ==0 )
                                        {
                                            evenCount++;
                                        }
                                        else
                                        {
                                            oddCount++;
                                        }
                                    }
                                    System.out.println("Even Count: " + evenCount);
                                    System.out.println("Odd Count: " + oddCount);

        // 7. absent fine opretion //
                case 7:
                            Scanner scan10 = new Scanner(System.in);
                            System.out.println("Enter the total days of absent : ");
                            int absentDays = scan10.nextInt();
                            int fine = (absentDays <=7) ? absentDays * 7 :(absentDays - 7) * 10 + 7 * 7;
                            System.out.println("Absent Fine: " + fine + " rupees");

        // 8. Eligiblity for voting opretion //
                case 8:
                            Scanner scan11 = new Scanner(System.in);
                            System.out.println("Enter your Age :");
                            int Age = scan11.nextInt();
                            if(Age >= 18)
                            {
                                System.out.println("Congartulation You Are Eligible For Voting : ");

                            }
                            else if (Age>=16)
                            {
                                System.out.println("Congratulation You Are Eabele For Driving But Not Gateing Voting : ");
                            }
                            else
                            {
                                System.out.println("Sorry You Are Not Eabele For Driving And Voting!!!!");
                            }

        // 9. Possitive , Nagtive or Zero opretion //
                case 9:
                            Scanner scann12 =  new Scanner(System.in);
                            System.out.println("Enter a number :" );
                            double checknumber = scann12.nextDouble();
                            if(checknumber > 0)
                            {
                                System.out.println(" Congartulastion Enter number is possitive ");
                            }                      
                            else if(checknumber < 0)
                            {
                                System.out.println(" Badlation Enter number is nagative ");
                            }
                            else
                            {
                                System.out.println("Enter number is Zero***");
                            }


        // 10. vowel or Constant opretion //
                case 10:
                            Scanner scanner0 = new Scanner(System.in);
                            System.out.println("Enter an Alphabet : ");
                            char ch =scanner0.next().charAt(0);
                                    switch (ch)
                                    {
                                        case 'a':
                                        case 'e':
                                        case 'i':
                                        case 'o':
                                        case 'u':
                                                System.out.println("vowel");
                                                break;
                                        default:
                                                System.out.println("Constant");
                                                
                                    }

            }    
            input.close();
    }
}