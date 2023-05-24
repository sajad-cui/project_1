package Model.category;

import java.util.ArrayList;

public class Computer extends DigatalGoods {
    private ArrayList<Computer> computerList = new ArrayList<Computer>();
    private String CPU;
    private short ramCapacity;

    public Computer(String CPU, short ramCapacity, String name, double weight, double dimensions, double price, short inventory, String productID, double averageScore, Category category) {
        super(weight, dimensions, name, price, inventory, productID, averageScore, category);
        this.CPU = CPU;
        this.ramCapacity = ramCapacity;
    }

    public ArrayList<Computer> getComputerList() { return computerList; }

    public void setComputerList(ArrayList<Computer> computerList) { this.computerList = computerList; }

    public short getRamCapacity() { return ramCapacity; }

    public String getCPU() { return CPU; }

    public void setCPU(String CPU) { this.CPU = CPU; }

    public void setRamCapacity(short ramCapacity) { this.ramCapacity = ramCapacity; }
}
