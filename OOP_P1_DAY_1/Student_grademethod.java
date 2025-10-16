package OOP_P1_DAY_1;
//5. Add a method in `Student` to calculate grade.
public class Student_grademethod {
    
    // instance variable used
    int rollnum;
    String studname;
    double marks;

    //constructor used
    Student_grademethod(int rollnum, String studname, double marks){

        this.rollnum = rollnum;
        this.studname = studname;         // use this key word to saperate instance variable to parameters
        this.marks = marks;

    }
        void display(){                             //display method
        
        System.out.println("---------------------------------------------------");
        System.out.println("Student Details:");
        System.out.println("---------------------------------------------------");
        System.out.println("Roll Number     : "+rollnum);
        System.out.println("Name Of Student : "+studname);
        System.out.println("Marks Of Student: "+marks);
        System.out.println("----------------------------------------------------");
    }
      
    // Grade Method
    public void StudentGrade(){
       if(this.marks > 90){
        System.out.println("Grade        :    A");
       }else if(this.marks >70){
        System.out.println("Grade        :    B");
       }else{
        System.out.println("Grade        :    C");
       }
    }

    public static void main(String[] args){

        Student_grademethod s1 = new Student_grademethod(101, "Nikhil", 95);
        Student_grademethod s2 = new Student_grademethod(102, "Raj", 81);
        Student_grademethod s3 = new Student_grademethod(103, "Rohit", 55);

        s1.display();
        s1.StudentGrade();
        s2.display();
        s2.StudentGrade();
        s3.display();
        s3.StudentGrade();
        System.out.println("----------------------------------------------------");
    }
    
}
