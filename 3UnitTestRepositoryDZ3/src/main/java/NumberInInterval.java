
// HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
// покрыть тестами метод на 100%

public class NumberInInterval {
    public boolean numberInInterval(int n) {
        if (n >= 25 && n <= 100) {
            return true;
        } else {
            return false;
        }
    }
}

