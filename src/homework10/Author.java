package homework10;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getAuthorName() {
        return name;
    }

    public String getAuthorSurname() {
        return surname;
    }

    public String toString() {
        return getAuthorName() + " " + getAuthorSurname();
    }

    public boolean equals(Author author) {
        return (this.getAuthorName() == author.getAuthorName() && this.getAuthorSurname() == author.getAuthorSurname());
    }

    public int hashCode() {
        return Objects.hash(getAuthorName(), getAuthorSurname());
    }
}

