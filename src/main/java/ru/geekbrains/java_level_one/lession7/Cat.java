package ru.geekbrains.java_level_one.lession7;

public class Cat {

    private String name;
    private int appetite;
    boolean fullness;

    public Cat (){
    }

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate, int appetite){ // animal eating from plate with appetite
        int a;
        a = plate.getFood() - appetite;

        if (a < 0) {
            System.out.println("Not enough food on the plate for all");
            fullness = false;
        } else {
            plate.setFood(a);
            fullness = true;
        }
    }

}
