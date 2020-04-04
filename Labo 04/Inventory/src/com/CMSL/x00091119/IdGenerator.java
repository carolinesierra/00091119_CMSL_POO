package com.CMSL.x00091119;

public final class IdGenerator extends Item{
    private static int counter = 0;

    private IdGenerator() {
        super();
    }

    public static int newId() {
        counter++;
        return counter;
    }
}
