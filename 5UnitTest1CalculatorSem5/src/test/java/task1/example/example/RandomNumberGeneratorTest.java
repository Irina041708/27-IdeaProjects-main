package task1.example.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static task1.example.RandomNumberGenerator.generateRandomNumbers;

import java.util.List;

class RandomNumberGeneratorTest {

    List<Integer> integerList;

    @BeforeEach
    void setUp() {
        integerList = generateRandomNumbers(3);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void generateRandomNumbersTest() {
//        integerList.add(101);
        for (int number : integerList){
            assertTrue(number>=1 && number<=100);
        }
    }
}