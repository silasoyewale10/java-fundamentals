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
//        tally();
    }

    public static String testMapMethod(int[][] arr) {
        String answer = "";

        HashSet<Integer> weather = new HashSet<>();

        for (int[] temp : arr) {
            for (int val : temp) {
                weather.add(val);  //unique array of weather
            }
        }
//        System.out.println(weather);
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

                answer += String.format("\nNever saw temperature %d ", i);
            }

        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static String tally (List<String> votes) {
//        List<String> votes = new ArrayList<>();
//        votes.add("Bush");
//        votes.add("Bush");
//        votes.add("Bush");
//        votes.add("Shrub");
//        votes.add("Hedge");
//        votes.add("Shrub");
//        votes.add("Bush");
//        votes.add("Hedge");
//        votes.add("Bush");
//        System.out.print(votes);

        HashMap<String, Integer> electionByNameAndVote = new HashMap<>();
        HashSet<String> numOfVotes = new HashSet<>();

        for (String name:votes){
            electionByNameAndVote.put(name, 0);
        }
//        System.out.println(electionByNameAndVote);
int highestVoteCounter= Integer.MIN_VALUE;
        String highestVoteWinner = "";

        for(int i = 0; i < votes.size(); i++) {
            String eachName = votes.get(i);
            electionByNameAndVote.put(eachName, 0);
            for(String vote: votes){
                if(eachName == vote){
                    electionByNameAndVote.put(eachName, electionByNameAndVote.get(eachName)+1);
                }
            }
//            String highestVoteWinner = "";

            System.out.println("electionByNameAndVote = " + electionByNameAndVote);
            for(String participant: electionByNameAndVote.keySet()){
                int eachParticipantScore = electionByNameAndVote.get(participant);
                if( eachParticipantScore > highestVoteCounter){
                    highestVoteWinner = participant;
                    highestVoteCounter = eachParticipantScore;
                }
            }

        }
        System.out.println("highestVoteCounter = " + highestVoteCounter);
        System.out.println("winner = " + highestVoteWinner);
//        System.out.println("electionByNameAndVote = " + electionByNameAndVote);
        return highestVoteWinner;
    }

}
