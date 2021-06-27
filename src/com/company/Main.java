package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static String pluralize(String name,int num){
        if(num > 1 || num == 0){
            return name + "s";
        }else {
            return name;
        }
    }

    public static void flipNHeads (int headsInRow) {
        int countFlips =0 , countHead = 0;
        //  from w3school
        Random random = new Random();

        while(countHead<headsInRow){
            double randFlip = random.nextDouble() ;
            if(randFlip<0.5){
                System.out.println("tail");
                countHead =0;
            }else{
                System.out.println("head");
                countHead = countHead + 1;
            }
            countFlips = countFlips +1 ;
        }


        System.out.println("It took"+" " + countFlips + " " + "flip to flip" +" "+ countHead +" "+ "heads in a row");

    }

    public  static void  clock (){
        int timeAfterSecond = 0;
        while (true){
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
// or, if you're feeling fancy
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            if(timeAfterSecond != second){
                timeAfterSecond = second;
                System.out.println(time);
            }


        }
    }
    public static void main(String[] args) {
        // write your code here
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(4);
        clock();

    }
}
