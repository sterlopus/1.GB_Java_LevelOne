package ru.geekbrains.java_level_one.lession6;

public class SixClass {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Jerry");
        Dog dogDva = new Dog ("Vinnie");
        Dog dogTri = new Dog ("Barbos");

        dog.swim(200, dog.getSWIM_LIMIT());
        dog.run(100, dog.getRUN_LIMIT());
        cat.swim(0, cat.getSWIM_LIMIT());
        cat.run(10, cat.getRUN_LIMIT());
        System.out.printf("\nSo: %d cats, %d dogs and total %d animals",
                Cat.getCounter(), Dog.getCounter(),(Cat.getCounter() + Dog.getCounter()));
    }
}
