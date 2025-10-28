package OOP_P1_DAY_3_ACCESS_MODIFIERS;

//2. Access those variables from another class in the same package.

public class Demo1 {

    public void tryaccessingVariable() {
    //Demo.java  me ka variable access kr rha hai

        Demo d = new Demo(); // jis class ka variable access karna hai us class ke nam se object banaya taki
                             // access mil sake

        System.out.println("----Accessing varibles in same package to another class variables----");

        System.out.println("Public variable    :---> " + d.publicVariable);
        System.out.println("Protected variable :---> " + d.protectedVariable);
        System.out.println("Default variable   :---> " + d.defaultVariable);
        System.out.println("Private variable   :---> " + d.getPrivateVariable()); // private variable access throught getter
                                                                             // method
    }

    public static void main(String[] args) {

        Demo1 d1 = new Demo1();

        d1.tryaccessingVariable();                      //  shortcut use like this  ---->  new Demo1().tryaccessingVariable();
    }

}
