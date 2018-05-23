package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person();
        p1.height = 181;
        p1.wheight = 53;
        p1.firstName = "yssur";
        p1.lastName = "Alani";
        p1.eating();
        p1.eating();
        p1.eating();
        System.out.println(p1.wheight);
        System.out.println(p1.Counter);

        Person p2 = new Person("Noor",158,61,"alSheikh");
        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());
        System.out.println(p1.getHeightInFeet());
        System.out.println(p2.getHeightInFeet());
        p2.eating();
        p2.eating();
        p2.eating();
        System.out.println(p2.wheight);
        System.out.println(p2.Counter);
        System.out.println(p2.Counter);


    }
}
