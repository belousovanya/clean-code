package homework_2.task_12;

public class Conditioner implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Кондиционер включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Кондиционер выключен");
    }
}