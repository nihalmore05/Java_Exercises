package OOP_P1_DAY_2_ENCAPSULATION;

//6. Add a display method using only getters.

public class Employee {
     
    // data encapsulation(hidden)
    private String name;
    private int id;
    private double salary;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // display method using only getters
    public void display(){

        System.out.println("Employee Name   :"+getName());
        System.out.println("Emp ID          :"+ getId());
        System.out.println("Employee Salary :"+getSalary());
    }

    public static void main(String[] args){

        Employee emp1 = new Employee();

        emp1.setName("Nihal More");
        emp1.setId(10012);
        emp1.setSalary(100000);

        emp1.display();                    // calling display method
    }
}
