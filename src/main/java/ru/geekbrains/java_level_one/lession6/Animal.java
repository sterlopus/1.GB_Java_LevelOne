package ru.geekbrains.java_level_one.lession6;

public class Animal {
    private String name;

    public Animal(){
    }

    public Animal (String name) {
        this.name = name;
    }

    public void swim(int length, int limit) {
        if (length <= 0) {
            System.out.println("This animal couldn't swim");
        } else if (length > limit) {
            System.out.println("This animal can swim only " + limit + " meters");
        } else {
            System.out.println("Animal " + name + " swam " + length + " meters");
        }
    }

    public void run(int length, int limit) {
        if (length <= 0) {
            System.out.println("This animal couldn't run");
        } else if (length > limit) {
            System.out.println("This animal can run only \" + limit + \" meters");
        } else {
            System.out.println("Animal " + name + " run " + length + " meters");
        }
    }
}

