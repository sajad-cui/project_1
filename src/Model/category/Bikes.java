package Model.category;

import Model.Store.Products;
public class Bikes extends Vehicles {

    public enum BikeType  {MOUNTAINOUS ,ROADS ,URBAN,HYBRID}
    private BikeType bikeType;

    public Bikes( BikeType bikeType , String CompanyName , String name, double price,short inventory,String productID , double averageScore , Products.Category category ){
        super(CompanyName, name, price, inventory,productID, averageScore,category);
      this.bikeType = bikeType;
    }


    public BikeType getBike() {
        return bikeType;
    }


    public void setBike(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    public BikeType getBikeType() { return bikeType; }

    public void setBikeType(BikeType bikeType) { this.bikeType = bikeType; }
}