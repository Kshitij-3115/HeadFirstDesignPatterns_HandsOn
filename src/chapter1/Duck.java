package chapter1;

public class Duck {
    /*
     *  It's the super class in the SimUDuckGame.
     *  - Initial Duck implementation:
     *      - From this super class all other duck types subclasses inherit
     *      - It have basic methods :
     *          1. quack()  --> implemented in Duck
     *          2. swim()   --> implemented in Duck
     *          3. display()    --> duck specific implementation in subclasses
     *      -
     */

    public void quack() {
        System.out.println("I am Quacking...");
    }

    public void swim() {
        System.out.println("I am Swimming...");
    }

    public void display() {
        // do nothing
    };
}
