package Contoroller;

import Model.Store.Products;
import Model.category.Bikes;
import Model.category.Cars;
import Model.category.Computer;

public class AdminController {





    public static void Admin() {

        String CommandLine = "sf 12 kd ";

        String []request = CommandLine.split(" ");

        if (request[0].compareTo("Add") == 0) {

            if (request[1].compareTo("Cars")==0)
                Products.getProducts().add(new Cars(Double.parseDouble(request[2]),Boolean.parseBoolean(request[3]),request[4],request[5] ,Double.parseDouble(request[6]),Short.parseShort(request[7]),CreateID(),0, Products.Category.VEHICLES));
            if (request[1].compareTo("Bikes") == 0)
                Products.getProducts().add(new Bikes(Bikes.BikeType.valueOf(request[2]),request[3],request[4],Double.parseDouble(request[5]) ,Short.parseShort(request[6]),CreateID(),0, Products.Category.VEHICLES));
//            if (request[1].compareTo("Computer")==0)
//                Products.getProducts().add(new Computer(request[2],request[3],request[4],request[5],request[6],request[7],request[8],CreateID(),0,Products.Category.DIGITALGOODS));





        }


    }




    public static String CreateID() {
        return "create";


    }













}
