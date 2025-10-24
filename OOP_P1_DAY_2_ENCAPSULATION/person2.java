package OOP_P1_DAY_2_ENCAPSULATION;

//2. Restrict age from being set below 0.

public class person2 {
    
    private String name;
    private int age;
     
    //Methods for "Name"
    public String getName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }
    
    // methods for "Age"
    public int getAge(){
        return age;
    }

    public void SetAge(int age){
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("Age Must be Positive");
        }
    }

    public static void main(String[] args) {
        
        person2 person2 = new person2();

        person2.SetName("Nihal");
        person2.SetAge(-1);

        System.out.println("Name : "+ person2.getName());
        System.out.println("Age  : "+ person2.getAge());

        

    }

}
