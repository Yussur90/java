package com.company;
import java.util.Random;
import java.util.Arrays;
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


    public String acceptAndReverse(int a , int b , int c , int d , int e){
      int[] userInput={a,b,c,d,e,e,d,c,b,a};
        String bla = Arrays.toString( userInput );
      return bla;
    }
}