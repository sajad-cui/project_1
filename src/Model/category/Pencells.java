package Model.category;

public class Pencells extends Stationery {
    public enum PencellType { H2,H,F,B,HB  }
    private PencellType pencellType;

    public Pencells( PencellType pencellType,String color , String name, String country, double price, short inventory, String productID, double averageScore, Category category) {
        super(country, name, price, inventory, productID ,averageScore , category);
        this.pencellType = pencellType;
    }

    public PencellType getPencellType() {
        return pencellType;
    }

    public void setPencellType(PencellType pencellType) {
        this.pencellType = pencellType;
    }

}
