package com.company;


import java.util.Random;
import java.util.*;

public class Library {

    public static void roll(int n) {

        int dice[] = {1, 2, 3, 4, 5, 6};
        int random;
//        Stack<Integer> newArr = new Stack<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            random = new Random().nextInt(dice.length);
            newArr.add(dice[random]);
        }
        System.out.println(newArr);
    }
    public static boolean containsDuplicates (int [] x ) {
        Set<Integer> set = new HashSet<Integer>();
        for ( int i = 0; i < x.length; ++i ) {
            if ( set.contains( x[i])) {
                return true;
            }
            else {
                set.add(x[i]);
            }
        }
        return false;
    }

    public static int avg (int [] data){
        int sum = 0;
        int avg = 0;
        for ( int i = 0; i < data.length; i++ ) {
            sum = sum + data[i];
        }
        avg = sum/data.length;
        return avg;
    }
    public static void printtda() {
        int min=0;
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        for (int i=0; i<weeklyMonthTemperatures.length; i++) {
            int sum = 0;
            for (int j=0; j< weeklyMonthTemperatures[i].length; j++) {
                sum+=weeklyMonthTemperatures[i][j];
//                System.out.print(weeklyMonthTemperatures[i][g] +"  ");
            }
            int avgEveryRow =  sum/weeklyMonthTemperatures[i].length;
            min = sum/weeklyMonthTemperatures[0].length;
            if (min > avgEveryRow){
                min = avgEveryRow;
            }
            System.out.println("avg every row "+avgEveryRow);
        }
        System.out.println(min);
    }
    public static void main(String []args){
       roll(4);
        int dice[] = {1, 2, 5, 4, 5, 6};

       System.out.println(containsDuplicates(dice));
        System.out.println(avg(dice));
//        System.out.println(printtda());
        printtda();


    }
}
