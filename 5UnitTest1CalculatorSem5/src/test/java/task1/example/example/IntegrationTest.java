//package task1.example.example;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static task1.example.RandomNumberGenerator.generateRandomNumbers;
//
//class IntegrationTest {
//    List<Integer> integerList;
//
//    @BeforeEach
//    void setUp() {
//        integerList = generateRandomNumbers(10);
//    }
//
//    @Test
//    void maxNumberFinderInRandomArray() {
//        System.out.println(integerList.toString());
//        int tempNum = Integer.MIN_VALUE;//минимальное число-точка отсчета для цикла
//        for (int i : integerList) {
//            if (tempNum < i) {
//                tempNum = i;
//            }
//        }
//    }
//}