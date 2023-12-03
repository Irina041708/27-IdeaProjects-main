package lesson4.mock_1;

import lesson4.mock.EmailSender;

public class EmailService {
    private lesson4.mock.EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendWelcomeEmail(String recipient) {
        // Логика отправки приветственного письма
        emailSender.sendEmail(recipient, "Добро пожаловать", "Добро пожаловать на наш сайт!");
    }
}