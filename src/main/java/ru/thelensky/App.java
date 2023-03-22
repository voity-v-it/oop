package ru.thelensky;

import ru.thelensky.utils.PrinterNumber;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        PrinterNumber printerNumber = new PrinterNumber();
        printerNumber.printNumber(PrinterNumber.FIFE);
        printerNumber.printNumberFromString("78");

    }
}
