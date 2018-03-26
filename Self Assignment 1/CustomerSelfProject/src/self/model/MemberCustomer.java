package self.model;



public class MemberCustomer extends Customer {
    
   private double points;
   private double discountRate = 0.2; //กำหนดค่าให้เพราะโจทย์บอกว่าจะได้ลด 20%

    public MemberCustomer() {
    }

    public MemberCustomer(String name, String surname, double points) {
        super(name, surname);
        this.points = points;
    }

    public double getPoints() {
        return points;
    }
    
    
    
   @Override
    public double getDiscountRate(){
        return discountRate;
    }  
    
   @Override
    public  void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    
   @Override
    public  double redeemPoint2Cash(int usePoints){
        int pointToCash = 0;
        if (usePoints > points) {
            System.out.println("Your points are not enough!");
            pointToCash = -1;            
       }
        else {
           this.points -= usePoints; //เอา Points มาลบกับที่่จะดึงไปใช้
            int discountCash = usePoints / 800; //ลดได้กี่ครั้ง
           pointToCash = discountCash * 100; //เอาไปคูณว่าสรุปลดได้กี่บาท
           double leftPoint = usePoints - (discountCash * 800); //ดูว่าเหลือที่ไม่ได้ใช้กี่ Points
           this.points += leftPoint; //เอาค่าที่ไม่ได้ใ้บวกกลับเข้าไป
       }
        return pointToCash;
    }
    
    
   @Override
    public  void addPointFromBuyingTotalPrice(double buyingPrice){
        this.points = (int)buyingPrice / 25; //ถ้าไม่แปลงเป็น int มันจะไปมองว่าซื้อต่่ำกว่า 25 ก็ได้ลดเป็นทศนิยม
    }

    @Override
    public String toString() {
        return "MemberCustomer{" + "points=" + points + '}';
    }
   
   
  

}
