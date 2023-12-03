import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class NumberInIntervalTest {
    NumberInInterval numberInInterval;
    @BeforeEach
    void setUp() {
        numberInInterval = new NumberInInterval();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Проверка,входит ли число в диапазон  от 25 до 100")
    void numberInInterval() {
        assertTrue(numberInInterval.numberInInterval(25));
    }
}
