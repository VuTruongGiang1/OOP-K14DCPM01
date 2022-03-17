package oo.tuan04.buoi7;

import java.util.Scanner;

import oo.tuan04.buoi7.testproctected.Person;

public class Employee extends Person{
    
    private double salary;

    public Employee(String name, String birthday, double salary){
        super(name, birthday);
        this.salary = salary;
    }

    Scanner nhap;

    public String toString(){
        return "Employee [salary=" + salary + "]" + super.toString();
    }
}
