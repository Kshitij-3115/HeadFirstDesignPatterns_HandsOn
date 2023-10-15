package chapter1;

public class DuckGame {
    /*  This is the DuckGame class that actually creates required instances and perform some activities.
     *
     *
     */

    public void run() {
        // 4 ducks we have
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();

        // perform some actions for mallard duck
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        putLineBreaker();

        // perform some actions for red head duck
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.swim();
        putLineBreaker();

        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        putLineBreaker();

        woodenDuck.display();
        woodenDuck.quack();
        woodenDuck.swim();
        putLineBreaker();

    }

    private void putLineBreaker() {
        System.out.println("--------------------------------------------------------------");
    }

}
