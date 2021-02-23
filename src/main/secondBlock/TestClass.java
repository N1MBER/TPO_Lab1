package main.secondBlock;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

    @Test
    public void test1() {
        System.out.println("Test 1");
        RedBlackTree t = new RedBlackTree( );
        final int NUMS = 10;
        String act = "3 1 0 2 5 4 7 6 8 9";
        StringBuilder rightTest = new StringBuilder();
        for( int i = 0; i < NUMS; i++ )
            t.insert( new Integer( i ) );
        ArrayList list = t.getTree();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            rightTest.append(iterator.next() + " ");
        }
        System.out.println("Test: " + rightTest.toString());
        System.out.println("Actual: " + act);
        Assert.assertTrue(act.equals(rightTest.toString().trim()));
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
        RedBlackTree t = new RedBlackTree( );
        final int NUMS = 20;
        String act = "7 3 1 0 2 5 4 6 11 9 8 10 15 13 12 14 17 16 18 19";
        StringBuilder rightTest = new StringBuilder();
        for( int i = 0; i < NUMS; i++ )
            t.insert( new Integer( i ) );
        ArrayList list = t.getTree();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            rightTest.append(iterator.next() + " ");
        }
        System.out.println("Test: " + rightTest.toString());
        System.out.println("Actual: " + act);
        Assert.assertTrue(act.equals(rightTest.toString().trim()));
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
        RedBlackTree t = new RedBlackTree( );
        final int NUMS = 30;
        String act = "7 3 1 0 2 5 4 6 15 11 9 8 10 13 12 14 19 17 16 18 23 21 20 22 25 24 27 26 28 29";
        StringBuilder rightTest = new StringBuilder();
        for( int i = 0; i < NUMS; i++ )
            t.insert( new Integer( i ) );
        ArrayList list = t.getTree();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            rightTest.append(iterator.next() + " ");
        }
        System.out.println("Test: " + rightTest.toString());
        System.out.println("Actual: " + act);
        Assert.assertTrue(act.equals(rightTest.toString().trim()));
    }
}
