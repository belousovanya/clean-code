package homework_3.task_3;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return List.copyOf(books);
    }
}
