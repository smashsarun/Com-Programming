
public class Product {
    protected double price;
    private long productId;
    private String productName;

    public Product() {
    }

    public Product(double price, long productId, String productName) {
        this.price = price;
        this.productId = productId;
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public double TotalPrice(){
        return price ;
    }
    
    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", productId=" + productId + ", productName=" + productName + '}';
    }
    
    
}
