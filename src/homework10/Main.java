package homework10;

public class Main {
    public static void main(String[] args){
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Пушкин");
        Author author3 = new Author("Лев", "Толстой");
        System.out.println(author1);
        System.out.println(author1.equals(author2));
        System.out.println(author1.equals(author3));

        Book book1 = new Book("Повести Белкина", author1, 1985);
        Book book2 = new Book("Повести Белкина", author1, 1985);
        System.out.println(book1);
        System.out.println(book1.equals(book2));

        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("book1.hashCode() = " + book1.hashCode());
    }
}
