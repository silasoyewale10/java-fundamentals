package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {
    @Test public void testRestaurantConstructor() {
        Restaurant test1 = new Restaurant("Ghu Kaku", 4, "$$");
        System.out.println(test1.toString());
        String name = test1.name;
        int star = test1.numOfStars;
        String pricecategory = test1.priceCategory;
        assertEquals("Ghu Kaku", test1.name);
        assertEquals(4, test1.numOfStars);
        assertEquals("$$", test1.priceCategory);
    }
    @Test public void testRestaurantToString() {
        Restaurant test1 = new Restaurant("Ghu Kaku", 4, "$$");
        assertEquals("We are Ghu Kaku and our rating is 4 and our price category is $$", test1.toString());
    }

    @Test public void testRestaurantAddReview() {
        Restaurant res1 = new Restaurant("Ghu Kaku", 4, "$$");
        res1.addReview(new Review("good food", "Chelsea", 5));

        Review first = new Review("good food", "Chelsea", 5);
        res1.addReview(first);

        Review second = new Review("ok food", "Lindsey", 2);
        res1.addReview(second);

        Review third = new Review("great food", "Shawn", 3);
        res1.addReview(third);

        Review fourth = new Review("horrible food", "Choosy", 1);
        res1.addReview(fourth);

        assertEquals(3, res1.numOfStars);
    }

}
