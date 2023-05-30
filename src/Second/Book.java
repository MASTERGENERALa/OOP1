package Second;

public class Book {
        private Title title;
        private Author author;
        private Content content;

        public Book() {
            this.title = new Title();
            this.author = new Author();
            this.content = new Content();
        }

        public void setTitle(String title) {
            this.title.setTitle(title);
        }

        public void setAuthor(String author) {
            this.author.setAuthor(author);
        }

        public void setContent(String content) {
            this.content.setContent(content);
        }

        public void show() {
            title.show();
            author.show();
            content.show();
        }

        public static void main(String[] args) {
            Book book = new Book();
            book.setTitle("Назва книги");
            book.setAuthor("Ім'я автора");
            book.setContent("Зміст книги");
            book.show();
        }
    }

