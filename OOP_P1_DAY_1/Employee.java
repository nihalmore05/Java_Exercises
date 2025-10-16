package OOP_P1_DAY_1;
//8. Write an `Employee` class and add a method to apply salary bonus.
public class Employee {
   // instance variable
    String emp_name;
    int empid;
    String emp_roll;
    double salary;
    
    // constructor (parametrise using this key word)
    public Employee(String emp_name, int empid, String emp_roll, double salary){

        this.emp_name = emp_name;
        this.empid = empid;
        this.emp_roll = emp_roll;
        this.salary = salary;

    }
    // method
    void applySalaryBonus(double bonusPercent){

        double bonusAmount = (salary * bonusPercent) / 100;

        salary = salary + bonusAmount;

        System.out.println("Bonus of                : " + bonusPercent + "% applied success");
        System.out.println("After Bonus             : " + salary);
     
        
    }
   // method
    void display(){
        System.out.println("-----------EMPLOYEEE DETAILS-----------");
        System.out.println("Employee Name           : " + emp_name);
        System.out.println("Employee Id             : " + empid);
        System.out.println("Employee Roll           : " + emp_roll);
        System.out.println("Employee Sallary(Month) : " + salary);
    }


    public static void main(String[] args) {
        
        Employee e1 = new Employee("Nihal More", 100, "Full stack Java Developer", 100000);
        Employee e2 = new Employee("Vivek Mishra", 101, "Cloud Engineer", 50000);
        Employee e3 = new Employee("Raj singh", 102, "Front end Developer", 80000);
        Employee e4 = new Employee("sonakshi patil", 103, "Full stack Python Developer", 35000);
        Employee e5 = new Employee("Rohit patel", 104, "Data Science and Analysiss", 45000);

        e1.display();
        e1.applySalaryBonus(10);
        System.out.println("----------------------------------------------");
        e2.display();
        e2.applySalaryBonus(10);
        System.out.println("----------------------------------------------");
        e3.display();
        e3.applySalaryBonus(10);
        System.out.println("----------------------------------------------");
        e4.display();
        e4.applySalaryBonus(10);
        System.out.println("----------------------------------------------");
        e5.display();
        e5.applySalaryBonus(10);
    }
    
}
