public class RunApp {
    private static Book [] books;

    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Михаил", "Шолохов");

        Book book1 = new Book("Война и мир", author1, 2015);
        Book book2 = new Book("Поднятая целина", author2, 1956);

        System.out.println(book2.getBookPublicationYear());
        book2.setPublicationYear(2022);
        System.out.println(book2.getBookPublicationYear());

        // Домашняя, средний уровень
        books = new Book[10];
        books[0] = book1;
        books[1] = book2;

        Author author3 = new Author("Марк", "Твен");
        Book book3 = new Book("Приключения Тома Сойера", author3, 2016);
        addBook(book3);

        Author author4 = new Author("Василий", "Белов");
        Book book4 = new Book("Скворцы", author4, 2017);
        addBook(book4);

        System.out.println("\n================== Задача средний уровень ==================\n");
        printBooks();

        System.out.println("\n================== Задача сложный уровень ==================\n");
        Library library = new Library(10);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.printBooks();
        library.printBookByName("Война и мир");
        library.setPublicationYearByName("Война и мир", 2016);
        library.printBookByName("Война и мир");
    }

    public static void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public static void printBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.print(books[i].getBookAuthor().getAuthorName());
                System.out.print(" " + books[i].getBookAuthor().getAuthorSurname() + ":");
                System.out.print(" " + books[i].getBookPublicationYear());
                System.out.println();
            }
        }
    }
}
