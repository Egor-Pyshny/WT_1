package taskBook;

import java.util.Comparator;

public class ComparatorTitle implements Comparator<Book> {
    public int compare(Book a, Book b){
        return a.getTitle().toLowerCase().compareTo(b.getTitle().toLowerCase());
    }
}
