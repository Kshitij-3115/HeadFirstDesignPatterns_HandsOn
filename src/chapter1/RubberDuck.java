package chapter1;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("RubberDuck Display: I am RubberDuck...");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck Quack: I cannot quack, I can squeak");
    }
}
