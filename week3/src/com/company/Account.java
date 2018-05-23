package com.company;

public class Account {


    private String name;
    private int balance;

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(int d){
        balance += d;
    }
    public String getName(){
        return this.name;
    }
    public int getAmount(){
        return this.balance;
    }
    public void setAmmount(int i){
        balance -= i;
    }

}
