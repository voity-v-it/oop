package ru.thelensky.utils;

import org.junit.Assert;
import org.junit.Test;

public class PrinterNumberTest {
    @Test
    public void testSum() {
        PrinterNumber pn = new PrinterNumber(); // построить
        int result = pn.sum(2, 3); // Пустить (запустить)
        Assert.assertEquals(5, result); // Проверить
    }

    @Test
    public void testSumWrongResult() {
        PrinterNumber pn = new PrinterNumber(); // построить
        int result = pn.sum(4, 3); // Пустить (запустить)
        Assert.assertNotEquals(5, result); // Проверить
    }
}
