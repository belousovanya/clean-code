package homework_3.task_3;

public class Book {
    private String title;
    private String author;
    private String description;
    private String content;

    public Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.description = builder.description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private String description;


        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
