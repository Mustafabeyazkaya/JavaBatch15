package class3;

import java.sql.SQLOutput;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age = 10; // requesting the computer to create a box of tye int and store a value 10 in it.
        int salary; // only create a box of type int and dont assign any value to it.
        salary = 120000; // updating a variable reassigning a value
        System.out.println(salary);
        /* String name;
        String city;
        String country;
         */
        String name,city,country; // we can create multiple empty boxes in a single line of code
        char gender,letter;
        name="Daria";
        // system.out.println(city); i have not started anything inside the city varialbe thats why java is confused
        // what to print
        System.out.println(name);
        city="Williamsburg";
        country="USA";
        System.out.println(city);
        System.out.println(country);
    }}
