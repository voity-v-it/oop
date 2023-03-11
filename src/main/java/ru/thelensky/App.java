package ru.thelensky;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        String str = "ПриМвет Мир!";
        int index = str.indexOf('М');
        System.out.println(index);

        int lastIndexOf = str.lastIndexOf('М');
        System.out.println(lastIndexOf);

        // int uIndex= new StringUtils().indexOf(str, 'М');
        // System.out.println(uIndex);



    }
}
