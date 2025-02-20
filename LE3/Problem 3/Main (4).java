public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        System.out.println();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.swim();

        System.out.println();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();

        System.out.println();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.performFly();
        lakeDuck.performQuack();
        lakeDuck.swim();
    }
}