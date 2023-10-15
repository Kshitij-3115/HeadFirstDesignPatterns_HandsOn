package chapter1;

public class WoodenDuck extends Duck{

    @Override
    public void display() {
        System.out.println("WoodenDuck Display: I am WoodenDuck...");
    }

    @Override
    public void quack() {
        System.out.println("WoodenDuck Quack: I cannot quack");
    }
}
