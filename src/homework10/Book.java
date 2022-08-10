package homework10;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return name;
    }

    public Author getBookAuthor() {
        return author;
    }

    public int getBookPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return("Книга: " + getBookName() + ". Автор: " + getBookAuthor().getAuthorName() + " " + getBookAuthor().getAuthorSurname() +
                ", год издания: " + getBookPublicationYear());
    }

    public boolean equals(Book book) {
        return (this.getBookName() == book.getBookName() && this.getBookPublicationYear() == book.getBookPublicationYear() &&
                this.getBookAuthor().equals(book.getBookAuthor())
        );
    }

    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthor(), getBookPublicationYear());
    }
}
