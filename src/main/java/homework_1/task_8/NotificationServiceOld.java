package homework_1.task_8;

public class NotificationServiceOld {
    private EmailSenderOld emailSender = new EmailSenderOld();
    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}