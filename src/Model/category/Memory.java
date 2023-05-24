package Model.category;

import java.util.ArrayList;

public class Memory extends StorageTools {
    private String version;
    private ArrayList<Memory> memoryList = new ArrayList<Memory>();

    public Memory(String version, String name, double weight, double dimensions, int capacity, double price, short inventory, String productID, double averageScore, Category category) {
        super(capacity, name, weight, dimensions, price, inventory, productID, averageScore, category);
        this.version = version;
    }

    public ArrayList<Memory> getMemoryList() { return memoryList; }

    public void setMemoryList(ArrayList<Memory> memoryList) { this.memoryList = memoryList; }

    public String getVersion() { return version; }

    public void setVersion(String version) { this.version = version; }
}
