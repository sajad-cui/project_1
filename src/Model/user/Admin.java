package Model.user;
import Model.user.*;

public class Admin extends User{
    private static Admin admin = null;

    public Admin( String username, String email , String password , String phoneNumber ){
        super(  username, email, password, phoneNumber);
    }

    public static Admin getAdmin(String username, String email , String password , String phoneNumber) {
        if (admin == null)
            admin = new Admin("admin", "admin", "admin", "admin");
        return admin;
    }

    public static Admin getAdmin() { return admin; }


//public static Admin getAdmin() { return admin; }







}


