package OOP_P2_DAY_8_INTERFACES;
//6. Interface `Playable` with method `play()`, implemented by `Guitar` and `Piano`

interface Playable{
    void play();
}

class Guitar implements Playable{
    public void play(){
        System.out.println("Guitar sound playing.........");
    }
}

class Piano implements Playable{
    public void play(){
        System.out.println("Piano sound Playing.........");
    }
}
public class MainPlayble {
    public static void main(String[] args) {
        
        Playable g = new Guitar();
        Playable p = new Piano();
        
        g.play();
        p.play();
        
    }
}
