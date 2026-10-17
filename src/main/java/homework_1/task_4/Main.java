package homework_1.task_4;

public class Main {
    public static void main(String[] args) {
        OrderWithSRP order = new OrderWithSRP();
        EmailSender emailSender = new EmailSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        order.processOrder();
        emailSender.sendEmailConfirmation();
        invoiceGenerator.generateInvoice();
    }
}
