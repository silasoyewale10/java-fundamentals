package inheritance;

import java.util.LinkedList;

public class Movie {
    String name;
    int numOfStars;
    LinkedList<Review> reviews = new LinkedList<>();

    public Movie(String name) {
        this.name = name;
    }
    public String toString(){
        return this.name;
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
