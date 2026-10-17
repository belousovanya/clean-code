package homework_1.task_5;

public class PaymentProcessor {
    // Нарушение OCP (Open/Closed Principle)
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Оплата кредитной картой на сумму " + amount);
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Оплата через PayPal на сумму " + amount);
        } else if (paymentType.equals("Bitcoin")) {
            System.out.println("Оплата Bitcoin на сумму " + amount);
        }
    }
}
