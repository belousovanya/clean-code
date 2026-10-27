package homework_2.task_12;

public class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Свет включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Свет выключен");
    }
}
