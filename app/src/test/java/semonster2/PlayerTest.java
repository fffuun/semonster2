/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayer() {
        LinkedList<Integer> rndNumList = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            rndNumList.add(i % 5);
            rndNumList.add((i+2) % 5);
        }
        Player player = new Player(rndNumList, "TestPlayer", 100);

        assertEquals("TestPlayer", player.name);
        assertEquals(100, player.hp);
        assertEquals(8, player.deck.size());
    }

    @Test
    public void testToString() {
        LinkedList<Integer> rndNumList = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            rndNumList.add(i % 5);
            rndNumList.add((i+2) % 5);
        }
        Player player = new Player(rndNumList, "TestPlayer", 100);

        // Check if the result of toString contains "TestPlayer" and "HP: 100"
        String result = player.toString();
        assertTrue(result.contains("TestPlayer"));
        assertTrue(result.contains("HP: 100"));
    }
}