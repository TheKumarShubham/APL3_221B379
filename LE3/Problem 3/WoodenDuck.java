public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}