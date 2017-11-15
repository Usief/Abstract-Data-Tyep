package comp1110.homework.A03;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashSetTest {
    @Test
    public void add() throws Exception {
        Set<String> set = new HashSet<>();
        set.add("apple");
        assertTrue(set.size() == 1);
        assertTrue(set.toString().equals("apple"));
        set.add("orange");
        assertTrue(set.size() == 2);
        assertTrue(set.toString().equals("apple, orange") || set.toString().equals("orange, apple"));
        set.add("orange");
        assertTrue(set.size() == 2);
        assertTrue(set.toString().equals("apple, orange")||set.toString().equals("orange, apple"));
        set.add("banana");
        assertTrue(set.size() == 3);
    }

    @Test
    public void remove() throws Exception {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("orange");
        set.add("banana");
        assertTrue(set.size() == 3);
        set.remove("banana");
        assertTrue(set.size() == 2);
        assertTrue(set.toString().equals("apple, orange") || set.toString().equals("orange, apple"));
        set.remove("orange");
        assertTrue(set.size() == 1);
        assertTrue(set.toString().equals("apple"));
        set.remove("orange");
        assertTrue(set.size()==1);
        assertTrue(set.toString().equals("apple"));
    }

    @Test
    public void contains() throws Exception {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("orange");
        set.add("banana");
        assertTrue(set.size() == 3);
        assertTrue(set.contains("apple") && set.contains("orange") && set.contains("banana"));
        assertFalse(set.contains("pineapple"));
    }

}