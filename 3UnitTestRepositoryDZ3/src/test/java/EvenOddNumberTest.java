import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class EvenOddNumberTest {
    EvenOddNumber number;
    @BeforeEach
    void setUp() {
        number = new EvenOddNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Проверка на чётность")
    void evenOddNumber() {
            assertTrue(number.evenOddNumber(4));
    }
}