package practice_2.creational.fabricmethod.after;

/**
 * Класс для управления логистикой доставок
 */
public abstract class Logistics {
    // фабричным методом
    // метод реализует способ создания транспорта
    abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
