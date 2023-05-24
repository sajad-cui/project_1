package view;

import Contoroller.AcceptController;
import Model.Store.Comment;
import Model.Store.Products;
import Model.category.*;
import Model.user.Buyer;
import Model.user.User;
import org.omg.CORBA.Request;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class AdminView {

    private static Scanner scan = new Scanner(System.in);

    //Scanner scan = new Scanner(System.in);
    private static ArrayList<Products> products;

    private static ArrayList<Buyer> users;
    private static ArrayList<Buyer> accepts;

    private static ArrayList<Comment> acceptComments;

    public AdminView() {
        acceptComments = AcceptController.getAcceptComments();
        products = Products.getProducts();
        accepts = AcceptController.getAcceptsBuyer();
        users = User.getBuyer();
    }

    public static void executeCommand(String command) {

        acceptComments = AcceptController.getAcceptComments();
        products = Products.getProducts();
        accepts = AcceptController.getAcceptsBuyer();
        users = User.getBuyer();

        String[] cmdParts = command.split(" ");

        if (cmdParts[0].equals("Add")) {
            // Add a new vehicle to the list of products

            if (cmdParts[1].equals("Cars")) {
                try {
                    double engineSize = Double.parseDouble(cmdParts[2]);
                    boolean isAutomatic = Boolean.parseBoolean(cmdParts[3]);
                    String make = cmdParts[4];
                    String model = cmdParts[5];
                    double price = Double.parseDouble(cmdParts[6]);
                    short inventory = (short) Integer.parseInt(cmdParts[7]);

                    Products car = new Cars(engineSize, isAutomatic, make, model, price, inventory, "445423", 0, Products.Category.VEHICLES);
                    products.add(car);
                    System.out.println("Vehicle added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("Bikes")) {
                try {
                    String name = cmdParts[2];
                    String bikeType = cmdParts[3];
                    String CompanyName = cmdParts[4];
                    double price = Double.parseDouble(cmdParts[5]);
                    short inventory = (short) Integer.parseInt(cmdParts[6]);

                    Products bike = new Bikes(Bikes.BikeType.valueOf(bikeType), CompanyName, name, price, inventory, "1dsjknzx", 0, Products.Category.VEHICLES);
                    products.add(bike);
                    System.out.println("Bike added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("Computer")) {
                try {
                    String CPU = cmdParts[2];
                    short ramCapacity = (short) Integer.parseInt(cmdParts[3]);
                    String name = cmdParts[4];
                    double weight = Double.parseDouble(cmdParts[5]);
                    double dimensions = Double.parseDouble(cmdParts[6]);

                    double price = Double.parseDouble(cmdParts[7]);
                    short inventory = (short) Integer.parseInt(cmdParts[8]);

                    Products computer = new Computer(CPU, ramCapacity, name, weight, dimensions, price, inventory, "zdskjh1", 0, Products.Category.DIGITALGOODS);
                    products.add(computer);
                    System.out.println("Vehicle added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("Edible")) {
                try {
                    String name = cmdParts[2];
                    double price = Double.parseDouble(cmdParts[3]);
                    short inventory = (short) Integer.parseInt(cmdParts[4]);

                    String Production = cmdParts[5];
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = dateFormat.parse(Production);

                    String Expiration = cmdParts[6];
                    Date date1 = dateFormat.parse(Expiration);

                    Products edible = new Edible(date, date1, name, price, inventory, "jkndsncm", 0, Products.Category.EDIBLE);
                    products.add(edible);
                    System.out.println("Edible added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("Memory")) {
                try {
                    String name = cmdParts[2];
                    String version = cmdParts[3];
                    double price = Double.parseDouble(cmdParts[4]);
                    double dimensions = Double.parseDouble(cmdParts[5]);
                    int capacity = (short) Integer.parseInt(cmdParts[8]);

                    double weight = Double.parseDouble(cmdParts[6]);


                    short inventory = (short) Integer.parseInt(cmdParts[7]);

                    Products memory = new Memory(version, name, weight, dimensions, capacity, price, inventory, "kjsdjknz", 0, Products.Category.DIGITALGOODS);
                    products.add(memory);
                    System.out.println("Vehicle added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("NoteBook")) {
                try {

                    String name = cmdParts[2];
                    String country = cmdParts[3];
                    double price = Double.parseDouble(cmdParts[4]);
                    short inventory = (short) Integer.parseInt(cmdParts[5]);
                    String PayperType = cmdParts[6];
                    short leavseNumber = (short) Integer.parseInt(cmdParts[7]);

                    Products noteBook = new NoteBook(leavseNumber, PayperType, name, country, price, inventory, "445423", 0, Products.Category.STATIONERY);
                    products.add(noteBook);
                    System.out.println("Note book added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("Pen")) {
                try {

                    String name = cmdParts[2];
                    String country = cmdParts[4];
                    String color = cmdParts[3];
                    double price = Double.parseDouble(cmdParts[5]);
                    short inventory = (short) Integer.parseInt(cmdParts[6]);

                    Products pen = new Pen(color, name, country, price, inventory, "ksjd32f", 0, Products.Category.DIGITALGOODS);
                    products.add(pen);
                    System.out.println("pen added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("Pencells")) {
                try {

                    String PencellType = cmdParts[5];
                    String name = cmdParts[2];
                    String country = cmdParts[4];
                    String color = cmdParts[3];
                    double price = Double.parseDouble(cmdParts[6]);
                    short inventory = (short) Integer.parseInt(cmdParts[7]);

                    Products pencells = new Pencells(Pencells.PencellType.valueOf(PencellType), color, name, country, price, inventory, "445423", 0, Products.Category.STATIONERY);
                    products.add(pencells);
                    System.out.println("Vehicle added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            } else if (cmdParts[1].equals("SSD")) {
                try {

                    double weight = Double.parseDouble(cmdParts[5]);
                    String name = cmdParts[2];
                    double dimensions = Double.parseDouble(cmdParts[7]);
                    int capacity = (short) Integer.parseInt(cmdParts[3]);
                    double price = Double.parseDouble(cmdParts[4]);
                    double readingSpeed = Double.parseDouble(cmdParts[5]);
                    double writingSpeed = Double.parseDouble(cmdParts[6]);

                    short inventory = (short) Integer.parseInt(cmdParts[8]);

                    Products ssd = new SSD(readingSpeed, writingSpeed, name, weight, dimensions, capacity, price, inventory, "mjknd8sd", 0, Products.Category.DIGITALGOODS);
                    products.add(ssd);
                    System.out.println("ssd added successfully.");
                } catch (Exception ex) {
                    System.out.println("Invalid command. Please check your inputs.");
                }
            }

        }
    }
}
