package OOP_P1_DAY_3_ACCESS_MODIFIERS;

//1. Create a class with variables using all four access modifiers.

public class Demo {

    public String publicVariable = "This is public access modifier";

    private String privateVariable = "This is private access modifier"; // private accessibale here

    protected String protectedVariable = "This is protected access modifier";

    String defaultVariable = "This is default access modifier";

    public String getPrivateVariable() { // public getter method to allo access private variable
        return privateVariable;
    }

    // this mehod show the all variable using all four access modifiers with in ther
    // own class
    public void DisplayVariable() {
        System.out.println("Inside access modifiers in calss : ");

        System.out.println("Public    :--->" + publicVariable);
        System.out.println("Private   :--->" + privateVariable);
        System.out.println("Protected :--->" + protectedVariable);
        System.out.println("Default   :--->" + defaultVariable);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.DisplayVariable();
    }
}
