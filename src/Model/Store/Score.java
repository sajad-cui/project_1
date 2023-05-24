package Model.Store;

import Model.user.Buyer;

public class Score {

    private double numbers =0 ;
    private Products product;
    private Buyer buyer;
    private double score;

    public Score(Products product,Buyer buyer,double score){
        this.product = product;
        this.buyer = buyer;
        this.score = score;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public double getNumbers() { return numbers; }

    public void setNumbers(double numbers) { this.numbers = numbers; }

}
