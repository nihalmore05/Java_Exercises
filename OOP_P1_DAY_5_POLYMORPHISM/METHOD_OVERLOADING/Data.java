package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//2. Overload `display()` with 1, 2, and 3 parameters.

public class Data {
     
    void display(String name){
       System.out.println("Name : " + name);
    }

    void display(int age, String address){
        System.out.println("Age : " + age + " ||  Address : " + address);
    }

    void display(int pincode){
        System.out.println("pincode :" + pincode);
    }

    public static void main(String[] args) {
        Data d = new Data();
        d.display("Nihal More");
        d.display(25, "Pune");
        d.display(411055);
    }
}
