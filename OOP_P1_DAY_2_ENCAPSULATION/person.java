package OOP_P1_DAY_2_ENCAPSULATION;

// 1. Create a `Person` class with private `name` and `age`; use getters and setters.

class Person {

     // Encapsulation  (data hiding) using private key word
     
    private String name;
    private int   age;

    public String getName(){

        return name;         // return the name
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;         // return the age
    }

    public void setAge(int age){
            
           this.age = age;
    }

    public static void main(String[] args) {
        
        Person person = new Person();

        person.setName("Nihal");                  // use setter
        person.setAge(25);                         // use setter

        System.out.println("Name : " + person.getName());    // use getter
        System.out.println("Age  : "+ person.getAge());      // use getter
    }
}