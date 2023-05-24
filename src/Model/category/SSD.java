package Model.category;

import java.util.ArrayList;

public class SSD extends StorageTools {
    private ArrayList<SSD> ssdList = new ArrayList<SSD>();
    private double readingSpeed;
    private double writingSpeed;

    public SSD( double readingSpeed, double writingSpeed , String name, double weight, double dimensions, int capacity, double price, short inventory, String productID, double averageScore, Category category) {
        super(capacity, name, weight, dimensions,price ,inventory , productID,averageScore ,category );
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;
    }

    public ArrayList<SSD> getSsdList() { return ssdList; }

    public double getReadingSpeed() { return readingSpeed; }

    public double getWritingSpeed() { return writingSpeed; }

    public void setReadingSpeed(double readingSpeed) { this.readingSpeed = readingSpeed; }

    public void setSsdList(ArrayList<SSD> ssdList) { this.ssdList = ssdList; }

    public void setWritingSpeed(double writingSpeed) { this.writingSpeed = writingSpeed; }
}
