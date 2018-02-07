
public class Toy extends Product{
    private int minimumAge;
    private String color;

    public Toy(int minimumAge, String color, double price, long productId, String productName) {
        super(price, productId, productName);
        this.minimumAge = minimumAge;
        this.color = color;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public double TotalPrice() {        
        return price;
    }

    @Override
    public String toString() {
        return "Toy{" +"Detail="+ super.toString()+ "minimumAge=" + minimumAge + ", color=" + color + '}';
    }
    
    
}
