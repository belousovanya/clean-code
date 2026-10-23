package homework_2.task_7;

public class Shop {
    public static void main(String[] args) {
        Order order1 = new Order.OrderBuilder()
                .setItem("Куртка")
                .setSale(10)
                .setPaymentMethod("Card")
                .build();

        Order order2 = new Order.OrderBuilder()
                .setItem("Перчатки")
                .setSale(5)
                .setPaymentMethod("Cash")
                .build();

        System.out.println(order1);
        System.out.println(order2);
    }
}
