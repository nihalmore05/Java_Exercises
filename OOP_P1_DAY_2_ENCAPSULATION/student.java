package OOP_P1_DAY_2_ENCAPSULATION;

//4. Ensure marks in `Student` class cannot exceed 100.

//5. Show how encapsulation protects data integrity.

public class student {

    public String Name;              // this is public variable so access outside class
    public int Rollnum;
    private int marks;             // data encapsulation(hidden) do not accces or modifie outside

    //getting marks
    public int getMarks() {            // get method to red the current value outer class and return them
        return marks;
    }

    // setting  a marks here

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {                                      // set condition put not marks above 100 set and not negative set
            this.marks = marks;                           
        } else {
            System.out.println("Error : Enter Marks must be between 0 and 100 ");
        }
    }

    public static void main(String[] args) {
        student s1 = new student();        // creating objects
        student s2 = new student();
        
        s1.Name = "Nihal";
        s1.Rollnum = 45;
        s1.setMarks(95);              //setter  
        
        System.out.println("Name:"+s1.Name);
        System.out.println("RollNumm:"+s1.Rollnum);
        System.out.println("Marks:"+s1.getMarks());         // getter

        System.out.println("----------------------------------------------------");
        s2.Name = "Sachin";
        s2.setMarks(110);                                    // set above 100 error occuring  show in this conditions

        System.out.println("\nName:"+s2.Name);
        System.out.println("Marks :"+s2.getMarks());
    }
}
