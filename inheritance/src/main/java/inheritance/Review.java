package inheritance;

public class Review extends Restaurant {
    //defaults contructor calls Restaurant
    String body;
    String author;
    int numOfStars;

    public Review (String body, String author, int numOfStars, String name, int stars, String priceCategory) {
        super(name, stars, priceCategory);
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    public String toString (){
        return "welcome !!. Our review is " + this.numOfStars + " and was generated by " + this.author;
    }
}
