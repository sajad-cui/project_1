package Contoroller;

import Model.Store.Comment;
import Model.Store.Factore;
import Model.Store.Products;
import Model.user.Buyer;
import view.Accepts;
import view.SignUp;
import view.UserPage;

import java.util.ArrayList;

public abstract class CommentController {


public static void CreateComment( Buyer buyer,Products product){



    String productID = product.getProductID();

    UserPage.PrintText();

    String Text = UserPage.scanText();
    Text = UserPage.scanText();

    boolean buy = false;

    ArrayList<Factore> FactoresList = new ArrayList<>(Buyer.getFactores());

    for (int i = 0; i < FactoresList.size(); i++)
        for(int j = 0; j < FactoresList.get(i).getBuys().size(); j++)
            if (FactoresList.get(i).getBuys().get(j).getProductID().compareTo(product.getProductID()) == 0) {
                buy = true;
                break;
            }

    System.out.println(buy);

  //  Comment comment = new Comment(Buyer,product.getProductID(),Text,x, Comment.Commentvaseiation.darentezar);




   AcceptController.getAcceptComments().add(new Comment(buyer,product.getProductID(),Text,buy, Comment.Commentvaseiation.darentezar));



}







}
