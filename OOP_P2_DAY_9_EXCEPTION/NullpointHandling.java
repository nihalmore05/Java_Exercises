package OOP_P2_DAY_9_EXCEPTION;
//6. Handle `NullPointerException`.


public class NullpointHandling {
    public static void main(String[] args) {
        try{                                           // using try block exception code
        String S = null;    
        System.out.println(S.length());
        }
        catch(NullPointerException e){              // handling exception here use catch block
            System.out.println(e);
        }
        finally{                                           // fianlly to close the file
            System.out.println("Finally block running....");
        }
        System.out.println("cant find length null value");
    }
}
        