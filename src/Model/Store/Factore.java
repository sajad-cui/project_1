package Model.Store;


import java.util.ArrayList;
import java.util.Date;

public class Factore {

    private ArrayList<Products> buys ;
    private String FactoreID ;
    private Date date ;
    private double Money ;

    public Factore( ArrayList<Products> buy,String FactoreID,double Money){
        this.FactoreID = FactoreID;
        buys = buy;
        this.Money=Money;
    }


    public  ArrayList<Products> getBuys() { return buys; }

    public Date getDate() {
        return date;
    }

    public double getMoney() {
        return Money;
    }

    public String getFactoreID() {
        return FactoreID;
    }

    public void setBuys(ArrayList<Products> buys) {
        this.buys = buys;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMoney(double money) {
        Money = money;
    }

    public void setFactoreID(String FactoreID) {
        this.FactoreID = FactoreID;
    }

}
