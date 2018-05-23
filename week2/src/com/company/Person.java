package com.company;

public class Person {

    public Person(){
        Counter++;
    }

    public Person (String firstName, int height,int wheight , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.wheight= wheight;
    }

    static int Counter;
    public String firstName;
    public String lastName;
    public int height;
    public String city;
    static int wheight;
    final double Tofeet = 3.2808;

    public String getFullName(){
        return "FirstName: " + firstName+ " lastname: "+lastName;//+" wheight: " +wheight;
    }

    public double getHeightInFeet() {
        return this.height*Tofeet;
    }

     static void eating(){
        System.out.println("im eating");
        wheight++;
    }


}
