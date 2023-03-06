package ru.thelensky;

import staff.Employees;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Employees vasiliy = new Employees("Василий");
        System.out.println( vasiliy.name + " " + vasiliy.id );

        Employees timofey = new Employees("Тимофей");
        System.out.println( timofey.name + " " + timofey.id );
    }
}
