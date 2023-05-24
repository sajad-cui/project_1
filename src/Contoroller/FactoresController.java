package Contoroller;

import Model.Store.Factore;
import Model.Store.Products;
import Model.user.Buyer;

import java.util.ArrayList;

public abstract class FactoresController {


    public static void createFactore() {
        ArrayList<Products> products = Products.getProducts();
        ArrayList<Factore>  FactoresList = Buyer.getFactores();
        ArrayList<Products> Carts = new ArrayList<>(Buyer.getCart());
        String FactoreID = "";
        double money = 0;
        for (Products cart : Carts) FactoreID += cart.getProductID();
        for (Products cart : Carts) money += cart.getPrice();

      //  ArrayList<Products>carts = new ArrayList<>(Carts);

        FactoresList.add(new Factore(Carts, FactoreID, money));

        for (int i = 0; i < products.size(); i++)
            for (int j = 0; j < FactoresList.size(); j++)
                if (FactoresList.get(j).getFactoreID().compareTo(products.get(i).getProductID()) == 0)
                    products.get(i).setInventory((short) (products.get(i).getInventory() - 1));


    }


}
