import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // pluralize("cat", 8);
        System.out.println(pluralize("cat", 1));
        flipNHeads(2);
        // clock();

    }
    public static String pluralize (String word, int num){
        if(num == 0 || num > 1){
            return ("I own " + num + " " + word +"s.");
        }
        return ("I own " + num + " " + word+".");
    }
    public static void flipNHeads(int n){
        int counterHead = 0;
        int counterTail =0;
        int counter =0;
        double rando;
        // while (ifHead == true){

            //counterhead = 0;     n = 3
        while (counterHead != n){
            rando = Math.random();
            if(rando > 0.5){
                counterHead++;
                System.out.println("head");
            } else {
                System.out.println("tail");
                counterHead=0;
            }
            counter++;
        }
        if (n > 1){

            System.out.println("It took " + counter + " flips to flip " + counterHead +" head in a row.");
        } else {
            System.out.println("It took " + counter + " flip to flip " + counterHead +" head in a row.");

        }
    }
    public static void clock(){

        int second1 = 0;
        
        while (0 < 4 ){
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second2 = now.getSecond();
            if( second1 != second2){
                second1 = second2;
                System.out.println(hour + ":"+ minute + ":"+ second2);

            }
        }
        

    }
    
}