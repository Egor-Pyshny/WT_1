package taskBook;

import java.util.Comparator;

public class ComparatorAuthor implements Comparator<Book> {
    public int compare(Book a, Book b) {
        return a.getAuthor().toLowerCase().compareTo(b.getAuthor().toLowerCase());
    }
}
