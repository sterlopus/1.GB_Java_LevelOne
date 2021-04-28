package ru.geekbrains.java_level_one.lession6;

public class Dog extends Animal {

    private final int RUN_LIMIT = 200;
    private final int SWIM_LIMIT = 10;
    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public int getRUN_LIMIT() {
        return RUN_LIMIT;
    }

    public int getSWIM_LIMIT() {
        return SWIM_LIMIT;
    }

    public Dog (String dogName) {
        super(dogName);
        counter++;
    }
}
