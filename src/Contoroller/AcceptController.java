package Contoroller;

import Model.Store.Comment;
import Model.user.Buyer;

import java.util.ArrayList;

public abstract class AcceptController {
   private static ArrayList<Comment> acceptComments = new ArrayList<Comment>();
   private static ArrayList<Buyer> acceptsBuyer = new ArrayList<Buyer>();








    public static ArrayList<Buyer> getAcceptsBuyer() {
        return acceptsBuyer;
    }

    public void setAcceptComments(ArrayList<Comment> acceptComment) {
        acceptComments = acceptComment;
    }

    public void setAcceptsBuyer(ArrayList<Buyer> acceptsBuyers) {
        acceptsBuyer = acceptsBuyers;
    }

    public static  ArrayList<Comment> getAcceptComments() {
        return acceptComments;
    }
}
