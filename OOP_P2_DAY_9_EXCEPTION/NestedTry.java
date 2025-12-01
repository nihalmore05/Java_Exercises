package OOP_P2_DAY_9_EXCEPTION;
//7. Demonstrate `try` inside another `try` (nested try).

public class NestedTry {
    public static void main(String[] args) {
        try { // <----------- This is Outer 'Try'
            System.out.println("Outer Try started..........");

            try { // <-------------- This is Inner 'Try'
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch : U canot divide by zero here");
            }
            int arr[] = { 1, 2, 3, 4 };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch : The index value out of Range");
        }
        System.out.println("Program Continue.....");
    }
}
