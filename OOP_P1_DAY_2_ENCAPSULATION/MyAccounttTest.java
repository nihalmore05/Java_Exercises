package OOP_P1_DAY_2_ENCAPSULATION;
//9. Try to access private data directly and fix it with getters.
  class Account{
    
    private double balance = 6000;
     
    //getter method used
    public double getBalance(){
        return balance;
    }
  }
  public class MyAccounttTest{
    public static void main(String[] args){

        Account acc = new Account();
    
        // System.out.println( acc.balance);               // trying to access private data   but not possible becuse its private so do not access direct


        System.out.println("Balance : "+ acc.getBalance());
    }
}
