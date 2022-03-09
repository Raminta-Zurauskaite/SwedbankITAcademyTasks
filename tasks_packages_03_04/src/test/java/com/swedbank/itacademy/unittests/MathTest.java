package com.swedbank.itacademy.unittests;

import org.junit.jupiter.api.*;

public class MathTest {
    @BeforeAll
    public static void setup() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void init() {
        System.out.println("After each");
    }

    @Test
    public void testSubtraction() {
        int left = 4;
        int right = 3;
        int actual = Math.subtractExact(left, right);

        //Assertions.assertEquals(2, actual);
        //Assertions.assertEquals(1, actual);
        //Assertions.assertEquals(2, actual);

        Assertions.assertAll("math",
                () -> Assertions.assertEquals(2, actual),
                () -> Assertions.assertEquals(1, actual),
                () -> Assertions.assertEquals(2, actual));
    }

    @Test
    public void catchThrowable() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Math.floorDiv(0,0);
        });
    }
}
