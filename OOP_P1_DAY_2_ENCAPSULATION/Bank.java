package OOP_P1_DAY_2_ENCAPSULATION;

//8. Use constructor along with getters/setters to demonstrate encapsulation.

public class Bank {
    private String name;
    private long accountnum;
    private double balance;

    public Bank(String name, long accoutnum, double balance) {
        // variable ko setter method se value assign ho rahi he (jo hum constructor me
        // "this.name = name " se direct value assign krte the without check)

        /*
         * Constructor me *"setName(name)"* likhne ka matlab hai
         * Encapsulation ke rules ko constructor me bhi follow karna —
         * taaki validation aur control har jagah same tarah se apply ho.
         */
        setName(name);
        setAccountnum(accoutnum);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public long getAccountnum() {
        return accountnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountnum(long accountnum) {
        this.accountnum = accountnum;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }
   
    // display method
    public void display() {
        System.out.println("Account Holder : " + getName());
        System.out.println("Account Number : " + getAccountnum());
        System.out.println("Account Balance: " + getBalance());
    }

    public static void main(String[] args) {

        Bank bk = new Bank("Nihal", 1020350335, 150000);    // creating object

        bk.display();                    // call method

    }
}
