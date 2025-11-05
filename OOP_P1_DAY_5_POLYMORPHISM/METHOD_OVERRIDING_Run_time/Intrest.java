package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERRIDING_Run_time;

// 2. Create a `Bank` superclass with `getRateOfInterest()`; override in `SBI`, `HDFC`.

class Bank{

    double getRateOfIntrest(){
           return 0;
    }
}
 class SBI extends Bank{                             
    double getRateOfIntrest(){                       //overriding
        return 6.5;
    }
 }

 class HDFC extends Bank{
    double getRateOfIntrest(){                     // overriding
        return 8.5;
    }
 }

public class Intrest {
    
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();


        System.out.println("SBI Rate of Intrest is  : " + b1.getRateOfIntrest());
        System.out.println("HDFC Rate of Intrest is : " + b2.getRateOfIntrest());
    }
}
