package OOP_P1_DAY_4_INHERITANCE;

//9. Demonstrate multilevel inheritance.

public class Birds {

    void parrot() {
        System.out.println("The parrot sound is  'Squawk..........'");
    }

    public static void main(String[] args){
        
        Peacock p = new Peacock();
        p.Scream();
        p.Screech();
        p.parrot();
    }
}

  class Eagle extends Birds{
     
    void Screech(){

        System.out.println("The Eagle sound is  'Screech...........'");
    }
}

class Peacock extends Eagle{
    
    void Scream(){
        System.out.println("The Peacock sound is  'Scream..........'");
    }
}
