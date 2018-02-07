
public class Beverage extends Product {

    private String type;

    public Beverage(String type, double price, long productId, String productName) {
        super(price, productId, productName);
        this.type = type;
    }

    public String getTemp() {
        return type;
    }

    public void setTemp(String type) {
        this.type = type;
    }

    @Override
    public double TotalPrice() {
        //service charge 10 percent
        return price + (price*10/100);
    }

    @Override
    public String toString() {
        return "Beverage{"+"Detail="+ super.toString() + "type=" + type + '}';
    }

}
