package ru.geekbrains.java_level_one.lession5;

public class FifthClass {

    public static void main(String[] args) {

        Employee[] staffList = new Employee[5];
        staffList[0] = new Employee(1, "Smith", "John", "CEO", "ceo@geekbrains.com",
                "+01234567", 200000, 44);
        staffList[1] = new Employee(2, "Smith", "Patty", "CFO", "cfo@geekbrains.com",
                "+01234568", 200000, 40);
        staffList[2] = new Employee(3, "Brandt", "Pete", "Cleaner", "cleaner@geekbrains.com",
                "+01234560", 100000, 24);
        staffList[3] = new Employee(4, "Molloq", "Jack", "junCoder", "juncode1@geekbrains.com",
                "+01234501", 100000, 22);
        staffList[4] = new Employee(5, "Newman", "Sarah", "HR", "hr@geekbrains.com",
                "+01234567", 200000, 55);


        for (Employee employee : staffList) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }

    }
}
