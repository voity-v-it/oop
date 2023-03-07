package ru.thelensky;

import staff.Employees;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Employees vasiliy = new Employees("Василий");
        System.out.println(vasiliy.name + " " + vasiliy.getId());

        Employees timofey = new Employees("Тимофей");
        System.out.println(timofey.name + " " + timofey.getId());

        Employees alisa = new Employees("Алиса");
        System.out.println(alisa.name + " " + alisa.getId());
    }
}
