package OOP_P2_DAY_10_THROW_THROWS;

public class Multiple_Throws {
    static void demo()
        throws ArithmeticException, NullPointerException{
            int a = 10 / 0;

            String s = null;
            System.out.println(s.length());
    }
    public static void main(String[] args){
        try{
            demo();
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error Occuring");
        }
        catch(NullPointerException e){
            System.out.println("Null value erro");
        }
    }
}
