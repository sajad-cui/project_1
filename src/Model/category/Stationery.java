package Model.category;

import Model.Store.Products;

public class Stationery extends Products {


    private String country;

    public Stationery(String country, String name, double price, short inventory, String productID, double averageScore, Category category) {
        super(productID, name, price, inventory, averageScore, category);
        this.country = country;
    }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }
}

