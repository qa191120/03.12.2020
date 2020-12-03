package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in); // chinese
            System.out.println("Enter x:");
            int x = scanner.nextInt();
            boolean is_x_positive = x > 0;

            //System.out.println("Did the user entered higher than 0? " + is_x_positive);

            // do this only if x was greater than 0
            // if clause
            if (x > 0) {
                    System.out.println("You entered a positive number");
                    System.out.println("You are a very positive person");
                    x++;
            }

            if (x <= 0) {
                    System.out.println("You entered zero or negative");
                    System.out.println("X may be zero ... not sure yet");
            }

            System.out.println("Goodbye....");

            // targil:
            // enter grade of student from user into int variable (lets call it grade)
            // if grade < 55 print "failed"
            //    now set grade to be zero
            // if grade > 80 print "very good"
            //    now set grade to be 100
            // print the grade

            // solution:
            System.out.println("Please enter the grade:");
            int grade = scanner.nextInt();

            if (grade <= 55) {
                    System.out.println("Failed");
                    grade = 0;
            }

            if (grade >= 80) {
                    System.out.println("Very good!");
                    grade = 100;
            }

            System.out.println(grade);
    }
}
