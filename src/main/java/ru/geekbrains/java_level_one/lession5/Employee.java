package ru.geekbrains.java_level_one.lession5;

public class Employee {
    private int id;
    private String lastname;
    private String firstname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (){
    };

    public Employee (int id, String lastname, String firstname, String position, String email, String phone, int salary, int age) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info () {
        System.out.println("\nEmployee's "+firstname+" "+lastname+" data:");
        System.out.println("id = "+ id+"\nin position - "+position+"\nemail - "+email+"\nphone - "+phone+
                "\nsalary - "+salary+"\nage - "+age);
    }
    public int getAge () {
        return age;
    }

}
