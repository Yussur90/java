package com.company;
import java.util.Random;

public class myClass {
//    public String printMsg(String x){
//        return x;
//    }
    public String guessMyNumber(int x){
        Random rand = new Random();
        String win;
        String over;
        int  n = rand.nextInt(10) ;
        if( x == n){
            win = "you win ";
            return win;
        }
        over = "game over";
        return over;
    }
}