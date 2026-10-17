package homework_1.task_5;

public class Main {
    public static void main(String[] args) {
        PaymentProcessorWithOCP paymentProcessor = new PaymentProcessorWithOCP();

        paymentProcessor.processPayment(new CreditCardPayment(), 1000);
        paymentProcessor.processPayment(new PayPalPayment(), 500);
        paymentProcessor.processPayment(new BitcoinPayment(), 200);
    }
}
