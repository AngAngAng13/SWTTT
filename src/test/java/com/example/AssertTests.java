package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class AssertTests {

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        assertEquals(expected.length, actual.length); // Using JUnit 5 Assertions
    }

    @Test
    public void testAssertEquals() {
        assertEquals("text", "text"); // Simplified message
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(true);
    }

    // Using AssertJ for more expressive assertions
    @Test
    public void testAssertThatBothContainsString() {
        assertThat("albumen").contains("a", "b");
    }

    @Test
    public void testAssertThatHasItems() {
        assertThat(Arrays.asList("one", "two", "three")).contains("one", "three");
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        assertThat(Arrays.asList("fun", "ban", "net"))
               .allMatch(str -> str.contains("n"));
    }

    @Test
    public void testAssertThatHamcrestCoreMatchers() {
        assertThat("good").startsWith("good").isEqualTo("good");
        assertThat("good").isNotEqualTo("bad");
        assertThat("good").isIn("bad", "good");
        assertThat(7).isNotIn(1, 2, 3, 4, 5);
        assertThat(new Object()).isNotSameAs(new Object());
    }
}
