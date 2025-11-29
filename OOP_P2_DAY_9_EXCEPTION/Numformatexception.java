package OOP_P2_DAY_9_EXCEPTION;
//5. Handle `NumberFormatException`.
public class Numformatexception {

    public static void main(String[] args) {
    try{                                          //code that throw the Exception
        String s = "123ssd";

        int num = Integer.parseInt(s);              //Integer.parseInt() ek method hai jo String ko integer number me convert karta hai.

        System.out.println(num);
    }
    catch(NumberFormatException s){                  //Exception hanndling
        System.out.println(s);
    }
    System.out.println("Please Enter valid Number or we can't convert String to number");
    }
}
