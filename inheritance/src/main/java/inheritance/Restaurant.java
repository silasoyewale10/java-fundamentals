package inheritance;

import java.util.LinkedList;
import java.util.Scanner;

public class Restaurant {
    String name;
    int numOfStars;
    String priceCategory;
    LinkedList<Review>reviews = new LinkedList<>();

    public Restaurant(String name, int stars, String priceCategory) {
        this.name = name;
        this.numOfStars = stars;
        this.priceCategory = priceCategory;
    }
    public String toString(){
        return "We are " + this.name + " and our rating is " + this.numOfStars + " and our price category is " + this.priceCategory;
    }
    public double addReview (Review review){
        int totalStars = 0;
        this.reviews.add(review);  //the review for this restaurant has been added to the linkedlist of the restaurants.
       for(Review rev: reviews){
           totalStars+=rev.numOfStars;
       }
       this.numOfStars = totalStars/reviews.size();
       return this.numOfStars;
    }
}
