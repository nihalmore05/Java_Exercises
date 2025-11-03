package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//8. Demonstrate automatic type promotion in overloading.

public class AutoTypePramotion {

    public static int sum(int a, int b){
    System.out.println("int version called");
    return a + b;
}

    // public static double sum(double a, double b){
    //     System.out.println("---------");
    //     return a + b;
   //}

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;

        System.out.println("Automatic Type Pramotion : ");

        double result = sum(num1,  num2);                           
        System.out.println("Argument passs :  int " + num1 +  "  and   int  " + num2);         

        System.out.println("Final Reults  Convert (pramote) in double  : "+ result);    
    }
}
