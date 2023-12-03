public class ContactBookTest {


    ContactBook contactBook;
    Contact contact1;

    @Mock
    Contact contact;
    ContactBook contactBookMock;

    @BeforeEach
    void setUp() {
        contactBook = new ContactBook();
        contact1 = new Contact("John Doe", "john@example.com", "1234567890");
        contactBook.addContact(contact1);

        contact = mock(Contact.class);
        contactBookMock = mock(ContactBook.class);
    }

    @AfterEach
    void tearDown() {
        contactBook = null;
        contact1 = null;
        contactBookMock = null;
    }

    @Test
    @DisplayName("Проверка функции добавления контакта")
    public void testAddContact() {
        assertEquals(contact1, contactBook.getContact("John Doe"));
    }

    @Test
    @DisplayName("Проверка функции изменения имени")
    public void testEditContact() {
        contactBook.editNameContact(contact1, "Jane Doe");
        assertEquals(contact1.getName(), contactBook.getContact("Jane Doe").getName());
    }

    @DisplayName("Проверка получения контакта по имени")
    @Test
    void testGetContact() {
        assertEquals(contact1, contactBook.getContact("John Doe"));
    }

}
