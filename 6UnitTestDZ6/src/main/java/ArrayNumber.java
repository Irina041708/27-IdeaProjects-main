import java.util.List;

public class ArrayNumber {
    public double avgArray(List<Double> array) {
        double summa = 0;
        for (int i = 0; i < array.size(); i++) {
            summa = summa + array.get(i);
        }
        return summa / array.size();
    }

    public String compareArray(List<Double> array1, List<Double> array2) {
        double avgArray1 = avgArray(array1);
        double avgArray2 = avgArray(array2);

        if (avgArray1 > avgArray2) return "Большее среднее значение в первом списке";
        else if (avgArray1 < avgArray2) return "Большее среднее значение во втором списке";
        else return "Средние значения равны";
    }
}
