package unittests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ListMockTest {


    @Test
    public void WhenNotUsingMockAnnotation() {
        List<String> mockedList = mock(LinkedList.class);

        mockedList.add("one");

        verify(mockedList).add("one");
        Assertions.assertEquals(0, mockedList.size());
    }
}
