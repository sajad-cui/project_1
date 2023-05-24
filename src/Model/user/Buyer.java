package Model.user;
import Model.Store.Factore;
import Model.Store.Products;

import java.util.*;

public class Buyer extends User{
    private double credential ;
    private static ArrayList<Products> Cart = new ArrayList<>();
    private static ArrayList<Factore> Factores = new ArrayList<>();


    public Buyer(double credential , String username, String email , String password , String phoneNumber ){
        super(  username, email, password, phoneNumber);
        this.credential = credential;
    }



    public double getCredential(){
        return credential;
    }

    public void setCredential(double credential){
        this.credential = credential;
    }

    public static ArrayList<Products> getCart() {
        return Cart;
    }


    public static ArrayList<Factore> getFactores() { return Factores; }

    public void setCart(ArrayList<Products> cart) {
        Cart = cart;
    }

    public void setFactores(ArrayList<Factore> factores) {
        Factores = factores;
    }





}
