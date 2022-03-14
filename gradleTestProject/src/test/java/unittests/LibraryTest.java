package unittests;

import com.swedbank.itacademy.Book;
import com.swedbank.itacademy.Library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @Mock
    private List<Book> mockedBooks;

    @InjectMocks
    private Library library;


    @Test
    public void ShouldGetBooks() {
        when(mockedBooks.size()).thenReturn(1);
        when(mockedBooks.get(0)).thenReturn(new Book(5, "title"));

        assertEquals(1, library.getAllBooks().size());
        assertEquals(5, library.getAllBooks().get(0).pages());
        assertEquals("title", library.getAllBooks().get(0).title());
    }

    @Test
    public void ShouldGetBookNumber() {
        when(mockedBooks.size()).thenReturn(5);
        assertEquals(5, library.getNumberOfBooks());

        when(mockedBooks.size()).thenReturn(3);
        assertEquals(3, library.getNumberOfBooks());

        when(mockedBooks.size()).thenReturn(25);
        assertEquals(25, library.getNumberOfBooks());
    }

    @Test
    public void ShouldFindBookByTitle(){
        when(mockedBooks.size()).thenReturn(3);
        when(mockedBooks.get(0)).thenReturn(new Book(5, "newTitle"));
        when(mockedBooks.get(1)).thenReturn(new Book(4, "bible"));
        when(mockedBooks.get(2)).thenReturn(new Book(2, "test"));
        assertEquals("Book[pages=5, title=newTitle]", library.findBookByTitle("newTitle"));
        assertEquals("Book[pages=4, title=bible]", library.findBookByTitle("bible"));
        assertEquals("Book[pages=2, title=test]", library.findBookByTitle("test"));
    }

}
