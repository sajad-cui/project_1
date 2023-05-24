package Model.category;
import Model.Store.Products;

import javax.xml.crypto.Data;
import java.util.*;
public class Edible extends Products {

    private ArrayList<Edible> edibleList = new ArrayList<>();
    private Date Production;
    private Date Expiration;
    public Edible(Date Production ,Date Expiration, String name, double price,short inventory,String productID  ,double averageScore ,Category category){
            super(productID, name, price, inventory, averageScore, category);
            this.Production = Production;
            this.Expiration = Expiration;
        }



    public ArrayList<Edible> getEdibleList() {
        return edibleList;
    }

    public Date getExpiration() {
        return Expiration;
    }

    public void setEdibleList(ArrayList<Edible> edibleList) {
        this.edibleList = edibleList;
    }

    public void setExpiration(Date expiration) {
        Expiration = expiration;
    }

    public void setProduction(Date production) {
        Production = production;
    }

    public Date getProduction() {
        return Production;
    }

}
