//4. Abstract `Employee` with `calculateSalary()`; implement in `FullTime`, `PartTime`.


// abstract class
abstract class Employee {
    String name;
    int id;


    //constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //abstaract method  (no body)
    abstract double calculateSalary();


    // common methods for showing details
    void showDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

// subclass  (fullTime)
class FullTime extends Employee {
    double monthlySalary;

    FullTime(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}
// subclass  (Part-Time)
class PartTime extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTime(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// main class
public class Companey {
    public static void main(String[] args) {
        Employee e1 = new FullTime("Nihal", 101, 100000);
        Employee e2 = new PartTime("Rahul", 102, 80, 250);

        e1.showDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        System.out.println("-----------------------------");

        e2.showDetails();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
