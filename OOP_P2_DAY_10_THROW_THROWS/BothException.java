package OOP_P2_DAY_10_THROW_THROWS;
//10. Write program that handles both types of exceptions.
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BothException {
    public static void main(String[] args){
        try{
        int a = 10 / 0;
        }
        catch(ArithmeticException e){                                                  //1st Exception
            System.out.println("Unchecked Exception handling....(1st Exception))");
        }
        
        try{
            FileReader fr = new FileReader("data.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("(2nd Exception...)Checked Exception handled : " + e);    // 2nd Exception
        }
        System.out.println("Program Continues.......");
    } 
}
