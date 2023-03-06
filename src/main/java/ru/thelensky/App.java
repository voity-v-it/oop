package ru.thelensky;

import staff.Employees;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Employees vasiliy = new Employees();
        vasiliy.id = 1;
        vasiliy.name = "Василий";
        System.out.println( vasiliy.name + " " + vasiliy.id );

        mployees timofey = new Employees(2, "Тимофей");
        System.out.println( timofey.name + " " + timofey.id );
    }
}
