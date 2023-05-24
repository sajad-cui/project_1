package Contoroller;

//import Model.Store.Products;

import Model.Store.Factore;
import Model.Store.Products;
import Model.Store.Score;
import Model.user.Buyer;
import view.UserPage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BuyerController {

    public static void BuyerControl(Buyer buyer) {

        //ArrayList<Products> Filter = new ArrayList<>(productsList);

        ArrayList<Products> Carts =Buyer.getCart();
        ArrayList<Buyer> buyersList;
        buyersList = Buyer.getBuyer();
        ArrayList<Factore> FactoresList = Buyer.getFactores();

        while (true) {
            UserPage.PrintMenu();
            short reqMenu = UserPage.scanMenu();

            if (reqMenu == 1) {
                UserPage.PrintInfo(buyer);
                short editMenu = UserPage.scanMenu();

                if (editMenu == 1) buyer.setEmail(SignUpController.createEmail(buyersList));

                else if (editMenu == 2) buyer.setPhoneNumber(SignUpController.createPhoneNumber(buyersList));

                else if (editMenu == 3) buyer.setPassword(SignUpController.createPassword());
            }

            if (reqMenu == 2) ProductsController.products(buyer);


            if (reqMenu == 3) {
                while (true) {
                    boolean x = false;
                    for (int i = 0; i < Carts.size(); i++)
                        UserPage.PrintCart(Carts.get(i), i);

                    UserPage.PrintBuy();

                    short Cart = UserPage.scanCart();

                    if (Cart >= 1 && Cart <= Carts.size()) {
                        UserPage.PrintProduct(Carts.get(Cart - 1));

                    }
                    if (Cart < 0) Carts.remove(-1 * Cart - 1);

                    else if (Cart == 0) {
                        while (true) {
                            double sumBuyMony = 0;
                            for (Products cart : Carts) sumBuyMony = cart.getPrice();

                            if (sumBuyMony > buyer.getCredential()) {
                                UserPage.PrintWrongcredit();
                                short Wongcredit = UserPage.scanWrongcredit();
                                if (Wongcredit == 1) break;
                                else if (Wongcredit == 2) {
                                    buyer.setCredential(creditIncrease(buyer));

                                }
                            } else {
                                FactoresController.createFactore();
                                Carts.clear();
                                x = true;
                                UserPage.printBuy();
                                break;
                            }

                        }
                        if (x) break;
                    }

                }


            }


            if (reqMenu == 4) buyer.setCredential(creditIncrease(buyer));


            if (reqMenu == 5) {
                for (int i = 0; i < FactoresList.size(); i++)
                    UserPage.PrintFactores(FactoresList.get(i), i);

                short factore = UserPage.scanFactore();
                UserPage.PrintBuys(FactoresList.get(factore - 1));

                short buy = UserPage.scanBuy();
                UserPage.PrintProduct(FactoresList.get(factore - 1).getBuys().get(buy - 1));

                UserPage.printScore();
                short Score = UserPage.scanScore();
                if (Score == 1) {
                    UserPage.PrintScore();
                    double score = UserPage.scanScore();
                    Score scores = new Score(FactoresList.get(factore - 1).getBuys().get(buy - 1), buyer, score);
                    Products.setScore(scores);
                    Products.setNumnersBuy(Products.getNumnersBuy() + 1);
                    Products.setAverageScore((Products.getAverageScore() * Products.getNumnersBuy() + scores.getScore()) / Products.getNumnersBuy());
                    UserPage.scorePrint();
                }

            }

        }

    }

    public static double creditIncrease(Buyer buyer) {
        
        double credetial = buyer.getCredential();
        UserPage.PrintIncreas();
        double InCreditial = UserPage.scanIncrement();

        while (true) {
            UserPage.PrintCartNumber();
            String CartNumber;
            CartNumber = UserPage.scanCartNumber();


            Pattern pattern = Pattern.compile("^\\d{4} \\d{4} \\d{4} \\d{4}$");
            Matcher matcher = pattern.matcher(CartNumber);
            if (matcher.find()) break;

        }
        while (true) {

            UserPage.PrintCVV2();
            String CVV2 = UserPage.scanCVV2();
            Pattern pattern = Pattern.compile("^\\d{4}$");
            Matcher matcher = pattern.matcher(CVV2);
            if (matcher.find()) break;

        }
        while (true) {

            UserPage.PrintPasCart();
            String PasCart = UserPage.scanPasCart();
            Pattern pattern = Pattern.compile("^\\d\\d{3}$");
            Matcher matcher = pattern.matcher(PasCart);
            if (matcher.find()) break;

        }

        credetial += InCreditial;
        return credetial;


    }


}

















