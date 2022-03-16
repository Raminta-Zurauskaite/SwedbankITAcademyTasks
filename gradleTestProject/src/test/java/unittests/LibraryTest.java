package unittests;

import com.swedbank.itacademy.Book;
import com.swedbank.itacademy.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.spy;
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
        assertEquals(5, library.getAllBooks().get(0).getPages());
        assertEquals("title", library.getAllBooks().get(0).getTitle());
    }

    @Test
    public void ShouldGetBookNumber() {

        when(mockedBooks.size()).thenReturn(3);
        assertEquals(3, library.getNumberOfBooks());

        when(mockedBooks.size()).thenReturn(5);
        assertEquals(5, library.getNumberOfBooks());

        when(mockedBooks.size()).thenReturn(8);
        assertEquals(8, library.getNumberOfBooks());
    }

    @Test
    public void ShouldFindBookByTitle() {
        when(mockedBooks.size()).thenReturn(3);
        when(mockedBooks.get(0)).thenReturn(new Book(5, "newTitle"));
        when(mockedBooks.get(1)).thenReturn(new Book(4, "bible"));
        when(mockedBooks.get(2)).thenReturn(new Book(2, "test"));

        assertEquals("Book{pages=5, Title='newTitle'}", library.findBookByTitle("newTitle").toString());
        assertEquals("Book{pages=4, Title='bible'}", library.findBookByTitle("bible").toString());
        assertEquals("Book{pages=2, Title='test'}", library.findBookByTitle("test").toString());
    }

    @Test
    public void ShouldFindBookWithMostPages() {
        when(mockedBooks.get(0)).thenReturn(new Book(10, "mocks"));
        when(mockedBooks.get(1)).thenReturn(new Book(44, "mocks2"));
        when(mockedBooks.size()).thenReturn(2);
        Book actual = library.getBookWithMostPages();

        assertEquals("Book{pages=44, Title='mocks2'}", library.getBookWithMostPages().toString());
    }

    @Test
    public void ShouldFindBookWithMostPagesWhenLibraryIsEmpty(){
        when(mockedBooks.isEmpty()).thenReturn(true);
        assertThrows(RuntimeException.class, () -> library.getBookWithMostPages());
    }
}
