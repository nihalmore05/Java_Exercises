package OOP_P1_DAY_1;
//9. Create a `BankAccount` class with deposit and withdraw methods.
public class BankAccounnt {

    // instance variable

    String name;
    int accountnum;
    double balance;

    //  constructor used here
    BankAccounnt(String name, int accountnum, double balance){

        this.name = name;
        this.accountnum = accountnum;
        this.balance = balance;
    }

    // deposit method 
    void deposit(double amount){
          if(amount <= 0){
            System.out.println("Invalid deposit amount..");
          }else{
            balance += amount;                                    // here addition assignment operator used ("balance = balance + amount"  to avoid this)
            System.out.println("Deposit Amount   : " + amount);
            System.out.println("New Balance      : " + balance);
          }
      
       
    }
      // withdraw method
    void withdraw(double ammount){
        if(ammount <= 0){
            System.out.println("Invalid Withdraw amount..");
        }else if(ammount > balance){
            System.out.println("Insufficient fund");
        }else{
            balance -= ammount;
            System.out.println("Withdraw         : " + ammount);
            System.out.println("Remain Blance    : " + balance);
        }

    }
   // display method to display details 
    void displya(){

        System.out.println("--------------------**-------------------------**--------------------");
        System.out.println("--------------------**  Welcome Bank Of India  **--------------------");
        System.out.println("--------------------**-------------------------**--------------------");
        System.out.println("Customer Name    : " + name);
        System.out.println("Account Number   : " + accountnum);
        System.out.println("Account Balance  : " + balance);
    }


    public static void main(String[] args) {
        
        BankAccounnt b1 = new BankAccounnt("Nihal More", 101, 25000);       // creating object
        BankAccounnt b2 = new BankAccounnt("Raj Kadam", 102, 11500);

        b1.displya();
        System.out.println("----------------------------------------------------------------------");
        b1.deposit(5000);
        System.out.println("----------------------------------------------------------------------");
        b1.withdraw(4000);
        System.out.println("----------------------------------------------------------------------");

        b2.displya();
        System.out.println("----------------------------------------------------------------------");
        b2.deposit(1000);
        System.out.println("----------------------------------------------------------------------");
        b2.withdraw(500);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                         Thank You                                    ");
        System.out.println();

    }
    
}
