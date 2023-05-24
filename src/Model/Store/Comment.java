package Model.Store;

import Model.user.Buyer;

import java.util.ArrayList;

public class Comment {
    private static ArrayList<Comment> comments = new ArrayList<Comment>();
    private Buyer buyer;
    private String shenaseKala;
    private String comment;

    public enum Commentvaseiation {darentezar, taeidshode, taeidnashode}
    private Commentvaseiation comentVaseiat;

    private boolean buy;


    public Comment(Buyer buyer , String shenaseKala , String comment,boolean buy ,Commentvaseiation comentVaseiat){
        this.buy=buy;
        this.shenaseKala=shenaseKala;
        this.comment=comment;
        this.comentVaseiat=comentVaseiat;
    }



    public static ArrayList<Comment> getComments() {
        return comments;
    }

    public static void setComments(ArrayList<Comment> comment) {
        comments = comment;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isBuy() {
        return buy;
    }

    public String getShenaseKala() {
        return shenaseKala;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    public void setShenaseKala(String shenaseKala) {
        this.shenaseKala = shenaseKala;
    }


}
