package Model.category;

import java.util.ArrayList;

public class Pen extends Stationery {
    private ArrayList<Pen> pensList = new ArrayList<Pen>();
    private String color;

    public Pen(String color, String name, String country, double price, short inventory, String productID, double averageScore, Category category) {
        super(country, name, price, inventory, productID, averageScore, category);
        this.color = color;
    }

    public ArrayList<Pen> getPensList() { return pensList; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public void setPensList(ArrayList<Pen> pensList) { this.pensList = pensList; }

}
