import org.junit.jupiter.api.Test;
import ru.nikolai.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {

    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Name", 896004644);
    }

    @Test
    public void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Name", 896004644);
        assertTrue(phoneBook.findByNumber(896004644).equals("Name"));
        assertTrue(phoneBook.findByNumber(89644644)==null);
    }
}
