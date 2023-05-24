package Model.category;

import Model.Store.Products;

public class DigatalGoods extends Products {
   private double weight;
   private double dimensions;

    public DigatalGoods( double weight, double dimensions , String name , double price,short inventory,String productID ,double averageScore ,Category category ){
        super(productID, name, price, inventory, averageScore, category);
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public double getDimensions() { return dimensions; }

    public double getWeight() { return weight; }

    public void setDimensions(double dimensions) { this.dimensions = dimensions; }

    public void setWeight(double weight) { this.weight = weight; }


}

