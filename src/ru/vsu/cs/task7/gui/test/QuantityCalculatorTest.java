package ru.vsu.cs.task7.gui.test;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.task7.gui.logics.QuantityCalculator;

public class QuantityCalculatorTest {

    @Test
    public void testProgram0() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{1, 4, 1});
        int quantity = 2;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram1() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{1, 1, 1, 1, 1, 1});
        int quantity = 6;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram2() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{1, 2, 3, 4, 5, 6, 6});
        int quantity = 2;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram3() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{1, 1, 2, 2, 3, 3});
        int quantity = 2;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram4() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{1, 2, 3, 4, 5, 6});
        int quantity = 1;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram5() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{});
        int quantity = 0;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram6() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{1, 1, 1, 2, 2});
        int quantity = 3;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram7() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{-1, -1, 0, -5, -99, -19999, -1});
        int quantity = 3;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram8() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{11, 22, 34, 39, 12, 99, 11, 12});
        int quantity = 2;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void testProgram9() {
        int array = QuantityCalculator.findMaximumNumberRepetitions(new int[]{1, 2, 1, 2, 1, 2, 1});
        int quantity = 4;
        Assert.assertEquals(quantity, array);
    }
}
