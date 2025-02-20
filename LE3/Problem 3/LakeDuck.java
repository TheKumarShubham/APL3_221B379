public class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}