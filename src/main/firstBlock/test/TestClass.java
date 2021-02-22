package main.firstBlock.test;
import main.firstBlock.java.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    final double EPS = 1.0e-5;
    final double INF = 1.0e8;
    private final Calculator calculator = new Calculator();

    // #=================================#
    // |                                 |
    // | Точки где функция не определена |
    // |                                 |
    // #=================================#

    @Test
    public void testCalcSec1() {
        try {
            System.out.println("Точки где функция не определена, n = -1");
            Assert.assertTrue(Math.abs(calculator.calculateSex(-Math.PI/2) - INF) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec2() {
        try {
            System.out.println("Точки где функция не определена, n = 0");
            Assert.assertTrue(Math.abs(calculator.calculateSex(Math.PI/2) - INF) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec3() {
        try {
            System.out.println("Точки где функция не определена, n = 1");
            Assert.assertTrue(Math.abs(calculator.calculateSex(3 * Math.PI/2) - INF) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec4() {
        try {
            System.out.println("Точки где функция не определена, n = 2");
            Assert.assertTrue(Math.abs(calculator.calculateSex(5 * Math.PI/2) - INF) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    // #=================================#
    // |                                 |
    // |    Области эквивалентности      |
    // |   ( -3 * Pi / 2 + 2 * Pi * n;   |
    // |     - Pi / 2 + 2 * Pi * n )     |
    // |                                 |
    // #=================================#

    @Test
    public void testCalcSec5() {
        try {
            System.out.println("Область эквивалентности №1, x = - 19 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(-19 * Math.PI / 6) -
                    1/Math.cos(-19 * Math.PI / 6)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec6() {
        try {
            System.out.println("Область эквивалентности №1, x = -5 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(-5 * Math.PI / 6) -
                    1/Math.cos(-5 * Math.PI / 6)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec7() {
        try {
            System.out.println("Область эквивалентности №1, x = 8 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(8 * Math.PI / 6) -
                    1/Math.cos(8 * Math.PI / 6)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec8() {
        try {
            System.out.println("Область эквивалентности №1, x = 17 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(17 * Math.PI / 6) -
                    1/Math.cos(17 * Math.PI / 6)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    // #=================================#
    // |                                 |
    // |    Области эквивалентности      |
    // |   ( - Pi / 2 + 2 * Pi * n;      |
    // |      Pi / 2 + 2 * Pi * n )      |
    // |                                 |
    // #=================================#

    @Test
    public void testCalcSec9() {
        try {
            System.out.println("Область эквивалентности №2, x = - 13 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(-13 * Math.PI / 6) -
                    1/Math.cos(-13 * Math.PI / 6)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec10() {
        try {
            System.out.println("Область эквивалентности №2, x = -5 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(0) -
                    1/Math.cos(0)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec11() {
        try {
            System.out.println("Область эквивалентности №2, x = 10 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(10 * Math.PI / 6) -
                    1/Math.cos(10 * Math.PI / 6)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }

    @Test
    public void testCalcSec12() {
        try {
            System.out.println("Область эквивалентности №2, x = 23 * PI / 6");
            Assert.assertTrue(Math.abs(calculator.calculateSex(23 * Math.PI / 6) -
                    1/Math.cos(23 * Math.PI / 6)) < EPS);
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }
}
