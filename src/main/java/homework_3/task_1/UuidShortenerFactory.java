package homework_3.task_1;

public class UuidShortenerFactory extends ShortenerFactory {
    @Override
    public ShorteningStrategy createStrategy() {
        return new UuidStrategy();
    }
}
