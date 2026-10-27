package homework_3.task_1;

public class Main {
    public static void main(String[] args) {
        ShortenerFactory base62ShortenerFactory = new Base62ShortenerFactory();
        ShortenerFactory uuidShortenerFactory = new UuidShortenerFactory();

        UrlShortenerService base62ShortenerService = new UrlShortenerService(base62ShortenerFactory);
        UrlShortenerService uuidShortenerService = new UrlShortenerService(uuidShortenerFactory);

        String longUrl = "https://example.com/very/long/url";

        String uuidUrl = uuidShortenerService.shortenUrl(longUrl);
        String base62Url = base62ShortenerService.shortenUrl(longUrl);

        System.out.println("Short url UUID: " + uuidUrl);
        System.out.println("Short url Base62: " + base62Url);

        System.out.println("Long url UUID: " + uuidShortenerService.expandUrl(uuidUrl));
        System.out.println("Long url Base62: " + base62ShortenerService.expandUrl(base62Url));
    }
}
