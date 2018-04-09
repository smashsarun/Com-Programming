
package hw.model;

public class Restaurant {
    private String nameOfOrder;
    private int numOfOrder;
    private double price;

    public Restaurant(String nameOfOrder, int numOfOrder, double price) {
        this.nameOfOrder = nameOfOrder;
        this.numOfOrder = numOfOrder;
        this.price = price;
    }

    public String getNameOfMenu() {
        return nameOfOrder;
    }

    public void setNameOfMenu(String nameOfOrder) {
        this.nameOfOrder = nameOfOrder;
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

    @Override
    public String toString() {
        return "Restaurant{" + "nameOfOrder=" + nameOfOrder + ", numOfOrder=" + numOfOrder + ", price=" + price + '}';
    }
    
    
}
