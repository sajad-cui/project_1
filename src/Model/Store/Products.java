package Model.Store;

import Model.category.Cars;

import java.util.*;

public class Products {
    public enum Category {DIGITALGOODS, STATIONERY, VEHICLES, EDIBLE}
    private  static ArrayList<Products>products = new ArrayList<Products>();
    ArrayList<Comment> commentList = new ArrayList<>();
    ArrayList<Score> scoreList = new ArrayList<>();
    private String productID;
    private String name;
    private double price;
    private short inventory; //موجودی
    private static double averageScore;
    private Category category;
    private static double numnersBuy =0;
    private static Score scores;



    public Products(String productID , String name , double price,short inventory,double averageScore ,Category category){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        Products.averageScore = averageScore;
        this.category = category;
    }


    public static void setProducts(ArrayList<Products> product) { Products.products = product; }

    public void setProductID(String productID) { this.productID = productID; }

    public void setName(String name) { this.name = name; }

    public void setPrice(double price) { this.price = price; }

    public void setInventory(short inventory) { this.inventory = inventory; }

    public static void setAverageScore(double averageScore) { Products.averageScore = averageScore; }

    public void setCategory(Category category) { this.category = category; }



    public static ArrayList<Products> getProducts() { return products; }


    public String getProductID() { return productID; }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public short getInventory() { return inventory; }

    public static double getAverageScore() { return averageScore; }

    public Category getCategory() { return category; }


    public ArrayList<Comment> getCommentList() {
        return commentList;
    }

    public ArrayList<Score> getScoreList() { return scoreList; }

    public void setCommentList(ArrayList<Comment> commentList) {
        this.commentList = commentList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }


    public static double getNumnersBuy() { return numnersBuy; }

    public static void setNumnersBuy(double numnersBuy) { Products.numnersBuy = numnersBuy; }

    public static Score getScores() { return scores; }

    public static void setScore(Score scores) { Products.scores = scores; }

}
