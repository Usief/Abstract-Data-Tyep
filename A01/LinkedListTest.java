package comp1110.homework.A01;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void add() throws Exception {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("b");
        assertTrue(ll.size()==2);
        ll.add("c");
        assertTrue(ll.size()==3);

        assertTrue(ll.toString().equals("a b c"));
    }

    @Test
    public void remove() throws Exception {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("b");
        ll.add("c");

        assertTrue(ll.toString().equals("a b c"));
        ll.remove(2);
        assertTrue(ll.toString().equals("a b"));
        ll.add("d");
        assertTrue(ll.toString().equals("a b d"));

    }


    @Test
    public void reverse() throws Exception {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("b");
        ll.add("c");
        assertTrue(ll.toString().equals("a b c"));
        ll.reverse();
        assertTrue(ll.toString().equals("c b a"));

    }

}