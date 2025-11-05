package OOP_P1_DAY_6_PROJECTS;
//5. Keep `name` and `age` private with getters/setters.
public class Person {
    
    private String name = "Nihal";
    private int age = 25;
    
    public Person(String name, int age){
         this.name = name;
         this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
