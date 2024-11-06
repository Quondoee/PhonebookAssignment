package Phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PhonebookTest {

    private Phonebook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new Phonebook();
    }

    @Test
    public void testAddAll() {
        phoneBook.addAll("Dayquon Kelley", "123-4567", "987-6543", "555-0000");

        List<String> phoneNumbers = phoneBook.lookup("Dayquon Kelley");

        assertEquals(3, phoneNumbers.size());

        assertTrue(phoneNumbers.contains("123-4567"));
        assertTrue(phoneNumbers.contains("987-6543"));
        assertTrue(phoneNumbers.contains("555-0000"));
    }

    @Test
    public void testRemove() {
        phoneBook.add("Dayquon Kelley", "555-1234");

        assertTrue(phoneBook.hasEntry("Dayquon Kelley"));

        phoneBook.remove("Dayquon Kelley");

        assertFalse(phoneBook.hasEntry("Dayquon Kelley"));

        assertTrue(phoneBook.lookup("Dayquon Kelley").isEmpty());
    }

    @Test
    public void testReverseLookup() {

        phoneBook.add("Johnny", "123-1111");
        phoneBook.add("Ricky", "123-2222");

        String name = phoneBook.reverseLookup("123-1111");
        assertEquals("Johnny", name);

        name = phoneBook.reverseLookup("123-2222");
        assertEquals("Ricky", name);

        name = phoneBook.reverseLookup("999-9999");
        assertNull(name);
    }
}