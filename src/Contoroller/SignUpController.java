package Contoroller;

import Model.user.Buyer;
import sun.applet.Main;
import view.Accepts;
import view.SignUp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SignUpController {


//SignInController(){};

    public static void signUp() {
        // SignUp signUp = new SignUp();

//        Buyer buyer = new Buyer(0, "0", "sajadshekari@gmail.com", "@Aa4282", "09051855867");

        ArrayList<Buyer> buyersList = Buyer.getBuyer();

        buyersList.add(new Buyer(0, "0", "sajadshekari@gmail.com", "@Aa", "09051855867"));
        buyersList.add(new Buyer(0, "0", "sajadshekari@gmail.com", "@Aa4282", "09051855867"));

        String UserName = createUserName(buyersList);
        String email = createEmail(buyersList);
        String phoneNumber = createPhoneNumber(buyersList);
        String password = createPassword();
        AcceptController.getAcceptsBuyer().add(new Buyer(0, UserName, email, password, phoneNumber));
        AcceptController.getAcceptsBuyer().add(new Buyer(0, UserName, email, password, phoneNumber));


        SignUp.PrintAccept();
    }

    public static String createUserName(ArrayList<Buyer> buyersList) {
        //scanUserName
        String UserName;
        while (true) {
            SignUp.PrintUserName();
            UserName = SignUp.scanUserName();
            // buyers = buyer.getBuyer();

            boolean x = true;
            for (int i = 0; i < buyersList.size(); i++) {
                if (buyersList.get(i).getUsername().compareTo(UserName) == 0) {
                    x = false;
                    break;
                }
            }
            if (x)
                break;
            SignUp.PrintRepetitious(UserName);
            x = true;

        }

        return UserName;
    }

    public static String createEmail(ArrayList<Buyer> buyersList) {
        //scanEmail
        String email;
        while (true) {
            SignUp.PrintUserEmail();
            email = SignUp.scanEmail();
            Pattern pattern = Pattern.compile("^(\\D)+@gmail.com$");
            Matcher matcher = pattern.matcher(email);

            boolean x = true;
            for (Buyer buyer : buyersList) {
                if (buyer.getEmail().compareTo(email) == 0) {
                    x = false;
                    break;
                }
            }

            if (matcher.find() && x)
                break;
            if (!x)
                SignUp.PrintRepetitious("email");
            else SignUp.PrintWrong();

            x = true;

        }
        return email;
    }

    public static String createPhoneNumber(ArrayList<Buyer> buyersList) {
        String phoneNumber;
        while (true) {
            SignUp.PrintUserPhone();
            phoneNumber = SignUp.scanPhoneNumber();
            Pattern pattern = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern.matcher(phoneNumber);

            boolean x = true;
            for (Buyer buyer : buyersList) {
                if (buyer.getPhoneNumber().compareTo(phoneNumber) == 0) {
                    x = false;
                    break;
                }
            }

            if (matcher.find() && x)
                break;
            if (!x)
                SignUp.PrintRepetitious("Phone number");
            else SignUp.PrintWrong();

            x = true;


        }

        return phoneNumber;
    }

    public static String createPassword() {
        String password;
        while (true) {
            SignUp.PrintPassword();
            password = SignUp.scanPassword();
            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.find())
                break;
            SignUp.PrintWrong();
        }
        return password;
    }


}
