package org.example;


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return dividend / divisor;
    }

    // Допустим, у вас есть и другие методы калькулятора
//    Задание 1. ** В классе Calculator создайте метод calculateDiscount,
//    который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача -
//    проверить этот метод с использованием библиотеки AssertJ.
//    Если метод calculateDiscount получает недопустимые аргументы, он должен
//    выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

    public double  calculateDiscount(double amount, double discount ) {
        if (amount < 0) {
            throw new ArithmeticException("amount не может быть отрицательной");
        }
        double res = amount - ((amount * discount) / 100);
        return res;
    }
}


