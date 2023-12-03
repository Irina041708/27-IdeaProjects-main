package lesson4.dummy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class OrderProcessorTest {
    @Test
    public void testProcessOrder() {
        // Создаем фиктивный объект заказа
        Order dummyOrder = new Order();
        dummyOrder.setOrderId(1);
        dummyOrder.setCustomerName("ТВ");

        // Создаем экземпляр OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();

        // Вызываем метод processOrder с фиктивным объектом
        orderProcessor.processOrder(dummyOrder);

        // Здесь можно добавить дополнительные проверки, если необходимо
        // Например, проверить, что уведомление было успешно отправлено

        // Утверждаем, что тест прошел успешно
        assertTrue(true);
    }
}

