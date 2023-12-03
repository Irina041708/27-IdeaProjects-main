package lesson4.stab;

public class Calculator {
    private CurrencyConverter currencyConverter;

    public Calculator(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public double calculateTotalCost(double price, int quantity, String currency) {
        double totalCost = price * quantity;
        return currencyConverter.convert(totalCost, "USD", currency);
    }
}