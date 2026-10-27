package homework_3.task_1;

public class UrlShortenerService {
    private final ShorteningStrategy strategy;
    private final UrlStorage storage;

    public UrlShortenerService(ShortenerFactory factory) {
        this.strategy = factory.createStrategy();
        this.storage = InMemoryUrlStorage.getInstance();
    }

    public String shortenUrl(String longUrl) {
        String shortUrl;

        do {
            String code = strategy.shorten(longUrl);
            shortUrl = "https://short.example/" + code;
        } while (storage.getLongUrl(shortUrl) != null);

        storage.save(shortUrl, longUrl);

        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        return storage.getLongUrl(shortUrl);
    }
}
