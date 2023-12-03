package task1.example.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {

    List<Integer> arrayList;

    @BeforeEach
    void setUp() {
        arrayList = Arrays.asList(29,1,5);
    }

    @AfterEach
    void tearDown() {
        arrayList = null;
    }

    @Test
    void findMaxNumber() {
        assertEquals(29,findMaxNumber(arrayList), "Логика не работает");
    }
}