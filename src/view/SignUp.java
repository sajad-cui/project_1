package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;

public class SignUp {
   static Scanner scan = new Scanner(System.in);



    public static void PrintUserName() { System.out.print("enter your User Name :"); }

    public static void PrintUserEmail() { System.out.print("enter your email address :"); }

    public static void PrintUserPhone() { System.out.print("enter your phone Number :"); }

    public static void PrintPassword() { System.out.print("enter your password :"); }

    public static void PrintAccept() { System.out.print("your request has been sent to the admin");}

    public static void PrintRepetitious(String name){ System.out.println("This " + name + " is Repetitious,Try Again"); }

    public static void PrintWrong(){ System.out.println("The entered format is Wrong,Try Again"); }

    public static String scanUserName() { return scan.next(); }

    public static String scanEmail() { return scan.next(); }

    public static String scanPhoneNumber() { return scan.next(); }

    public static String scanPassword() { return scan.next(); }

    public static void PrintCommentText(){ System.out.println("enter the Text ");}

 public static String scanText() { return scan.nextLine(); }



}
