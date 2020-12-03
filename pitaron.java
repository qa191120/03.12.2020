package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in); // chinese

            // 1. input from user 2 int numbers into a,b
            // 2. print a * b
            System.out.println("Please enter 2 int numbers:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a * b);

            // 3. input from user 2 double numbers into c,d (nextDouble)
            // 4. print c / d
            System.out.println("Please enter 2 double numbers:");
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            System.out.println(c / d);

            // 5. input from user 2 longs into e, f
            // 6. print a + b * c - d + (e * f)
            System.out.println("Please enter 2 long numbers:");
            long e = scanner.nextLong();
            long f = scanner.nextLong();
            System.out.println(a - b * -c - d + (e * f));

            // 7. input boolean from user named are_you_smart
            // 8. print are_you_smart
            System.out.println("Are you smart?");
            boolean are_you_smart = scanner.nextBoolean();
            System.out.println("Is smart ? " + are_you_smart);

    }
}
