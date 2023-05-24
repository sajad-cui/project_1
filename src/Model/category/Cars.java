package Model.category;

import Model.Store.Products;
import java.util.ArrayList;
public class Cars extends Vehicles {
   private boolean auto ;
   private double CC ;

    public Cars( double CC , boolean auto , String CompanyName , String name, double price,short inventory,String productID , double averageScore , Products.Category category ){
        super(CompanyName, name, price, inventory,productID, averageScore,category);
        this.CC=CC;
        this.auto=auto;
    }

    public void setCC(double CC) {
        this.CC = CC;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }


    public boolean isAuto() {
        return auto;
    }

    public double getCC() {
        return CC;
    }

}