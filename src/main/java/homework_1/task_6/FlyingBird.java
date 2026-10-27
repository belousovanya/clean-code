package homework_1.task_6;

public class FlyingBird extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
