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

    @Test public void testShopToString() {
        Shop test1 = new Shop("Burger King", "Not too bad", 4);
        assertEquals("We are Burger King and our rating is 4 and we can be described as Not too bad", test1.toString());
    }

    @Test public void testShopAddReview() {
        Shop res1 = new Shop("Ghu Kaku", "Aint bad", 5);
        res1.addReview(new Review("good food", "Chelsea", 3));

        Review first = new Review("good food", "Chelsea", 5);
        res1.addReview(first);
        System.out.println(res1.numOfStars);
        assertEquals(4,res1.numOfStars);
    }
    @Test public void testTheaterAddMovie( ){
        Theater amc = new Theater("amc");
        Movie obj = new Movie("Lionking");
        amc.addMovie(obj);
        amc.addMovie(new Movie("Dracula"));
        amc.addMovie(new Movie("Hakuna Matata"));
        amc.addMovie(new Movie("Silas is King"));
        System.out.println("hfhfdhfhj" + amc.printMovies());
        assertEquals(" Lionking Dracula Hakuna Matata Silas is King",amc.printMovies());
    }

    @Test public void testTheaterRemoveMovie( ){
        Theater amc = new Theater("amc");
        Movie obj1 = new Movie("Lionking");
        amc.addMovie(obj1);

        Movie obj2 = new Movie("Dracula");
        amc.addMovie(obj2);

        Movie obj3 = new Movie("Hakuna Matata");
        amc.addMovie(obj3);

        Movie obj4 = new Movie("Silas is King");
        amc.addMovie(obj4);

        amc.removeMovie(obj1);
        amc.removeMovie(obj2);

        System.out.println("hfhfdhfhj" + amc.moviesShowing);
        assertEquals("[Hakuna Matata, Silas is King]",amc.moviesShowing.toString());
    }

    @Test public void testTheaterJustAsReviewableAsRestaurant( ) {
        Theater amc  = new Theater("AMC");

        amc.addReview(new Review("Horrible seats", "Jesse", 2));
        amc.addReview(new Review("Great scenery", "Lukaku", 5));
        amc.addReview(new Review("Late", "Dinho", 3));
        amc.addReview(new Review("Dirty", "Ataoja", 3));
        amc.addReview(new Review("Not friendly", "Manner", 2));

        assertEquals(3, amc.numOfStars);
    }
}
