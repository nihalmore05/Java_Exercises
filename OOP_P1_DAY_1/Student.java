package OOP_P1_DAY_1;
//4. Create a `Student` class with roll number, name, and marks; add a display method.
public class Student {

    //instance variable used

    String studname;
    int  rollnumber;
    double marks;
     
    // constructor use here
    public Student(String studname, int rollnumber, double marks){
      
        // this keyword use
        this.rollnumber = rollnumber;
        this.studname = studname;      
        this.marks = marks;
    }
    
    // display method use 
    void display(){
        
        System.out.println("---------------------------------------------------");
        System.out.println("Student Details:");
        System.out.println("---------------------------------------------------");
        System.out.println("Roll Number     : "+rollnumber);
        System.out.println("Name Of Student : "+studname);
        System.out.println("Marks Of Student: "+marks);
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args){

        Student s1 = new Student("Sakshi", 45,  95);
        Student s2 = new Student("Harshal", 46,  98);
        Student s3 = new Student("Damini", 47,  90);
        Student s4 = new Student("Abhishak", 48,  92);
        Student s5 = new Student("Sonali", 49,  91);
        
       s1.display();
       s2.display();
       s3.display();
       s4.display();
       s5.display();
    }
    
}
