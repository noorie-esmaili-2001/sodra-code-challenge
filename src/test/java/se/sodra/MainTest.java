package se.sodra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testHasUniqueChars_UniqueCharacters() {
        String text = "Södra";
        assertTrue(Main.hasUniqueChars(text));
    }

    @Test
    public void testHasUniqueChars_DuplicateCharacters() {
        String text = "Södra Skogsägarna";
        assertFalse(Main.hasUniqueChars(text));
    }

    @Test
    public void testHasUniqueChars_EmptyString() {
        String text = "";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Main.hasUniqueChars(text));
        assertEquals("Text cannot be empty!", exception.getMessage());
    }

    @Test
    public void testHasUniqueChars_OnlySpaces() {
        String text = "     ";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Main.hasUniqueChars(text));
        assertEquals("Text cannot be empty!", exception.getMessage());
    }

    @Test
    public void testHasUniqueChars_SpecialCharacters() {
        String text = "!@#$%^&*()";
        assertTrue(Main.hasUniqueChars(text));
    }

    @Test
    public void testHasUniqueChars_SpecialDuplicateCharacters() {
        String text = "!!@#$%^&*()";
        assertFalse(Main.hasUniqueChars(text));
    }

    @Test
    public void testHasUniqueChars_UppercaseAndLowercase() {
        String text = "AbCdEfG";
        assertTrue(Main.hasUniqueChars(text));
    }

    @Test
    public void testHasUniqueChars_NonAlphabetic() {
        String text = "12345";
        assertTrue(Main.hasUniqueChars(text));
    }

    @Test
    public void testHasUniqueChars_NonAlphabeticDuplicate() {
        String text = "112345";
        assertFalse(Main.hasUniqueChars(text));
    }
}
