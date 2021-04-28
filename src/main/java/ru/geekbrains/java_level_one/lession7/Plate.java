package ru.geekbrains.java_level_one.lession7;

public class Plate {

    private int food;

    public Plate () {
    }

    public Plate (int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info (){
        System.out.println(food+ " pieces are on plate");
    }

    public void foodTopUp(int amount){
        food = amount;
    }
}
