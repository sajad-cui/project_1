//Contoller
package Contoroller;
//import Model.Products;

import Model.Store.Comment;
import Model.Store.Factore;
import Model.user.Buyer;
import Model.user.User;
import view.UserPage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Model.Store.Products;
import Model.category.*;

public abstract class Controller {

    public static void start() {


        ArrayList<Products> Carts;
        Carts = Buyer.getCart();
        ArrayList<Products> productsList = Products.getProducts();
        ArrayList<Buyer> buyersList= User.getBuyer();
        ArrayList<Factore> FctoresList;
        FctoresList = Buyer.getFactores();



        Buyer buyer = new Buyer(2,"1","1","1","1");
        Comment comment = new Comment(buyer,"1","jhvhb",true,Comment.Commentvaseiation.darentezar);
        Comment comment1 = new Comment(buyer,"2","sajad",false,Comment.Commentvaseiation.darentezar);
        Buyer buyer1 = new Buyer(2,"2","1","1","1");
        Buyer buyer2 = new Buyer(2,"3","1","1","1");

        AcceptController.getAcceptComments().add(comment);
        AcceptController.getAcceptComments().add(comment1);
        AcceptController.getAcceptComments().add(comment1);
        AcceptController.getAcceptsBuyer().add(buyer);
        AcceptController.getAcceptsBuyer().add(buyer1);
        AcceptController.getAcceptsBuyer().add(buyer2);

        productsList.add(new Cars(1800, false, "IranKhodro", "405", 400000000, (short) 10, "IranKhodro405", 4, Products.Category.VEHICLES));
        productsList.add(new Bikes(Bikes.BikeType.HYBRID, "viva", "Berlin", 12000000, (short) 10, "vivaBerlin", 2, Products.Category.VEHICLES));
        productsList.add(new Computer("ryzen7", (short) 16, "Lenovo", 2.5, 15.6, 45000000, (short) 3, "Lenovoryzen716", 8, Products.Category.DIGITALGOODS));
        productsList.add(new Memory("3.1", "HP", 0.050, 0.05, 32, 150000, (short) 8, "HP3.1", 5.6, Products.Category.DIGITALGOODS));
        productsList.add(new SSD(84, 50, "mi", .5, .2, 2000, 2500000, (short) 13, "mi2000", 8.6, Products.Category.DIGITALGOODS));
        productsList.add(new Edible(new Date(2022, Calendar.JULY, 1), new Date(2023, Calendar.JULY, 1), "Hamberger", 35000, (short) 10, "Hamberger", 4.8, Products.Category.EDIBLE));
        productsList.add(new NoteBook((short) 100, "kaghaz", "faberCastel", "Iran", 20000, (short) 50, "faberCastel100", 3.5, Products.Category.STATIONERY));
        productsList.add(new Pen("block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));
        productsList.add(new Pencells(Pencells.PencellType.B, "block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));

        productsList.add(new Cars(1800, false, "IranKhodro", "405", 400000000, (short) 10, "IranKhodro405", 4, Products.Category.VEHICLES));
        productsList.add(new Bikes(Bikes.BikeType.HYBRID, "viva", "Berlin", 12000000, (short) 10, "vivaBerlin", 2, Products.Category.VEHICLES));
        productsList.add(new Computer("ryzen7", (short) 16, "Lenovo", 2.5, 15.6, 45000000, (short) 3, "Lenovoryzen716", 8, Products.Category.DIGITALGOODS));
        productsList.add(new Memory("3.1", "HP", 0.050, 0.05, 32, 150000, (short) 8, "HP3.1", 5.6, Products.Category.DIGITALGOODS));
        productsList.add(new SSD(84, 50, "mi", .5, .2, 2000, 2500000, (short) 13, "mi2000", 8.6, Products.Category.DIGITALGOODS));
        productsList.add(new Edible(new Date(2022, Calendar.JULY, 1), new Date(2023, Calendar.JULY, 1), "Hamberger", 35000, (short) 10, "Hamberger", 4.8, Products.Category.EDIBLE));
        productsList.add(new NoteBook((short) 100, "kaghaz", "faberCastel", "Iran", 20000, (short) 50, "faberCastel100", 3.5, Products.Category.STATIONERY));
        productsList.add(new Pen("block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));
        productsList.add(new Pencells(Pencells.PencellType.B, "block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));
        productsList.add(new Pencells(Pencells.PencellType.B, "block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));

        Carts.add(new Edible(new Date(2022, Calendar.JULY, 1), new Date(2023, Calendar.JULY, 1), "Hamberger", 35000, (short) 10, "Hamberger", 4.8, Products.Category.EDIBLE));

        Carts.add(new Pencells(Pencells.PencellType.B, "block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));

        //Buyer.getCart()
        Carts.add(new Pencells(Pencells.PencellType.B, "block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));
        Carts.add(new Pencells(Pencells.PencellType.B, "block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));
        Carts.add(new Pen("block", "FaberCastel", "China", 5000, (short) 12, "Fabercastelblock", 4.9, Products.Category.STATIONERY));
        FctoresList.add(new Factore(Carts, "2", 100));
        FctoresList.add(new Factore(Carts, "2", 2));
        FctoresList.add(new Factore(Carts, "8", 80));

        buyersList.add(buyer2);

    //    buyersList = Buyer.getBuyer();

        buyersList.add(new Buyer(40000000, "1", "sajadshekari@gmail.com", "@Aa", "09051855867"));
        buyersList.add(new Buyer(50, "0", "sajadshekari@gmail.com", "@Aaa", "09051855867"));


        UserPage.PrintStart();
        short role;
        while (true) {
            role = UserPage.scanRole();
            if (role == 1 || role == 2)
                break;
            UserPage.PrintAgain();
        }


        if (role == 2)
            LogInController.login(role);
        if (role == 1) {
            UserPage.PrintRequest();
            short request = UserPage.scanRequest();
            if (request == 1)
                SignUpController.signUp();
            if (request == 2)
                LogInController.login(role);
            if (request == 3)
                ProductsController.products(null);

        }


    }



}


