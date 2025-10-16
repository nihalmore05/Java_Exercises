package OOP_P1_DAY_1;
//7. Demonstrate constructor overloading in a class.

public class Construct_overload {
    
    String empName;
    int empId;
    String jobroll;

    Construct_overload(String n, int i){

        empName = n;
        empId = i;

    }

    Construct_overload(String n, int i, String j){
        empName = n;
        empId = i;
        jobroll = j;
    }
 
    void display(){
        System.out.println("Employee Details :");
        System.out.println("-------------------------------------------");
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Id   : "+empId);
        System.out.println("Employee Roll : "+jobroll);
    }
    public static void main(String[] args) {
        
        Construct_overload e1 = new Construct_overload("Nihal", 1001125);
        Construct_overload e2 = new Construct_overload("Sahil", 1001126);
        Construct_overload e3 = new Construct_overload("Vivek", 1001127, "Cloud Engineer");
        

        e1.display();
        System.out.println("------------------------------------------------");
        e3.display();
        System.out.println("------------------------------------------------");
        e2.display();
    }
}
