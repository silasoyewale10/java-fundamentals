package inheritance;

import java.util.LinkedList;

public class Shop {
    String name;
    String description;
    int numDollarSigns;
    int numOfStars;
    LinkedList<Review> reviews = new LinkedList<>();


    public Shop(String name, String description, int numDollarSigns) {
        this.name = name;
        this.description = description;
        this.numDollarSigns = numDollarSigns;
    }
    public String toString(){
        return "We are " + this.name + " and our rating is " + this.numDollarSigns + " and we can be described as " + this.description;
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
