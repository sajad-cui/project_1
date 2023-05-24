package view;
import Contoroller.Controller;
import Model.Store.Factore;
import Model.Store.Products;
import Model.user.Buyer;

import java.util.*;
public class UserPage {

  static Scanner scan = new Scanner(System.in);

 public static void PrintStart() {
     System.out.println("Welcome to thr largest online store in the  country.");
     System.out.println("Please enter your role ");
     System.out.println("[1] : Buyer ");
     System.out.println("[2] : Admin ");
  }

  public static void PrintRequest() {
      System.out.println("What do you want to do ?");
      System.out.println("[1] : sign up");
      System.out.println("[2] : log in");
      System.out.println("[3] : View products");
  }

    public static void PrintAgain(){ System.out.println("Try again"); }

    public static short scanRole() {
     return scan.nextShort();
}

    public static short scanRequest(){ return scan.nextShort(); }



    public static void PrintMenu(){
        System.out.println("[1] : view your information and edit them ");
        System.out.println("[2] : viewing the products");
        System.out.println("[3] : viewing the shopping cart and completing the purchase process");
        System.out.println("[4] : increase account credit");
        System.out.println("[5] : Display purchase history(Factores)");


    }

    public static short scanMenu() { return  scan.nextShort(); }


        public static void PrintInfo(Buyer buyer) {

            System.out.println("Username : " + buyer.getUsername() );
            System.out.println("Credential : "+buyer.getCredential());
            System.out.println("[0] : out ");
            System.out.println("[1] : Email : " + buyer.getEmail() );
            System.out.println("[2] : Phone Number : " + buyer.getPhoneNumber());
            System.out.println("[3] : Password : " + buyer.getPassword());
    }

    public static void PrintCart(Products Cart,int i){
        System.out.println("[" + (i+1) + "] : " +Cart.getClass().getSimpleName()+ " , " + Cart.getName()+" , " + Cart.getProductID() + "if you want to remove this product enter : ["+ -(i+1) + "]" );
    }

    public static void PrintBuy(){
        System.out.println("[0] : takmil faraian kharid");
    }

    public static short scanCart(){ return scan.nextShort(); }

        public static void PrintProduct(Products product){
            System.out.println("Category : " + product.getCategory());
            System.out.println("Product Name : " + product.getName());
            System.out.println("Price : " + product.getPrice());
            System.out.println("Product ID : " + product.getProductID());
            System.out.println("Inventory : " + product.getInventory());
            System.out.println("Average Score : " + Products.getAverageScore());

        }





    public static void PrintIncreas(){
        System.out.print("enter mony to increase credintial : ");
    }
    public static double scanIncrement(){ return scan.nextDouble(); }

    public static void PrintCartNumber(){ System.out.print("your cart number :"); }

    public static void PrintPasCart(){ System.out.print("your password cart`s :"); }
    public static void PrintCVV2(){ System.out.print("your CVV2 :"); }


    public static String scanCartNumber(){ return scan.nextLine(); }

    public static String scanPasCart(){ return scan.next(); }

    public static String scanCVV2(){ return scan.next(); }

    public static void PrintWrongcredit(){
        System.out.println("creditial is wrong  ");
        System.out.println("[1] : exit ");
        System.out.println("[2] : increas credit" );
    }
    public static short scanWrongcredit(){ return scan.nextShort(); }


    public static void PrintFactores(Factore factore,int x) { System.out.println( "["+(x+1)+"]"+"Factore ID : " + factore.getFactoreID()+ " " + "sub product Price : " +factore.getMoney()); }
    public static short scanFactore(){ return scan.nextShort();}


    public static void PrintBuys(Factore factore){
        for (int i = 0; i < factore.getBuys().size(); i++)
            System.out.println("["+(i+1)+"]"+factore.getBuys().get(i).getClass().getSimpleName() + ", product name : " + factore.getBuys().get(i).getName() + ", product Price : " + factore.getBuys().get(i).getPrice());
    }
    public static short scanBuy(){ return scan.nextShort();}

    public static void printBuy( ){
        System.out.println("done");
    }

    public static void printScore( ){
        System.out.println("[1] : score");
        System.out.println("[2] : exit");
    }

    public static short scanScore(){return scan.nextShort(); }

    public static void PrintScore(){ System.out.println("enter the Score"); }
    public static void scorePrint(){ System.out.println("the Score is updated"); }


    public static void PrintText(){
        System.out.println("Print the Text");
    }

    public static String scanText(){ return scan.nextLine(); }

    public static void PrintReqCom(){
        System.out.println("[1] : view");
        System.out.println("[2] : new Comment");
    }
    public static short scanReqCom(){ return scan.nextShort(); }




}
