package basiclibrary;
import java.util.*;

public class Map {
    public static void main(String[] args) {
        testMapMethod(new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        });
        tally();
    }

    public static String testMapMethod(int[][] arr) {
        String answer = "";

        HashSet<Integer> weather = new HashSet<>();

        for (int[] temp : arr) {
            for (int val : temp) {
                weather.add(val);  //unique array of weather
            }
        }
        System.out.println(weather);
//        Scanner reader = new Scanner();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (min >= arr[i][j]) {
                    min = arr[i][j];
                }

            }
        }
        System.out.println("max value is " + max);
        System.out.println("min value is " + min);

        for (int i = min; i < max; i++) {

            if (!weather.contains(i)) {

                answer += String.format("Never saw temperature %d ", i);
            }

        }
        return answer;
    }

    public static void tally () {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        System.out.print(votes);

        HashMap<String, Integer> electionByNameAndVote = new HashMap<>();
        HashSet<String> numOfVotes = new HashSet<>();

        //        for(int i = 0; i < votes.size(); i ++){
        //set all names to satart with 0.
        // go through each name
//        for (String vote : votes) {
//            int count = 0;
//            String name = votes.get(i);
//            electionByNameAndVote.put(name, i); //'bob, 8';
//            if (electionByNameAndVote.get(name) > 0) {
//                count++;
//                winner = name;
//                count++;
//                electionByNameAndVote.put(name, count);
//            }
//
//        }
    }

}
