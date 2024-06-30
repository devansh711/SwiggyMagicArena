package com.example.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("Hero", 100, 50, 20);
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(50, player.getStrength());
        assertEquals(20, player.getAttack());
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player("Hero", 100, 50, 20);
        player.takeDamage(30);
        assertEquals(70, player.getHealth());

        player.takeDamage(80);
        assertEquals(0, player.getHealth()); // health should not be negative
    }

    @Test
    public void testIsAlive() {
        Player player = new Player("Hero", 100, 50, 20);
        assertTrue(player.isAlive());

        player.takeDamage(100);
        assertFalse(player.isAlive());
    }

    @Test
    public void testToString() {
        Player player = new Player("Hero", 100, 50, 20);
        String expected = "Name: Hero, Health: 100, Strength: 50, Attack: 20";
        assertEquals(expected, player.toString());
    }
}
