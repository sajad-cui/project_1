package Model.category;

import Model.Store.Products;

import java.util.ArrayList;

public class Vehicles extends Products {

    private String CompanyName;

    public Vehicles(String CompanyName, String name, double price, short inventory, String productID, double averageScore, Products.Category category) {
        super(productID, name, price, inventory, averageScore, category);
        this.CompanyName = CompanyName;
    }


    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

}
