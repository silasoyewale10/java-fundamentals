package basiclibrary;

import java.util.Random;
import java.io.*;
import java.util.*;
public class Lab2 {
    public static int [] roll(int x){
        int [] arr = new int [x];
        Random dice = new Random();
        
        for (int y = 0; y < x; y++){
            int side = dice.nextInt(6);
            arr[y]= side+1;

        }
        return arr;
    }
    public static boolean containsDuplicates(int [] arr){
        int counter = 0;
        for(int x = 0; x < arr.length; x++){
            for(int y =1; y < arr.length; y++){
                if(arr[y] == arr[x]){
                    System.out.println("counter is "+ counter);
                    counter++;
                    if(counter > arr.length){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static double calculateAverage(int [] arr){
        double total =0;
        double avg ;
        int x;
        for (x = 0; x < arr.length; x++){
            total+=arr[x];

        }
        avg = (double)total/(x);
        return avg;
    }
    public static int [] multiArray(int [][]arr){
        int [] result = {};
        double lowestAvg = 100000000;
        for(int x =0; x < arr.length; x++){
            double average=0;
            int total =0;
            for(int j=0; j < arr[x].length; j++){

                total+=arr[x][j];
                average = (float)total/arr[j].length;
            }
            if(average < lowestAvg){
                lowestAvg= average;
                result = arr[x];
            }
        }
        return result;
    }

}