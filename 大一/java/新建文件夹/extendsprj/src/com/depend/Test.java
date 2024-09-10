package com.depend;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Person p = new Person();

        WashMachine machine = new WashMachine();

        Tool t = new WashMachine();

        Object obj = new WashMachine();
        p.wash(machine);

        Board board = new Board();
        p.wash(board);
    }
}
