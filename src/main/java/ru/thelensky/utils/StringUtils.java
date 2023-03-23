package ru.thelensky.utils;

public class StringUtils {

    public int indexOf(String str, char ch) {

        // str.charAt(ch)


        //хочу получить массив с знаками(буквами)
        char[] array = str.toCharArray();

        //хочу пройтись по массиву со ссылкой знак-индекс (цикл)
            //начало цикла
        for(int i = 0 ; i < array.length; i = i + 1 ){
            //хочу проверить если знак равен искомому знаку вернуть индекс и прекратить дальнейший поиск
            if(array[i] == ch){
                return i;
            }
            //конец цикла

        }
        //вернуть значение по умолчанию -1(ничего не найдено)
        return -1;
    }
    

}
