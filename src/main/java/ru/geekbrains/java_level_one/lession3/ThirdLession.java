package ru.geekbrains.java_level_one.lession3;


import java.util.Arrays;

public class ThirdLession {

    public static void main(String[] args) {
        System.out.println("\nTask#1");
        invertArrayOne2Zero();

        System.out.println("\nTask#2");
        fillArray();

        System.out.println("\nTask#3");
        doubleArrayValuesByCondition();

        System.out.println("\nTask#4");
        fillArraysDiagonals();

        System.out.println("\nTask#5");
        System.out.println(Arrays.toString(arrayInitiate(5,77)));

        System.out.println("\nTask#6");
        arrayExtremums();

        int[] myArray={1,2,3,4,5,3,2};
        System.out.println("\nTask#7");
        System.out.println(checkBalance(myArray));

        System.out.println("\nTask#8");
        int[] myArray2={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(myArray2));
        System.out.println(Arrays.toString(shiftArrayLeft(myArray2,3)));

    }

    /*        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
                С помощью цикла и условия заменить 0 на 1, 1 на 0; */
    private static void invertArrayOne2Zero() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Were: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Now:  " + Arrays.toString(arr)+"\n");
    }


    /*        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
                его значениями 1 2 3 4 5 6 7 8 …100;  */
    private static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr)+"\n");
    }


        /*        3. Задать массив[ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]пройти по нему циклом, и
                    числа меньшие 6 умножить на 2; */
    private static void doubleArrayValuesByCondition() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Were: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Now:  " + Arrays.toString(arr) + "\n");
    }


        /*        4. Создать квадратный двумерный целочисленный массив(количество строк и столбцов одинаковое), и с помощью
                    цикла(-ов) заполнить его диагональные элементы единицами(можно только одну из диагоналей, если обе сложно).
                    Определить элементы одной из диагоналей можно по
                    следующему принципу:индексы таких элементов равны, то есть[0][0], [1][1], [2][2], …, [n][n]; */
    private static void fillArraysDiagonals() {
        int[][] arr = new int[10][10];

        for (int i = 0, j= arr.length-1; i < arr.length; i++, j--) {
                arr[i][i] = 1;
                arr[i][j] = 1;
            }
        printArr(arr);
        System.out.println();
    }

    private static void printArr(int[][] arr) {   //array print method
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }



        /*        5. Написать метод, принимающий на вход два аргумента:len и initialValue, и возвращающий одномерный массив типа
                    int длиной len, каждая ячейка которого равна initialValue; */
    private static int[] arrayInitiate(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < len; arr[i++]=initialValue) {
        }
        return arr;
    }


    /*        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;  */
    private static void arrayExtremums() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int min = arr[0];
        int max = arr[0];
        for (int i:arr  //define Min and Max values
             ) {
            if (i<min){
                min=i;
            } else if (i>max){
                max=i;
            }
        }

        String minimums = "";
        String maximums = "";
        for (int i = 0; i < arr.length; i++) {  //find "cells" of array with extremums
            if (arr[i]==min){
                minimums += i+", ";
            }
            if (arr[i]==max){
                maximums += i+", ";
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is a "+min+" and they are in the cell(s): "+minimums+"\n"+
                "Maximum is a "+max+" and they are in the cell(s): "+maximums);
    }


        /*        7. **Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
        true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        **Примеры:
        checkBalance([2, 2, 2, 1, 2, 2, |||10, 1]) →true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, |||2, 1]) →true, т.е. 1 + 1 + 1 = 2 + 1
        граница показана символами |||,эти символы в массив не входят и не имеют никакого отношения к ИЛИ.       */
    private static boolean checkBalance(int[] arr) {

        for (int i = 0; i < arr.length; i++) {  // 'i' is "border" between parts of array

            int left = 0;   //sum of values to the left out border
            for (int l = 0; l <= i; l++) {
                left += arr[l];
            }

            int right = 0;  //sum of values to the right out border
            for (int r = arr.length - 1; r > i; r--) {
                right += arr[r];
            }

            if (left == right) {
                return true;
            }
        }
        return false;
    }

        /*        8. ***Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
        отрицательным),при этом метод должен сместить все элементы массива на n позиций.Элементы смещаются
        циклично.Для усложнения задачи нельзя пользоваться вспомогательными массивами.Примеры: [1, 2, 3 ]при n = 1
        (на один вправо) ->[3, 1, 2 ]; [3, 5, 6, 1]при n = -2 (на два влево) ->[6, 1, 3, 5 ].При каком n в какую сторону
        сдвиг можете выбирать сами.      */

    private static int[] shiftArrayLeft(int[] arr, int shift) {
        for (int j = 0; j < shift; j++) {   //repeat one-shifting N times
            int m = arr[0];
            for (int i = 0; i < arr.length; i++) {  //shift for 1 place
                if ((i + 1) < arr.length) {
                    arr[i] = arr[i + 1];
                } else {
                    arr[i] = m;
                }
            }
        }
        return arr;
    }

}
