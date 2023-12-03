import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository bookRepositoryMock;
    BookService bookService;

    @BeforeEach
    void setUp() {
        // Создаем мок(дубликат) BookRepository с помощью Mockito
        bookRepositoryMock = mock(BookRepository.class);
        // Создаем экземпляр bookService с моком
        bookService = new BookService(bookRepositoryMock);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Проверка получить книгу по id")
    void findBookByIdTest() {

        String bookId = "1";
        Book expectedBook = new Book("1", "Book1", "Author1");
        // Установка поведения мок-объекта при вызове метода findById
        when(bookRepositoryMock.findById(bookId)).thenAnswer(x -> expectedBook);

        // Вызываем метод findBookById
        Book resultBook = bookService.findBookById(bookId);

        // Проверяем, что метод findById был вызван с ожидаемыми параметрами
        verify(bookRepositoryMock).findById(bookId);
        assertEquals(expectedBook, resultBook);

    }

    @Test
    @DisplayName("Не знаю как, а списывать не хочу:(((")
    void findAllBooksTest() {
    }
}