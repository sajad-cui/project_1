package view;
import Model.user.*;
import java.util.*;
public class LogIn {
    static Scanner scan = new Scanner(System.in);

    public static void PrintWrong(){ System.out.println("UserName or Password is wrong,Try again"); }

    public static void PrintUserName(){
        System.out.print("enter your userName :");
    }

    public static void PrintPassword(){
        System.out.print("enter your password :");
    }

    public static String scanUserName(){
        return scan.next();
    }

    public static String scanPassword(){
        return scan.next();
    }

}
