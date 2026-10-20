package practice_2.creational.fabricmethod.before;

public class Main {
    public static void main(String[] args) {
        Transport transport;
        String transportType = "ship"; // Тип может быть основан на входных данных или конфигурации

        // код был открыт к расширению и закрыт к модификации
        if ("truck".equals(transportType)) {
            transport = new Truck(); // захардкожено
        } else if ("ship".equals("transportType")) {
            transport = new Ship(); // захардкожено
        } else {
            transport = new Plane(); // захардкожено
        }

        transport.deliver();
    }
}
