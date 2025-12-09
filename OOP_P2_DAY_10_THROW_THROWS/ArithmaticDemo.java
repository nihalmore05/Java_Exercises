package OOP_P2_DAY_10_THROW_THROWS;
//4. Demonstrate `throw new ArithmeticException`.

import java.util.Scanner;

public class ArithmaticDemo {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num == 0){
            throw new ArithmeticException("Number cannot be zero!");
        }
       System.out.println("10 divide by " + num + " = " + (10 / num));
    }
}
// if user enter 0  the this Exception Occuring
// Exception in thread "main" java.lang.ArithmeticException: Number cannot be zero!
