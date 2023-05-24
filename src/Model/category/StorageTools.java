package Model.category;

public class StorageTools extends DigatalGoods {
    private int capacity;

    public StorageTools( int capacity , String name, double weight, double dimensions, double price, short inventory,String productID, double averageScore, Category category) {
        super(weight, dimensions, name, price,inventory  , productID,averageScore ,category );
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }

    public void setCapacity(int capacity) { this.capacity = capacity; }
}
