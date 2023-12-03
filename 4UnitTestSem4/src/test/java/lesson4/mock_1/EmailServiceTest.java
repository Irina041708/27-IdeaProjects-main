package lesson4.mock_1;
// Тест EmailServiceTest.java
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class EmailServiceTest {

    @Test
    public void testSendWelcomeEmailWithMock() {
        // Создаем мок(дубликат) EmailSender с помощью Mockito
        EmailSender emailSender = mock(EmailSender.class);

        // Создаем экземпляр EmailService с моком
        EmailService emailService = new EmailService((lesson4.mock.EmailSender) emailSender);

        // Вызываем метод sendWelcomeEmail
        emailService.sendWelcomeEmail("user@example.com");

        // Проверяем, что метод sendEmail был вызван с правильными аргументами
        verify(emailSender).sendEmail("user@example.com", "Добро пожаловать", "Добро пожаловать на наш сайт!");
    }
}