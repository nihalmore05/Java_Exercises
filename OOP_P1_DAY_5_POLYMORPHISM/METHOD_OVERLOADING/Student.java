package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//3. Create `Student` class with overloaded `setData()` methods

public class Student {
    private String name;
    private int id;
    private double CGPA;


    public void setData(String studentName){
        this.name = studentName;
        System.out.println("Set Name:"+ this.name);
        
    }
    // Set the Data
    public void setData(String studentName, int studentId){
        this.name = studentName;
        this.id = studentId;
        System.out.println("Set Name: "+ this.name + "  ||  StudentId: "+ this.id);
    }

        public void setData(String studentName, int studentId, double CGPA){
        this.name = studentName;
        this.id = studentId;
        this.CGPA = CGPA;
        System.out.println("Set Name: "+ this.name + " ||  StudentId: "+ this.id +  "  || Marks CGPA : " + this.CGPA);
    }

    public void display(){
        System.out.println("-------Student Information--------");
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("CGPA : " + CGPA);

    }

    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setData("Nihal");
        s2.setData("Kiran", 1022);
        s3.setData("Ramesh", 1235, 8.23);

        s1.display();
        s2.display();
        s3.display();

    }
}
