package homework_3.task_1;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUrlStorage implements UrlStorage {
    private final Map<String, String> urls = new HashMap<>();
    private static InMemoryUrlStorage inMemoryUrlStorage;

    private InMemoryUrlStorage() {
    }

    public static InMemoryUrlStorage getInstance() {
        if (inMemoryUrlStorage == null) {
            inMemoryUrlStorage = new InMemoryUrlStorage();
        }
        return inMemoryUrlStorage;
    }

    @Override
    public void save(String shortUrl, String longUrl) {
        urls.put(shortUrl, longUrl);
    }

    @Override
    public String getLongUrl(String shortUrl) {
        return urls.get(shortUrl);
    }
}
