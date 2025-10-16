package OOP_P1_DAY_1;

//3. Use `this` keyword to differentiate instance and local variables.
public class Car3_this {
    //Instance variable

    String brand;
    String model;
    int   year;

    //Constructor
   
    Car3_this(String b, String m, int y){
        
        // Use This Keyword

        this.brand = b;
        this.model = m;
        this.year  = y;
    }

    void Show(){
        System.out.println("Brand: " +brand+ " Model: " +model+ " Year of manifacturing: " +year);
    }



    public static void main(String[] args) {
        Car3_this c1 = new Car3_this(" BMW  ||  ", " 1 Series ||  ", 2013);
        Car3_this c2 = new Car3_this(" AUDI ||  ", " A4       ||  ", 2023);

        c1.Show();
        System.out.println("------------------------------------------------------------------");
        c2.Show();
        System.out.println("------------------------------------------------------------------");
    }
}
