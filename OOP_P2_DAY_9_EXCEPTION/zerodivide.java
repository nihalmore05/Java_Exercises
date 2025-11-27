package OOP_P2_DAY_9_EXCEPTION;

//1. Divide by zero using try-catch.

class zerodivide {

    public static void main(String[] args) {
        try {                      // using 'try' keyword to cover risk code
            int a = 100, b = 0, c;

            c = a / b;
            System.out.println(c);
        } catch (Exception e) {            // using 'catch'  keyword to  use handling code whe the any kind of exception occuring in code
 
            System.out.println(e);
        }
        System.out.println("You cant divide by zero");
    }
}
