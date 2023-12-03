import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNumberTest {
    ArrayNumber arrayNumber;

    @BeforeEach
    void setUp() {
        arrayNumber = new ArrayNumber();
    }

    @AfterEach
    void tearDown() {
        arrayNumber = null;
    }


    @Test
    @DisplayName("Проверка правильности сравнения средних значений")
    void averageListTest() {
        List<Double> doubleList1 = Arrays.asList(2.0, 2.0, 2.0);
        assertEquals(2.0, arrayNumber.avgArray(doubleList1));
    }

    @Test
    @DisplayName("Средние значения равны")
    void compareEqualityAvgTest() {

        List<Double> referenceList = Arrays.asList(2.0, 2.0, 2.0);
        assertEquals("Средние значения равны",
                arrayNumber.compareArray(referenceList, referenceList));
    }
    @Test
    @DisplayName("Большее среднее значение в первом списке")
    void compareGreatAvgArray1Test() {
        List<Double> referenceList = Arrays.asList(2.0, 2.0, 2.0);
        List<Double> doubleList1 = Arrays.asList(2.0, 2.0, 6.0);
        assertEquals("Большее среднее значение в первом списке",
                arrayNumber.compareArray(doubleList1,referenceList));
    }

    @Test
    @DisplayName("Большее среднее значение во втором списке")
    void compareGreatAvgArray2Test() {
        List<Double> referenceList = Arrays.asList(2.0, 2.0, 2.0);
        List<Double> doubleList2 = Arrays.asList(2.0, 2.0, 8.0);
        assertEquals("Большее среднее значение во втором списке",
                arrayNumber.compareArray(referenceList, doubleList2));
    }
}
