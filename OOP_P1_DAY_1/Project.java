package OOP_P1_DAY_1;

import java.util.ArrayList;                       // using arraylist
import java.util.Scanner;

/*
 * Project Name : Simple Login Banking Apllication
 * Description   :  
 * 
 * The Simple baking apllication providing following :
 * 
 * 1)Login  through user id  and password
 * 2)Deposit Amount
 * 3)Withdraw Amount
 * 4)Check Balance
 * 5)Display Account Details
 * 
 * 
 */
public class Project {
    // instance variable
    String name;
    int accountnum;
    String password; // simple password (for demo)
    double balance;
//constructor
    Project(String name, int accountnum, String password, double balance) {
        this.name = name;
        this.accountnum = accountnum;
        this.password = password;
        this.balance = balance;
    }
//method
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println(" Deposited: " + amount);
            System.out.println(" New Balance: " + balance);
        }
    }
//method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn: " + amount);
            System.out.println(" Remaining Balance: " + balance);
        }
    }
//method
    void display() {
        System.out.println("--------------------**--Welcome Bank Of India--**--------------------");
        System.out.println("Customer Name    : " + name);
        System.out.println("Account Number   : " + accountnum);
        System.out.println("Account Balance  : " + balance);
    }
    
    // Find account by account number
    public static Project findAccount(ArrayList<Project> accounts, int accNum) {
        for (Project acc : accounts) {
            if (acc.accountnum == accNum) {
                return acc;
            }
        }
        return null;
    }
    
    // Main program with pre-stored users and login
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pre-populate some accounts (username = accountnum, password = password)
        ArrayList<Project> accounts = new ArrayList<>();
        accounts.add(new Project("Nihal More", 101, "pass101", 25000.0));
        accounts.add(new Project("Asha Patil", 102, "asha102", 15000.0));
        accounts.add(new Project("Rahul Kumar", 103, "rahul103", 5000.0));
        
        System.out.println("=====  >>> Welcome to Bank of India <<< =====");
        
        mainLoop:
        while (true) {
            
            System.out.println("\n1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            int mainChoice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (mainChoice) {
                case 1:
                    int attempts = 0;
                    boolean loggedIn = false;
                    Project current = null;

                    while (attempts < 3 && !loggedIn) {
                        System.out.print("\nEnter account number (username): ");
                        int accNum = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter password: ");
                        String pwd = sc.nextLine();

                        Project found = findAccount(accounts, accNum);
                        if (found != null && found.password.equals(pwd)) {
                            System.out.println("\n Login successful. Welcome, " + found.name + "!");
                            loggedIn = true;
                            current = found;
                        } else {
                            attempts++;
                            System.out.println(" Login failed. Attempts left: " + (3 - attempts));
                        }
                    }

                    if (!loggedIn) {
                        System.out.println("Too many failed attempts. Returning to main menu.");
                        break; // back to main menu
                    }

                    // User is logged in -> show account menu
                    int choice;
                    do {
                        System.out.println("\n--- Account Menu ---");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Display Account Details");
                        System.out.println("5. Logout");
                        System.out.println("6. Exit Program");
                        System.out.print("Enter your choice: ");
                        choice = sc.nextInt();
                        sc.nextLine(); // consume newline

                        switch (choice) {
                            case 1:
                                System.out.print("Enter amount to deposit: ");
                                double dep = sc.nextDouble();
                                sc.nextLine();
                                current.deposit(dep);
                                break;
                            case 2:
                                System.out.print("Enter amount to withdraw: ");
                                double wd = sc.nextDouble();
                                sc.nextLine();
                                current.withdraw(wd);
                                break;
                            case 3:
                                System.out.println(" Current Balance: " + current.balance);
                                break;
                            case 4:
                                current.display();
                                break;
                            case 5:
                                System.out.println(" Logged out successfully.");
                                break; // will break to outer do-while and then back to main menu
                            case 6:
                                System.out.println(" Thank you for using Bank of India!");
                                break mainLoop; // exit entire program
                            default:
                                System.out.println(" Invalid choice, please try again!");
                        }

                    } while (choice != 5);                            

                    break;

                case 2:
                    System.out.println(" Thank you for using Bank of India!");
                    break mainLoop;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
