package basiclibrary;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Lab2Test {
Lab2 tester = new Lab2();
    @Test public void roll() {
        int length = (tester.roll(3)).length;
        assertEquals(3, length);
    }

    @Test public void containsDuplicates() {
        Lab2 tester = new Lab2();

        int [] arr1 = {1,2,44,5,4};
        int [] arr2 = {3,6,6,6,6};
        boolean expected1 = tester.containsDuplicates(arr1);
        boolean expected2 = tester.containsDuplicates(arr2);

        assertTrue(expected2);
        assertFalse(expected1);

    }

    @Test public void calculateAverage() {
        Lab2 tester = new Lab2();
        int [] arr ={1,8,3};
        double avg = tester.calculateAverage(arr);
        assertTrue(4.0 == avg);
    }

    @Test public void multiArray() {
        Lab2 tester = new Lab2();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 80,90},
                {57, 65, 65,98,67},
                {55, 54, 60,98,76},
                {65, 56, 55,65,98},
                {5,550,8,800,100}
        };




        int [] arr = {65, 56, 55,65,98};
        int [] answer = tester.multiArray(weeklyMonthTemperatures);
        System.out.println(Arrays.toString(answer));
        assertArrayEquals(answer, arr);
    }
    @Test public void multiArrayWithNegativeNumber() {
        Lab2 tester = new Lab2();
        int[][] multiDimArray = {
                {66, 64, 58, 80, 90},
                {57, 65, 65, 98, 67},
                {55, 54, 60, 98, 76},
                {65, 56, 55, 65, 98},
                {5, 550, 8, -800, -100}
        };
        int[] arr2 = {5, 550, 8, -800, -100};
        int[] negativeLowest = tester.multiArray(multiDimArray);
        assertArrayEquals(negativeLowest, arr2);

    }

}