package inheritance;

import java.util.Scanner;

public class Restaurant {
    String name;
    int numOfStars;
    String priceCategory;

    public Restaurant(String name, int stars, String priceCategory) {
        this.name = name;
        this.numOfStars = stars;
        this.priceCategory = priceCategory;
    }
    public String toString(){
        return "We are " + this.name + " and our rating is " + this.numOfStars + "and our proce category is " + this.priceCategory;
    }
    public void addReview (Review review){
//        review = new Review();
        this.getReview();
    }
    public double getReview(){
        int customerCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please what are you rating this restaurant between 0 and 5?");
        int rating = input.nextInt();
        this.numOfStars += rating;
        customerCount++;
        return numOfStars/customerCount;
    }
}
