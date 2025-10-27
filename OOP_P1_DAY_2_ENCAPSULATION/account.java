package OOP_P1_DAY_2_ENCAPSULATION;

//7. Create an `Account` class with private balance and secure deposit/withdraw methods.

 class Account {
    
    public String name;
    public long accountnum;
    private double balance;

     

    // Deposite Method
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposite :"+ amount);
        }else{
            System.out.println("Deposite amount must be positve");
        }
    }
      // withdraw Method
    public void withdraw(double amount){
        if(amount <= balance && amount > 0){                // put condition for negative value and more than balance amount controlling
            balance -= amount;
            System.out.println("Withdraw :"+ amount);
        }else{
            System.out.println("Invalid amount OR Insufficient balance");
        }
    }

    // using getter for getting return balance
    public double getBalance() {
        return balance;
    }
    
      public static void main(String[] args) {
        Account ac = new Account();

        ac.deposit(5000);
        ac.withdraw(1000);
        ac.deposit(50000);
        ac.withdraw(-5000);

        System.out.println("Current Balance :"+ ac.balance);
      }

    


}
