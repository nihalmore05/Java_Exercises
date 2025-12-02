package OOP_P2_DAY_9_EXCEPTION;

//9. Use `System.exit(0)` and check if `finally` executes.
public class exit {
    
    public static void main(String[] args) {
 
        try {
            System.out.println("Inside try block");

            // Forcefully terminate program
            System.exit(0);

        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("After try-catch-finally");
    }
}


