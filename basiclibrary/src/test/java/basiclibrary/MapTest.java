package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MapTest {
    @Test public void testMapMethod() {
        Map obj = new Map ();
        int [][] testArray = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals("Never saw temperature 63 Never saw temperature 67 Never saw temperature 68 Never saw temperature 69 ", obj.testMapMethod(testArray) );

    }
//    @Test public void testMapMethod2() {
//        int [][] arr2 = {{6,9,3,7},{9,3,1,6},{0,76,32}};
//
//    }

    @Test public void testTallyMethod() {
//        Map obj = new Map ();
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
assertEquals("Bush", Map.tally(votes));
    }


}