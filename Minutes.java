/*
* Created on: January 12, 2021
* 1st year - 2nd Semester - BSCS - CC3 1B-1

Instructions: Write a Java class that declares a variable named minutes,
which accepts minutes worked on a job, and assign a value.
Display the value in hours and minutes; for example, 197 minutes becomes 3 hours
and 17 minutes. Use BufferedReader class.
 */
 
import java.io.*;

public class Minutes {
    public static void main(String[] args) {
        int minutes = 0;

        String input = " ";
        BufferedReader in = new BufferedReader(new
                InputStreamReader(System.in));
        try {
            System.out.print("Input number of minutes: ");
            input = in.readLine();
            minutes = Integer.parseInt(input);
        } catch (IOException e) {
            System.out.println("“Error!”");
        }

    int hours = minutes / 60;
    int remainder = minutes % 60;
    System.out.println(hours + " hours and " +remainder + " minutes");

    }
}
