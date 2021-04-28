package ru.geekbrains.java_level_one.lession7;

import java.util.Arrays;

public class SeventhClass {

    public static void main(String[] args) {

        final int FULL_PLATE = 44;
        Cat[] cat = new Cat[5];
        Plate plate = new Plate (0);

        cat[0] = new Cat ("Tom", 10);
        cat[1] = new Cat ("Bob", 10);
        cat[2] = new Cat ("Tim", 10);
        cat[3] = new Cat ("Luke", 10);
        cat[4] = new Cat ("Kitty", 5);

        boolean allCatsFull;
        do {
            allCatsFull = true;

            plate.foodTopUp(plate.getFood()+FULL_PLATE); // refill plate

            for (Cat value : cat) {  // all hungry cats ate one-by-one
                if (!value.fullness) {
                    value.eat(plate, value.getAppetite());
                }
                allCatsFull = allCatsFull && value.fullness; //counter keeps if all cats is full
            }

            for (Cat value : cat) {  // print fullness of all cats to console
                System.out.printf("Cat %s is full = %b \n", value.getName(), value.fullness);
            }

            plate.info();   // print left food amount to console

        } while (!allCatsFull);    // repeat while every cats are full

    }
}
