package homework_1.task_5;

public class PaymentProcessorWithOCP {
    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}