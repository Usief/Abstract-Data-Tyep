package comp1110.homework.A01;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayListTest {
    @Test
    public void add() throws Exception {
        ArrayList<String> a = new ArrayList<String>();

        a.add("a");
        assertTrue(a.size()==1);
        a.add("b");
        assertTrue(a.size()==2);
        a.add("ccc");
        assertTrue(a.size()==3);
        assertTrue(a.toString().equals("a b ccc"));
    }

    @org.junit.Test
    public void remove() throws Exception {
        ArrayList<String> al = new ArrayList<String>();

        al.add("a");
        assertTrue(al.size()==1);
        al.add("b");
        assertTrue(al.size()==2);
        al.add("ccc");
        assertTrue(al.size()==3);
        al.remove(0);
        assertTrue(al.toString().equals("b ccc"));
    }

    @org.junit.Test
    public void reverse() throws Exception {
        ArrayList<String> al = new ArrayList<String >();

        al.add("a");
        al.add("b");
        al.add("ccc");
        al.reverse();
        assertTrue(al.toString().equals("ccc b a"));
    }

    @org.junit.Test
    public void get() throws Exception {
        ArrayList<String> al = new ArrayList<String>();

        al.add("a");
        al.add("b");
        al.add("ccc");
        assertTrue(al.get(1)=="b");
    }

}