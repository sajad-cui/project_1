package Model.user;


import java.util.ArrayList;

public class User {
    private final String username;
    private String email;
    private String password;
    private String phoneNumber;
    private static ArrayList<Buyer> buyers =new ArrayList<>();

    public User(String username1, String email, String password, String phoneNumber) {
        this.username = username1;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public static ArrayList<Buyer> getBuyer(){
        return buyers;
    }

    public static void setBuyer(ArrayList<Buyer> buyer) {
        buyers = buyer;
    }


    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { this.password = password; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void setUsername(String username) { username = username; }

    public String getEmail() { return email; }

    public String getPhoneNumber() { return phoneNumber; }

    public String getPassword() { return password; }

    public String getUsername() { return username; }

}
