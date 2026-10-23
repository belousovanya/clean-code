package homework_2.task_12;

public class SecuritySystem implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Система безопасности включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Система безопасности выключена");
    }
}