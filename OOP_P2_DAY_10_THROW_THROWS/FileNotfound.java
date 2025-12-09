package OOP_P2_DAY_10_THROW_THROWS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//3. Handle `FileNotFoundException` (checked).

class Test {
    void readFile() throws FileNotFoundException {                         
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }

    void SaveFile() throws FileNotFoundException {
        String text = "this is demo";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}

class FileNotfound {
    public static void main(String[] args) {
        Test rw = new Test();
        // here try and catch used becused jvm exception default exception hnadler la pass karavi
        // tay mule program abnormal terminate kela jato tay mule hikde mi throws keyword cha jagi mi try and catch used kele ahe
        try {

            rw.readFile();                           
        } catch (FileNotFoundException e) {             // handling exception (FileNotFoundException)
            e.printStackTrace();                            
        }
        System.out.println("Hello....");
    }
}