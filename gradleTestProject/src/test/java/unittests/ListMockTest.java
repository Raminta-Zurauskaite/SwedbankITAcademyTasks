package unittests;

import com.swedbank.itacademy.MyDictionary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ListMockTest {


    @Test
    public void WhenNotUsingMockAnnotation() {
        List<String> mockedList = mock(LinkedList.class);

        mockedList.add("one");

        verify(mockedList).add("one");
        assertEquals(0, mockedList.size());

        when(mockedList.size()).thenReturn(100).thenReturn(45);
        assertEquals(100, mockedList.size());
        assertEquals(45, mockedList.size());
    }

    @Mock
    private List<String> mockedList;

    @Test
    public void WhenUsingMockAnnotation(){

        mockedList.add("one");

        verify(mockedList).add("one");
        assertEquals(0, mockedList.size());

        when(mockedList.size()).thenReturn(100).thenReturn(45);
        assertEquals(100, mockedList.size());
        assertEquals(45, mockedList.size());
    }

    @Test
    public void WhenNotUsingArgumentCaptorAnnotation(){
        List<String> mockedList = mock(ArrayList.class);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        mockedList.add("one");
        mockedList.add("two");
        verify(mockedList, times(2)).add(argumentCaptor.capture());

        assertEquals("one", argumentCaptor.getAllValues().get(0));
        assertEquals("two", argumentCaptor.getAllValues().get(1));
    }

    @Mock
    List<String> mockedListAnnotation = mock(ArrayList.class);
    @Captor
    ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

    @Test
    public void WhenUsingArgumentCaptorAnnotation(){


        mockedListAnnotation.add("one");
        mockedListAnnotation.add("two");
        verify(mockedListAnnotation, times(2)).add(argumentCaptor.capture());

        assertEquals("one", argumentCaptor.getAllValues().get(0));
        assertEquals("two", argumentCaptor.getAllValues().get(1));
    }

    @Mock
    private Map<String, String> wordMap;

    @InjectMocks
    private MyDictionary dictionary;

    @Test
    private void injectMocks(){
        when(wordMap.get(any(String.class))).thenReturn("aMeaning");
        //when(wordMap.get("aWord")).thenReturn("aMeaning");

        assertEquals("aMeaning", dictionary.getMeaning("aWord"));
    }


}
