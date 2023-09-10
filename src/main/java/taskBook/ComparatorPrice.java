package taskBook;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<Book> {
    public int compare(Book a, Book b) {
        return a.getPrice() - b.getPrice();
    }
}
