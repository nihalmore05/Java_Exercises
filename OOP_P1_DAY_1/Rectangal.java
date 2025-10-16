package OOP_P1_DAY_1;

//.6. Create a `Rectangle` class with methods for area and perimeter.

public class Rectangal {
    // instance variable sets
    double length;
    double width;

    // constructor used
     void setValue(double l, double w){

        this.length = l;
        this.width  = w;
        
     }
      
     // This is The Area Method
      double AreaofRectangle(){
        
        return length * width;
        
        }
     // This is The Perimeter Method
     double Perimeter(){
        return 2 * (length + width);
     }

     // void method

     void display(){
        System.out.println("Length    :" + length);
        System.out.println("Width     :" + width);
        System.out.println("Area      :" + AreaofRectangle());
        System.out.println("Perimeter :" + Perimeter());
     }
    
    public static void main(String[] args){
        
        Rectangal r1 = new Rectangal();        // creating objects

        r1.setValue(10, 5);               // set the value 
        r1.display();                         // call display method
        
    }
}
