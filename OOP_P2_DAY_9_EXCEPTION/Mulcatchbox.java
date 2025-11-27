package OOP_P2_DAY_9_EXCEPTION;

//3. Use multiple catch blocks for different exceptions.

public class Mulcatchbox {
    public static void main(String[] args){
   
    try{
    int a = 100, b = 0;
    int c = a/b;                   // Arithmetic Exception occuring here becous divide by zero   
    System.out.println(c);                    
                                       // whe exception occuring the try block skip other code
    String s = null;
    System.out.println(s.length());
}
    catch(ArithmeticException e)
    {
        System.out.println("Arithmatic Error here : " + e);
    }
    catch(NullPointerException e)
    {
        System.out.println(e);
    }

    catch (Exception e) {
    System.out.println("General error: " + e);
}

}
}