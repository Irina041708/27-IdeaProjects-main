package task1.example.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static task1.example.MaxNumberFinder.findMaxNumber;
import static task1.example.RandomNumberGenerator.generateRandomNumbers;

class MaxNumberFinderTest {
    //создаем ссылку класса MaxNumberFinderTest
//    MaxNumberFinderTest maxNumberFinderTest;
    List<Integer> arrayList;

    @BeforeEach
        //создаем объект  класса MaxNumberFinderTest
    void setUp() {
//        maxNumberFinderTest = new maxNumberFinderTest(); тк метод static
//        arrayList = generateRandomNumbers(10);

        arrayList = Arrays.asList(29, 1, 5);
    }

    @AfterEach
    void tearDown() {

        arrayList = null;
    }

    @Test
    void findMaxNumberTest() {

        assertEquals(2, findMaxNumber(arrayList));
    }
}