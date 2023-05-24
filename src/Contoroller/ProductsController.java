package Contoroller;

import Model.Store.Products;
//import Model.category.Cars;
//import Model.category.Computer;
import Model.user.Buyer;
import view.ProductsView;
import view.UserPage;

import java.util.*;

public abstract class ProductsController {


    public static void products(Buyer buyer) {
        ArrayList<Products> Carts;
        ArrayList<Products> productsList;
        productsList = Products.getProducts();
        ArrayList<Products> Filter = new ArrayList<>(productsList);

        int page = 0;
        while (true) {
            boolean x = false;

            for (int i = page * 10; i < Filter.size() && i < (page + 1) * 10; i++) {
                ProductsView.PrintProducts(Filter.get(i), (short) i);
            }


            ProductsView.PrintNextLastPage(page);

            if (Filter.size() > 0 && Filter.size() != productsList.size())
                ProductsView.PrintDeletFilter();

            String page_product = ProductsView.getPage_product();


            if (page_product.compareTo("+") == 0)
                page++;
            else if (page_product.compareTo("-") == 0)
                page--;

            else if (Integer.parseInt(page_product) - 1 == -2)
                Filter = new ArrayList<>(productsList);
            else if (Integer.parseInt(page_product) - 1 == -1)
                Filters(productsList, Filter, x);
            else if (Integer.parseInt(page_product) - 1 >= 0) {
                ProductsView.PrintProduct(Filter.get(Integer.parseInt(page_product) - 1));

                ProductsView.PrintCart_comment();
                short Cart_comment = ProductsView.scanCart_comment();
                if (Cart_comment == 1) {
                    Carts = Buyer.getCart();
                    Carts.add(Filter.get(Integer.parseInt(page_product) - 1));
                    System.out.println(Filter.get((Integer.parseInt(page_product)) - 1).getProductID());
                    break;
                } else if (Cart_comment == 2) {

                    UserPage.PrintReqCom();
                    short scanReqCom = UserPage.scanReqCom();
                    if (scanReqCom == 2)
                        CommentController.CreateComment(buyer,Filter.get((Integer.parseInt(page_product)) - 1));
                    if (scanReqCom == 1)
                        for (int i = 0; i < productsList.get((Integer.parseInt(page_product)) - 1).getCommentList().size(); i++)
                            ProductsView.PrintView(Filter.get((Integer.parseInt(page_product)) - 1).getCommentList().get(i));


                }


            }


        }


    }


    //Filters********************************************************************************************************

    public static void Filters(ArrayList<Products> productsList, ArrayList<Products> Filter, boolean x) {
        ProductsView.PrintFilters();
        short FilterType = ProductsView.scanFilterType();

        while (true) {

            while (Filter.size() > 0)
                Filter.remove(0);

            //search################################################
            if (FilterType == 3) {
                ProductsView.PrintSearch();
                String search = ProductsView.scanSearch();

                x = false;
                for (Products products : productsList)
                    if (search.compareTo(products.getName()) == 0 || search.compareTo(products.getProductID()) == 0) {


                        Filter.add(products);
                        x = true;
                    }
                if (!x)
                    ProductsView.PrintWrong();

            }


            //General Property#################################
            if (FilterType == 2) {
                ProductsView.PrintGeneralProp();
                short generalProp = ProductsView.scanGeneralProp();

                while (true) {
                    x = false;
                    //filterPrice###################################
                    if (generalProp == 1) {
                        ProductsView.PrintMinPrice();
                        double min = ProductsView.scanMinPrice();
                        ProductsView.PrintMaxPrice();
                        double max = ProductsView.scanMaxPrice();

                        for (Products products : productsList)
                            if (products.getPrice() >= min && products.getPrice() <= max) {
                                Filter.add(products);
                                x = true;
                            }
                        if (!x)
                            ProductsView.PrintWrong();
                        else break;
                    }

                    //filterAverage##############################
                    if (generalProp == 2) {
                        ProductsView.PrintMinAverage();
                        double min = ProductsView.scanMinAverage();
                        for (Products products : productsList) {
                            if (products.getAverageScore() >= min) {
                                Filter.add(products);
                                x = true;
                            }
                        }

                        if (!x)
                            ProductsView.PrintWrong();
                        else break;

                    }

                    //filter Average############################
                    if (generalProp == 3) {
                        for (Products products : productsList)
                            if (products.getInventory() > 0)
                                Filter.add(products);
                        x = true;
                        break;
                    }

                }

            }

            if (x)
                break;

            //CategoryFilter#######################
            if (FilterType == 1) {

                ProductsView.PrintCategoryFilter();
                short CategoryFilter = ProductsView.scanCategoryFilter();

                //vehlecsFilter###########################
                if (CategoryFilter == 1) {
                    ProductsView.PrintVehicleFilter();
                    short VehicleType = ProductsView.scantVehicleFilter();


                    if (VehicleType == 1) {
                        for (Products products : productsList)
                            if (products.getClass().getSimpleName().compareTo("Cars") == 0)
                                Filter.add(products);
                        break;

                    } else if (VehicleType == 2) {

                        for (Products products : productsList)
                            if (products.getClass().getSimpleName().compareTo("Bikes") == 0)
                                Filter.add(products);
                        break;
                    }


                }
                //DigitalGoodsFilter####################################
                else if (CategoryFilter == 2) {
                    ProductsView.PrintDigitalGoodsFilter((short) 0);
                    short DigitalGoodsType = ProductsView.scanDigitalGoodsFilter();


                    if (DigitalGoodsType == 2) {
                        for (Products products : productsList)
                            if (products.getClass().getSimpleName().compareTo("Computer") == 0)
                                Filter.add(products);
                        break;

                    } else if (DigitalGoodsType == 1) {
                        ProductsView.PrintDigitalGoodsFilter(DigitalGoodsType);
                        short StorageTools = ProductsView.scanStorageTools();
                        if (StorageTools == 1) {

                            for (Products products : productsList)
                                if (products.getClass().getSimpleName().compareTo("Memory") == 0)
                                    Filter.add(products);
                            break;


                        } else if (StorageTools == 2) {
                            for (Products products : productsList)
                                if (products.getClass().getSimpleName().compareTo("SSD") == 0)
                                    Filter.add(products);
                            break;


                        }


                    }

                }
                //EdibleFilter#######################################
                else if (CategoryFilter == 3) {
                    ProductsView.PrintEdibleFilter();

                    for (Products products : productsList)
                        if (products.getClass().getSimpleName().compareTo("Edible") == 0)
                            Filter.add(products);
                    break;

                }
                //StationeryFilter################################
                else if (CategoryFilter == 4) {
                    ProductsView.PrintStationeryFilter();
                    short StationeryType = ProductsView.scanStationeryFilter();


                    if (StationeryType == 1) {
                        for (Products products : productsList)
                            if (products.getClass().getSimpleName().compareTo("Pen") == 0)
                                Filter.add(products);
                        break;
                    } else if (StationeryType == 2) {
                        for (Products products : productsList)
                            if (products.getClass().getSimpleName().compareTo("NoteBook") == 0)
                                Filter.add(products);
                        break;
                    } else if (StationeryType == 3) {
                        for (Products products : productsList)
                            if (products.getClass().getSimpleName().compareTo("Pencells") == 0)
                                Filter.add(products);
                        break;
                    }


                }

            }


            if (Filter.size() == 0)
                Filter = productsList;


            for (Products products : Filter)
                System.out.println(products.getName() + " " + products.getClass().getSimpleName() + " " + products.getPrice());


        }

    }
    //************************************************************************************************


}
