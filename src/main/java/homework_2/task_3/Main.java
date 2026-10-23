package homework_2.task_3;

public class Main {
    public static void main(String[] args) {
        TransportFactory bicycleFactory = new BicycleFactory();
        TransportFactory carFactory = new CarFactory();

        Transport car = carFactory.createTransport();
        Transport bicycle = bicycleFactory.createTransport();

        car.move();
        bicycle.move();

        System.out.println(car instanceof Car);
        System.out.println(bicycle instanceof Bicycle);
    }
}
