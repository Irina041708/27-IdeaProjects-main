package lesson4.dummy;

public class Order {
    private int orderId;
    private String customerName;

    public int getOrderId() {
        return orderId;
    }

    // Конструктор, геттеры и сеттеры

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    // Сеттер для customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Геттеры для полей, если необходимо

    public String getCustomerName() {
        return customerName;
    }
}

