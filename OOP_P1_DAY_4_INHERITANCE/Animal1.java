package OOP_P1_DAY_4_INHERITANCE;

//2. Add methods like `sound()` in both classes.

class Animal1 {

    void eat() {
        System.out.println("The Animal is eating");
    }
    // sound method
    void sound() {
        System.out.println("Animal Make a Sound");
    }

    public static void main(String[] args) {
        Dog a = new Dog();

        a.eat();
        a.sound();

    }
}

class Dog extends Animal1 {

    void eat() {
        System.out.println("The Dog was eating");
    }
// sound method
    void sound() {
        System.out.println("dog sound 'Woof'  ");
    }

}
