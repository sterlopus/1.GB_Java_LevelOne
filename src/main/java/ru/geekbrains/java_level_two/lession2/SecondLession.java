package ru.geekbrains.java_level_two.lession2;

public class SecondLession {

    public static void main(String[] args) {
        System.out.println(twoNumbersInRange(20,0));    //1
        printIfPositive(-10);                          //2
        System.out.println(checkIfNegativeNumber(482));        //3
        printStringNtimes("test string", 3);            //4
        int year = 2000;
        System.out.println("The "+ year +" is leap? Answer: " + isLeapYear(year)); //5

    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean twoNumbersInRange(int a, int b) {
        int sum = a + b;
        if ( sum >= 10 && sum <=20 ) return (true);
        else return (false);
    }

    /* 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public static void printIfPositive (int number) {
        if (number < 0) System.out.println(number + " is Negative");
        else System.out.println(number + " is Positive");
    }

    /* 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        если число отрицательное, и вернуть false если положительное.*/
    public static boolean checkIfNegativeNumber(int number) {
        if (number < 0) return (true); else return (false);
    }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
        в консоль указанную строку, указанное количество раз;*/
    public static void printStringNtimes(String a, int b) {
        for (int i = 0; i < b; i++) System.out.println(a);
    }

    /* 5. Написать метод, который определяет, является ли год високосным, и возвращает boolean
        (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static boolean isLeapYear(int year) {
        if  ((year % 400) == 0 ) { return (true);
        }  else if
            ((year % 100) == 0) { return (false);
        }  else if
            ((year % 4) == 0) { return (true);
        }  else
            return (false);
    }


}

