package lesson4.stab;

public class CurrencyConverterStub implements CurrencyConverter {
    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        // Фиксированное значение для тестирования
        return 50.0; // Пусть всегда будет 50.0, например
    }
}
