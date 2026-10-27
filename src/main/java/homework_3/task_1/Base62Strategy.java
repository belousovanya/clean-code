package homework_3.task_1;

public class Base62Strategy implements ShorteningStrategy {
    private static final String ALPHABET =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private long counter = 1;

    @Override
    public String shorten(String longUrl) {
        long number = counter++;
        StringBuilder result = new StringBuilder();

        do {
            int index = (int) (number % 62);
            result.append(ALPHABET.charAt(index));
            number = number / 62;
        } while (number > 0);

        return "b" + result.reverse();
    }
}
