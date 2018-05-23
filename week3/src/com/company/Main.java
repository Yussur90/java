package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        System.out.println("account name: " + sa.getName());
        System.out.println("initial amount: " + sa.getAmount());
        sa.deposit(5000);
        System.out.println("new amount after deposit: " + sa.getAmount());

        CheckingAccount ca = new CheckingAccount();
        System.out.println("account name: " + ca.getName());
        System.out.println("initial amount: " + ca.getAmount());
        ca.deposit(6000);
        System.out.println("new amount after deposit: " + ca.getAmount());
        ca.withDraw(300);
        System.out.println("new amount after withdrawal: " + ca.getAmount());

    }
    // write your code here
//        Account a = new Account();
//        CheckingAccount c = new CheckingAccount();
//        a.setName("yussur");
//        a.deposit(100);
//        a.setAmmount(10);
//        a.deposit(100);
//        a.deposit(100);
//        a.deposit(100);
//        c.withDraw(10);

//        System.out.println(a.getName());
//        System.out.println(a.getBallance());
}
