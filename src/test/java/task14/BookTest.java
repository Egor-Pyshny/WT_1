package task14;

import taskBook.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    @DisplayName("Check clone()")
    public void bookTest(){
        Book book1 = new Book("Title1","Author1",10, 0);
        Book copy = book1.clone();
        assertEquals(book1, copy);
    }
}
