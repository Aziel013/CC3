/*
* Created on: January 12, 2021
* 1st year - 2nd Semester - BSCS - CC3 1B-1

Instructions: Write a Java class that calculates and displays the conversion of an
entered number of dollars into currency denominations—20s, 10s, 5s, and 1s. Save the
class as Dollars.java. Use Scanner class.
 */

import java.util.Scanner;
public class Dollars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of dollars: ");
        int dollar = sc.nextInt();

        int twenties = dollar / 20;
        int tens = (dollar - twenties * 20) / 10;
        int fives = (dollar - ((twenties *20) + (tens * 10))) /5;
        int ones = (dollar - ((twenties * 20) + (tens * 10 )+ (fives * 5)));

        System.out.print("You have " + twenties + " twenties, "
                        + tens + " tens, " + fives + " fives, and "
                        + ones + " ones ");
    }
}
