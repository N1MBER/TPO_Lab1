package main.secondBlock;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

    //Проверка вставки
    @Test
    public void test1() {
        int nums = 10;
        ArrayList<Integer> arr_act = new ArrayList<>();
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 0; i < nums; i++){
            rbt.add(i);
            arr_act.add(i);
        }
        Iterator<Integer> iterator = rbt.iterator();
        ArrayList<Integer> test_arr = new ArrayList<>();
        while (iterator.hasNext()){
            test_arr.add(iterator.next());
        }
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        System.out.println("Проверочные данные: " + arr_act);
        System.out.println("Тестовые данные: " + test_arr);
        Assert.assertTrue(test_arr.equals(arr_act));
    }

    //Проверка вставки
    @Test
    public void test2() {
        int nums = 20;
        ArrayList<Integer> arr_act = new ArrayList<>();
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 0; i < nums; i++){
            rbt.add(i);
            arr_act.add(i);
        }
        Iterator<Integer> iterator = rbt.iterator();
        ArrayList<Integer> test_arr = new ArrayList<>();
        while (iterator.hasNext()){
            test_arr.add(iterator.next());
        }
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        System.out.println("Проверочные данные: " + arr_act);
        System.out.println("Тестовые данные: " + test_arr);
        Assert.assertTrue(test_arr.equals(arr_act));
    }

    //Проверка удаления
    @Test
    public void test3() {
        int nums = 10;
        int test_num = 7;
        ArrayList<Integer> arr_act = new ArrayList<>();
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 0; i < nums; i++){
            rbt.add(i);
            if (i != test_num)
             arr_act.add(i);
        }
        rbt.remove(7);
        Iterator<Integer> iterator = rbt.iterator();
        ArrayList<Integer> test_arr = new ArrayList<>();
        while (iterator.hasNext()){
            test_arr.add(iterator.next());
        }
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        System.out.println("Проверочные данные: " + arr_act);
        System.out.println("Тестовые данные: " + test_arr);
        Assert.assertTrue(test_arr.equals(arr_act));
    }

    //Проверка удаления
    @Test
    public void test4() {
        int nums = 10;
        ArrayList<Integer> arr_act = new ArrayList<>();
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 0; i < nums; i++){
            rbt.add(i);
            arr_act.add(i);
        }
        arr_act.remove(arr_act.indexOf(7));
        rbt.remove(7);
        arr_act.remove(arr_act.indexOf(1));
        rbt.remove(1);
        arr_act.remove(arr_act.indexOf(4));
        rbt.remove(4);
        Iterator<Integer> iterator = rbt.iterator();
        ArrayList<Integer> test_arr = new ArrayList<>();
        while (iterator.hasNext()){
            test_arr.add(iterator.next());
        }
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        System.out.println("Проверочные данные: " + arr_act);
        System.out.println("Тестовые данные: " + test_arr);
        Assert.assertTrue(test_arr.equals(arr_act));
    }


    //Проверка смены вершины
    @Test
    public void test5() {
        int nums = 17;
        int startHead = 3;
        int endHead = 7;
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 0; i < nums; i++){
            rbt.add(i);
        }
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        Assert.assertTrue(startHead == (Integer) RedBlackTree.getRoot(rbt).getValue());
        rbt.add(20);
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        Assert.assertTrue(endHead == (Integer) RedBlackTree.getRoot(rbt).getValue());
    }

    //Проверка смены вершины
    @Test
    public void test6() {
        System.out.println("Test 6");
        int nums = 7;
        int startHead = 2;
        int endHead = 4;
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 1; i <= nums; i++){
            rbt.add(i);
        }
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        Assert.assertTrue(startHead == (Integer) RedBlackTree.getRoot(rbt).getValue());
        rbt.add(8);
        System.out.println("Дерево:\n");
        RedBlackTree.printTree((RedBlackTree<Integer> )rbt);
        Assert.assertTrue(endHead == (Integer) RedBlackTree.getRoot(rbt).getValue());
    }

    //Проверка цвета
    @Test
    public void test7() {
        int nums = 5;
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 0; i < nums; i++){
            rbt.add(i);
        }
        System.out.println(rbt.find(3).getColor() + " " + RedBlackTree.NodeColor.BLACK);
        Assert.assertEquals(rbt.find(3).getColor(), RedBlackTree.NodeColor.BLACK);
        rbt.add(5);
        System.out.println(rbt.find(3).getColor() + " " + RedBlackTree.NodeColor.RED);
        Assert.assertEquals(rbt.find(3).getColor(), RedBlackTree.NodeColor.RED);
    }

    //Проверка цвета
    @Test
    public void test8() {
        int nums = 3;
        RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
        for (int i = 0; i < nums; i++){
            rbt.add(i);
        }
        System.out.println(rbt.find(2).getColor() + " " + RedBlackTree.NodeColor.RED);
        Assert.assertEquals(rbt.find(2).getColor(), RedBlackTree.NodeColor.RED);
        rbt.add(3);
        System.out.println(rbt.find(2).getColor() + " " + RedBlackTree.NodeColor.BLACK);
        Assert.assertEquals(rbt.find(2).getColor(), RedBlackTree.NodeColor.BLACK);
    }
}
