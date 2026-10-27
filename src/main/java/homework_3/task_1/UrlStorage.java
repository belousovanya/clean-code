package homework_3.task_1;

public interface UrlStorage {
    void save(String shortUrl, String longUrl);
    String getLongUrl(String shortUrl);
}
