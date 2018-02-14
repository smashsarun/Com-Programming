
public class Food extends Product {

    private String taste;
    private String container;
    
    public Food(){
        super();
    }

    public Food(String taste, String container, double price, long productId, String productName) {
        super(price, productId, productName);
        this.taste = taste;
        this.container = container;
    }    

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    @Override
    public double TotalPrice() {
        //service charge 10 percent
        return price + (price*10/100);
    }

    @Override
    public String toString() {
        return "Food{" +"Detail="+ super.toString() +"taste=" + taste + ", container=" + container + '}';
    }

}
