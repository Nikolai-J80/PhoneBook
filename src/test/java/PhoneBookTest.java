import org.junit.jupiter.api.Test;
import ru.nikolai.PhoneBook;

public class PhoneBookTest {

    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Name", 896004644);
    }
}
