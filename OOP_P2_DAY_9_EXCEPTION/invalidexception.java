package OOP_P2_DAY_9_EXCEPTION;

import java.util.Scanner;

//10. Input from user → handle invalid input exception.

public class invalidexception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                        

        try {
            System.out.println("Enter You are Number : ");
            String input = sc.nextLine();                          // taking input from user

            int number = Integer.parseInt(input);                  // Convert text to integer (but java did not convert it the exception occuring)
            System.out.println("You entered: " + number);

        } catch (NumberFormatException e) {                                  // handling Exception here
            System.out.println("Invelid Input Please Enter Number Only");

        }

        System.out.println("Program Continues");

        sc.close();

    }
}
