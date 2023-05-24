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

   

}
