package homework_3.task_1;

import java.util.UUID;

public class UuidStrategy implements ShorteningStrategy {
    @Override
    public String shorten(String longUrl) {
        String randomId = UUID.randomUUID().toString();
        return randomId.substring(0, 8);
    }
}
