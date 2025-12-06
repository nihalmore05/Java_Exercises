package OOP_P2_DAY_10_THROW_THROWS;

import java.util.Scanner;

class Election extends RuntimeException{
     
    Election(String msg)
    {
        super(msg);
    }
}
class Voting{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
      
        int age=s.nextInt();

        try{

        
        if(age<18){
            throw new Election("You are not elegebal for vote");            //Throw keyword se exception object create ho jata hai and voo pbject JVM ko pass  hota hai but eception handle nahi hogi agar try catch ka use nahi kiya hoga to or jvm is Objsect ko pass kr dega difault exception Handler ko or vo uski details print kr dega
        }
        else{
            System.out.println("You can Vote");
            
        }
    }
    catch(Election e){
        e.printStackTrace();
    }
    System.out.println("Welcome....");
}
        
    
}