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
        try {

            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Hello....");
    }
}