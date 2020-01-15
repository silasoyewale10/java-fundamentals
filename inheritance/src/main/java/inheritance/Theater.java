package inheritance;

import java.util.LinkedList;

public class Theater {
    String name;
    int numOfStars;
    LinkedList<Review>reviews = new LinkedList<>();
    LinkedList<Movie> moviesShowing = new LinkedList<>();

    public Theater(String name) {
        this.name = name;
    }
    public void addMovie(Movie name){
        this.moviesShowing.add(name);
    }
    public void removeMovie(Movie name){
        this.moviesShowing.remove(name);
    }
    public String printMovies(){
        String allMoviesShowing = "";
        for(Movie mov: moviesShowing){
            allMoviesShowing += " " + mov;
        }
        return allMoviesShowing;
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
