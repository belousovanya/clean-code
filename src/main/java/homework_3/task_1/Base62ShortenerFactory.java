package homework_3.task_1;

public class Base62ShortenerFactory extends ShortenerFactory{
    @Override
    public ShorteningStrategy createStrategy() {
        return new Base62Strategy();
    }
}
