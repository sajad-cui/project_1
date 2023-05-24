package view;

import Model.Store.Comment;
import Model.Store.Products;
import java.util.*;
public class ProductsView {

static Scanner scan = new Scanner(System.in);

    public static void PrintProducts(Products product, short page) {
        System.out.println("["+(page+1) + "] : "+ product.getName() +" , price :" + product.getPrice()+  "\n" +"Average Score : " + Products.getAverageScore() + " , inventory : "+ product.getInventory()+ "\n" +"Product ID : " + product.getProductID());
    }

    public static void PrintProduct(Products product){
        System.out.println("Category : " + product.getCategory());
        System.out.println("Product Name : " + product.getName());
        System.out.println("Price : " + product.getPrice());
        System.out.println("Product ID : " + product.getProductID());
        System.out.println("Inventory : " + product.getInventory());
        System.out.println("Average Score : " + Products.getAverageScore());

    }

public static void PrintNextLastPage(int page){
    System.out.println("[0] : Filter ");
    System.out.println("[+] : nextPage");
    if(page>0)
     System.out.println("[-] : previousPage");
}

public static void PrintFilters(){
    System.out.println("[1] : Categories");
    System.out.println("[2] : General Property");
    System.out.println("[3] : search");
}

public static void PrintSearch(){ System.out.print("search : "); }

    public static String scanSearch(){ return scan.next(); }

public static short scanFilterType(){ return scan.nextShort();}

public static String getPage_product(){ return scan.next(); }

public static void PrintWrong(){ System.out.println("Wrong answer,Try again "); }

    public static void PrintGeneralProp(){
        System.out.println("[1] : price");
        System.out.println("[2] : averageScore");
        System.out.println("[3] : Available");
    }

    public static void PrintMinPrice(){
        System.out.print("Minimum Price :");
    }

    public static void PrintMaxPrice(){
        System.out.print("Maximum Price :");
    }

    public static void PrintMinAverage(){
        System.out.print("Minimum Average :");
    }
    public static double scanMinPrice(){ return scan.nextDouble(); }
    public static double scanMaxPrice(){ return scan.nextDouble(); }

    public static double scanMinAverage(){ return scan.nextDouble(); }

    public static Short scanGeneralProp(){ return scan.nextShort(); }



    public static void PrintCategoryFilter(){
        System.out.println("[1] : Vehicle ");
        System.out.println("[2] : Digatalgoods");
        System.out.println("[3] : Edible");
        System.out.println("[4] : Stationery ");
    }

    public static void PrintVehicleFilter(){
        System.out.println("[1] : Cars");
        System.out.println("[2] : Bikes");
    }
    public static void PrintDigitalGoodsFilter(short StorageTools){

        if(StorageTools==0) {
            System.out.println("[1] : StorageTools");
            System.out.println("[2] : Computer");
        }
        else if(StorageTools == 1||StorageTools==2){
            System.out.println("[1] : Memory");
            System.out.println("[2] : SSD");
        }




    }
    public static void PrintEdibleFilter(){
        System.out.println();


    }
    public static void PrintStationeryFilter(){

        System.out.println("[1] : Pen");
        System.out.println("[2] : NoteBook");
        System.out.println("[3] : Pencell");

    }

public static void PrintDeletFilter(){
    System.out.println("[-1] : delete the filters");
}
    public static short scanStationeryFilter(){ return scan.nextShort(); }
    public short scanEdibleFilter(){ return scan.nextShort(); }

    public static short scanDigitalGoodsFilter(){ return scan.nextShort(); }
    public static short scantVehicleFilter(){ return scan.nextShort(); }

    public static short scanCategoryFilter(){ return  scan.nextShort(); }

    public static short scanStorageTools(){ return scan.nextShort(); }


    public static void PrintCart_comment(){
        System.out.println("[1] : Add to Cart ");
        System.out.println("[2] : view Comment");
    }
    public static short scanCart_comment(){ return scan.nextShort() ;}
    public static void PrintView(Comment comment ){ System.out.println(comment); }

}






