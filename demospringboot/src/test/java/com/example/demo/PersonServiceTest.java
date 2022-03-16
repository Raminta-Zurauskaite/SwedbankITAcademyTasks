package com.example.demo;


import com.example.demo.model.domain.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import com.example.demo.util.BarFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository repositoryMock;

    @Mock
    private BarFormatter barFormatter;

    @InjectMocks
    private PersonService service;

    @Test
    public void When_FirstNamePresent_Expect_PersonsMatchingFirstName() {
        Person expected = Person.builder()
                .firstName("name").build();
        Mockito.when(repositoryMock.findAllByFirstName("name")).thenReturn(List.of(expected));
        List<Person> actual = service.fetchPersons("name", null);

        assertEquals(expected.getFirstName(), actual.get(0).getFirstName());
    }
}
