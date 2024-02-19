package org.tp.Activity1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testConstructor() {
        Person person = new Person("Amine", "Beghdad", 21);
        assertEquals("Amine", person.firstName);
        assertEquals("Beghdad", person.lastName);
        assertEquals(21, person.age);
    }

    @Test
    public void testGetFullName() {
        Person person = new Person("Amine", "Beghdad", 30);
        assertEquals("Amine Beghdad", person.getFullName());
    }

    @Test
    public void testIsAdult() {
        Person adult = new Person("Adult", "Person", 21);
        Person minor = new Person("Minor", "Person", 15);

        assertTrue(adult.isAdult());
        assertFalse(minor.isAdult());
    }
}
