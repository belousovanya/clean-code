package homework_2.task_3;

public class BicycleFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
