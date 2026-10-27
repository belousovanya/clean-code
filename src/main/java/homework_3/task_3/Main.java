package homework_3.task_3;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Book book = new Book.BookBuilder()
                .setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setDescription("A historical novel")
                .build();

        Book anotherBook = new Book.BookBuilder()
                .setTitle("The Captain's Daughter")
                .setAuthor("Alexander Pushkin")
                .setDescription("A historical novel")
                .build();

        BookCatalog catalog = new BookCatalog();
        catalog.addBook(book);
        catalog.addBook(anotherBook);

        System.out.println("Каталог книг:");
        for (Book catalogBook : catalog.getBooks()) {
            System.out.println(catalogBook);
        }

        Book selectedBook = catalog.getBooks().get(0);
        BookProxy proxy = new BookProxy(selectedBook);

        System.out.println("До загрузки: " + selectedBook.getContent());

        String content = proxy.getContent();
        System.out.println("Содержание: " + content);

        System.out.println("Повторно: " + proxy.getContent());

        Path destination = args.length > 0
                ? Path.of(args[0])
                : Path.of("offline-books", "war-and-peace.txt");
        Path downloadedBook = proxy.download(destination);
        System.out.println("Книга сохранена для офлайн-чтения: " + downloadedBook.toAbsolutePath());
    }
}
