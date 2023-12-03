package task1.example.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class RandomNumberGeneratorTest {

    List<Integer> integerList;

    @BeforeEach
    void setUp() {
        integerList = generateRandomNumbers(10);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void generateRandomNumbers() {
        for (int number : integerList){
            assertTrue(number>=1 && number<=100);
        }
    }
}