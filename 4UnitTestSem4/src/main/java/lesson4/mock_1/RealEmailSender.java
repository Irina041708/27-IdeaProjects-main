package lesson4.mock_1;

public class RealEmailSender implements EmailSender {
    @Override
    public void sendEmail(String to, String subject, String body) {
        // Реальная логика отправки электронного письма
        System.out.println("Отправляется письмо на " + to + " с темой '" + subject + "' и текстом: " + body);
    }
}