package task15;

import taskBook.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BookTest {

    @Test
    @DisplayName("Check sort by isbn")
    public void bookTest(){
        int[] isbns = new int[]{10,9,8,1,8,5,3};
        Book book = new Book("Title1","Author1",10,5);
        Book[] books = new Book[isbns.length];
        int i=0;
        for(int isbn : isbns){
            Book temp = book.clone();
            temp.setIsbn(isbn);
            books[i] = temp;
            i++;
        }
        int[] res = new int[isbns.length];
        i=0;
        Arrays.sort(books);
        for(Book temp : books){
            res[i] = temp.getIsbn();
            i++;
        }
        Arrays.sort(isbns);
        assertArrayEquals(isbns, res);
    }
}
