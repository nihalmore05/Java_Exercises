package OOP_P1_DAY_4_INHERITANCE;

//5. Create `Person → Employee → Manager` hierarchy.

//6. Add common and specific methods in each class.

//7. Demonstrate constructor chaining using `super()`.

public class Person {

    private String name;
    private int age;

    //Constructor  is  protected for child class access
    protected Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //Method  for display basic  person details
    public void displayDetails() {                                      // COMMON METHOD  ---------------
        System.out.println("--->   ***********    <---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);

    }
    
    //SPECIFIC METHOD FOR PERSON ------------
    public void walk(){
        System.out.println(name + "  The person is walking in office");
    }

    public static void main(String[] args) {
        System.out.println("----------Hierarchical---------------");

        Employee e1 = new Employee("Nihal More", 25, 1001, 100000);
        Manager m1 = new Manager("Virat sharma", 35, 120001, 200000, "Softwer and AI ML");

        System.out.println("\n------Employee Details-------");
        e1.displayDetails();                            //employee method run here
        e1.work();                         //Inherit form perent class(person)
        e1.walk();                      //call specific to employee
        
        

        System.out.println("\n------Manager Details-------");
        m1.displayDetails();                         // Manager method run here
        m1.walk();                            //call specific to employee
        m1.work();                              ////Inherit form perent class(person)   
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;

    // Constructor
    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);           //constructor chaining using 'super'

        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {               // COMMON METHOD

        super.displayDetails();            // super.displayDetails   used for display details parent class (person)


        //employee details printing
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : " + salary);             
    }
    // SPECIFIC METHOD FOR EMPLOYEE
    public void work(){
        System.out.println(employeeId +"  :-is employee working on AWS project");
    }

}

class Manager extends Employee {
    private String departmentManaged;

    // Constructor
    Manager(String name, int age, int employeeId, double salary, String departmentManaged) {

        super(name, age, employeeId, salary);    //constructor chaining using 'super'

        this.departmentManaged = departmentManaged;
    }

    @Override
    public void displayDetails() {              // COMMON METHOD

        super.displayDetails();                // used  to display details employee and person that why used super.displayDetails

        System.out.println("Department Managed : " + departmentManaged);

    }

    // SPECIFIC METHOD FOR MANAGER
    public void ManageTeams(){
        System.out.println(" The manager " + departmentManaged + " Manage mettings and calls");
    }
}
