
package hw.model;

public class Restaurant {
    private String nameOfOrder;
    private int numOfOrder;
    private double price;
    private int number;

    public Restaurant(int number, String nameOfOrder, int numOfOrder, double price) {
        this.nameOfOrder = nameOfOrder;
        this.numOfOrder = numOfOrder;
        this.price = price;
        this.number = number;
    }

    public int getNumOfOrder() {
        return numOfOrder;
    }

    public void setnumOfOrder(int numOfOrder) {
        this.numOfOrder = numOfOrder;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameOfOrder() {
        return nameOfOrder;
    }

    public void setNameOfOrder(String nameOfOrder) {
        this.nameOfOrder = nameOfOrder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "nameOfOrder=" + nameOfOrder + ", numOfOrder=" + numOfOrder + ", price=" + price + ", number=" + number + '}';
    }
       
}
