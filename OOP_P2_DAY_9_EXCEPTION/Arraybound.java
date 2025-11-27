package OOP_P2_DAY_9_EXCEPTION;

public class Arraybound {
public static void main(String[] args) {
    
    try{
    int [] num = {1,2,3,4,5};
    
    System.out.println(num[5]);
    
}catch(Exception e){
    System.out.println(e);
}
System.out.println("You canot enter out of limit value");
}
}
