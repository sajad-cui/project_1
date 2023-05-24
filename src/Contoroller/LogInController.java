package Contoroller;

import Model.user.Admin;
import Model.user.Buyer;
import view.AdminView;
import view.LogIn;
import java.util.ArrayList;

public abstract class LogInController {

    public static void login(short role) {
        ArrayList<Buyer> buyersList;
        buyersList= Buyer.getBuyer();
        if (role == 2)
            while (true) {
                boolean x = true;
                LogIn.PrintUserName();
                String userName = LogIn.scanUserName();
                if (Admin.getAdmin(null,null,null,null ).getUsername().compareTo(userName) != 0)
                    x = false;
                LogIn.PrintPassword();
                String password = LogIn.scanPassword();
                if (Admin.getAdmin(null,null,null,null).getPassword().compareTo(password) != 0)
                    x = false;

                if (x) {
                    AdminView.start();
                    break;
                }
                else {
                    LogIn.PrintWrong();
                  //  x = true;
                }
            }
        else if (role == 1) {
            while (true) {
                LogIn.PrintUserName();
                String userName = LogIn.scanUserName();
                LogIn.PrintPassword();
                String password = LogIn.scanPassword();
                boolean x = false;

                for (int i = 0; i < buyersList.size(); i++)
                    if (buyersList.get(i).getUsername().compareTo(userName) == 0 && buyersList.get(i).getPassword().compareTo(password) == 0) {
                        new Buyer(buyersList.get(i).getCredential(),buyersList.get(i).getUsername(),buyersList.get(i).getEmail(),buyersList.get(i).getPassword(),buyersList.get(i).getPhoneNumber());
                        BuyerController.BuyerControl(buyersList.get(i));
                        x = true;
                        break;
                    }
                if (x)
                    break;
                //x = false;
                LogIn.PrintWrong();
            }







        }




    }


}
