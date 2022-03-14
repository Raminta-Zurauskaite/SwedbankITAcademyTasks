package unittests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
