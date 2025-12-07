package OOP_P2_DAY_10_THROW_THROWS;

//2. Use `throws` to handle exception in calling method.

public class MainThrows {
        //  this is the method (divide) is a causes exception so declear 'throws'
    static int divide(int a, int b) throws ArithmeticException {                 
        int result = a / b;           // if b is 0 the this line will be throw 'ArithmeticException'
        return result;

    }

    public static void main(String[] args) {
        try {
            System.out.println("Program Started......");

            int ans = divide(10, 0);                       // this is calling method
            System.out.println("Result : " + ans);                      // this line will not excecute
        } catch (ArithmeticException e) {                                    //Exception handle in the calling method (main) 
            System.out.println("Exception handle in main: " + e);
        }
        System.out.println("Program Endend normal ..........");
    }
}
