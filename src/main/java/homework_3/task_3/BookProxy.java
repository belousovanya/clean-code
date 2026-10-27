package homework_3.task_3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class BookProxy {
    private Book book;

    public BookProxy(Book book) {
        this.book = book;
    }

    public String getContent() {
        if (book.getContent() == null) {
            System.out.println("Загружаем содержание книги...");
            book.setContent("Текст книги...");
        }
        return book.getContent();
    }

    public Path download(Path destination) throws IOException {
        String content = getContent();
        Path parent = destination.toAbsolutePath().getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }
        return Files.writeString(destination, content, StandardCharsets.UTF_8);
    }
}
