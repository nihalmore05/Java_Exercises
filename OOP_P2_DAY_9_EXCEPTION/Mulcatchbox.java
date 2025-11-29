package OOP_P2_DAY_9_EXCEPTION;

//3. Use multiple catch blocks for different exceptions.
//4. Use `finally` to close resources.

public class Mulcatchbox {
    public static void main(String[] args) {

        try {
            int a = 100, b = 0;
            int c = a / b; // Arithmetic Exception occuring here becous divide by zero
            System.out.println(c);
            // whe exception occuring the try block skip other code
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Error here : " + e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        catch (Exception e) {
            System.out.println("General error: " + e);
        }
        finally{                             // used finally to close Resources.
            System.out.println("The finally block running.....");
        }

    }
}