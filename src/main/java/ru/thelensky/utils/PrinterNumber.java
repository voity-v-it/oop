package ru.thelensky.utils;

public class PrinterNumber {
    public static char[][] ZERO = {
            { ' ', '*', '*', ' ', },
            { '*', ' ', ' ', '*', },
            { '*', ' ', ' ', '*', },
            { '*', ' ', ' ', '*', },
            { ' ', '*', '*', ' ', }
    };
    public static char[][] ONE = {
            { ' ', ' ', '*', ' ', },
            { ' ', '*', '*', ' ', },
            { ' ', ' ', '*', ' ', },
            { ' ', ' ', '*', ' ', },
            { '*', '*', '*', '*', }
    };
    public static char[][] TWO = {
            { '*', '*', '*', '*', },
            { ' ', ' ', ' ', '*', },
            { '*', '*', '*', '*', },
            { '*', ' ', ' ', ' ', },
            { '*', '*', '*', '*', }
    };
    public static char[][] THREE = {
            { '*', '*', '*', '*', },
            { ' ', ' ', '*', ' ', },
            { ' ', '*', '*', ' ', },
            { ' ', ' ', ' ', '*', },
            { '*', '*', '*', ' ', }
    };
    public static char[][] FORE = {
            { '*', ' ', ' ', '*', },
            { '*', ' ', ' ', '*', },
            { '*', '*', '*', '*', },
            { ' ', ' ', ' ', '*', },
            { ' ', ' ', ' ', '*', }
    };
    public static char[][] FIFE = {
            { '*', '*', '*', '*', },
            { '*', ' ', ' ', ' ', },
            { '*', '*', '*', '*', },
            { ' ', ' ', ' ', '*', },
            { '*', '*', '*', '*', }
    };
    public static char[][] SIX = {
            { ' ', '*', '*', '*', },
            { '*', ' ', ' ', ' ', },
            { '*', '*', '*', ' ', },
            { '*', ' ', ' ', '*', },
            { ' ', '*', '*', ' ', }
    };
    public static char[][] SEVEN = {
            { '*', '*', '*', '*', },
            { ' ', ' ', '*', ' ', },
            { ' ', '*', ' ', ' ', },
            { ' ', '*', ' ', ' ', },
            { ' ', '*', ' ', ' ', }
    };
    public static char[][] EIGHT = {
            { ' ', '*', '*', ' ', },
            { '*', ' ', ' ', '*', },
            { ' ', '*', '*', ' ', },
            { '*', ' ', ' ', '*', },
            { ' ', '*', '*', ' ', }
    };
    public static char[][] NINE = { { ' ', '*', '*', ' ', }, { '*', ' ', ' ', '*', }, { ' ', '*', '*', '*', },
            { ' ', ' ', ' ', '*', }, { '*', '*', '*', ' ', } };

    public static char[][][] NUMBERS = { ZERO, ONE, TWO, THREE, FORE, FIFE, SIX, SEVEN, EIGHT, NINE };

    public void printNumber(char[][] number) {
        int lengthOuter = 5; // длинна внешнего массива. Так делать не надо. Заменить на number.length

        for (int i = 0; i < lengthOuter; i++) {
            for (int j = 0; j < number[i].length; j++) { // number[i].length; // длинна внешнего ма
                // выбрать из массива массивов массив по индексу i, а затем из выбранного
                // массива выбрать элемент по индексу j
                System.out.print(number[i][j]);

                // эквивалентно строке выше
                // char [] outer = number[i];
                // char ch = outer[j];
                // System.out.print(ch);
            }

            // \n - символ перевода "с новой строки"
            System.out.print("\n");

            // эквивалентно строке выше
            // System.out.println();
        }
    }

    public void printNumberFromString(String str) {
        // получение из строки массива с цифрами тип int (начало)
        char[] charArray = str.toCharArray();
        int[] numbers = new int[charArray.length];// <- вот он!!!

        for (int i = 0; i < numbers.length; i++) {
            char charNumber = charArray[i];
            String stringNumber = String.valueOf(charNumber);
            int number = Integer.parseInt(stringNumber);
            numbers[i] = number;
        }
        // получение из строки массива с цифрами тип int (конец)

        // Распечатка (начало)
        for (int i = 0; i < NUMBERS[0].length; i++) {// Голубой цикл
            for (int j = 0; j < numbers.length; j++) {// Оранжевый цикл
                int indexNumber = numbers[j];
                for (int k = 0; k < NUMBERS[0][0].length; k++) {// Зеленый цикл


                    // Замена символа
                    if(NUMBERS[indexNumber][i][k] == '*'){
                        System.out.print(indexNumber);
                    } else {
                        System.out.print(NUMBERS[indexNumber][i][k]);
                    }

                }
                System.out.print(" | ");// пробел между цифрами
            }
            System.out.println();
        }

        // Распечатка (конец)
    }

    public int sum(int x, int y) {
        return x + y;
    }
}
