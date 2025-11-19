//6. Abstract `Game` with `play()`; implement `Cricket`, `Football`.
//7. Demonstrate abstract + concrete method in same class.

//abstract class
abstract class Game{
    abstract void play();            // abstract method

    void Tyepse(){
        System.out.println("The Game is Famous in people..........");
    }
}

class Cricket extends Game{               // sub class Cricket extends Game Class

    void play(){                                    
        System.out.println("Playing Cricket...........");   
    }
}

class Football extends Game{              // sub class Football extends Game Class

    void play(){
        System.out.println("Playing Football...........");
    }
}


// main class
public class MainGame {
    public static void main(String[] args) {
        //  upcasting 
       
       Game g1 = new Cricket();                    
       Game g2 = new Football();
       
       g1.play();
       g2.play();
       g1.Tyepse();
    }
}
