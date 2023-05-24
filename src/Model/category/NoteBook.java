package Model.category;

import java.util.ArrayList;

public class NoteBook extends Stationery {
    private short leavesNumber;
    private String PayperType;
    private ArrayList<NoteBook> noteBookList = new ArrayList<NoteBook>();

    public NoteBook(short leavesNumber, String PayperType, String name, String country, double price, short inventory, String productID, double averageScore, Category category) {
        super(country, name, price, inventory, productID, averageScore, category);
        this.leavesNumber = leavesNumber;
        this.PayperType = PayperType;
    }

    public ArrayList<NoteBook> getNoteBookList() { return noteBookList; }

    public void setNoteBookList(ArrayList<NoteBook> noteBookList) { this.noteBookList = noteBookList; }

    public short getLeavesNumber() { return leavesNumber; }

    public String getPayperType() { return PayperType; }

    public void setLeavesNumber(short leavesNumber) { this.leavesNumber = leavesNumber; }

    public void setPayperType(String payperType) { PayperType = payperType; }

}
