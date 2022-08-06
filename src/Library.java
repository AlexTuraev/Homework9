public class Library {
    private Book [] books;

    public Library(int size){
        books = new Book[size];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public  void printBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.print(books[i].getBookAuthor().getAuthorName());
                System.out.print(" " + books[i].getBookAuthor().getAuthorSurname() + ":");
                System.out.print(" " + books[i].getBookPublicationYear());
                System.out.println();
            }
        }
    }

    public void printBookByName(String name) {
        for (Book book : books) {
            if (book != null && book.getBookName() == name) {
                System.out.println("The stand by " + book.getBookAuthor().getAuthorName() + " " + book.getBookAuthor().getAuthorSurname() +
                        " was published in " + book.getBookPublicationYear());
                break;
            }
        }
    }

    public void setPublicationYearByName(String name, int newYear){
        for (Book book : books) {
            if (book != null && book.getBookName() == name) {
                book.setPublicationYear(newYear);
                break;
            }
        }
    }
}
