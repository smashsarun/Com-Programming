
public class TestProduct {
    public static void main(String[] args) {
        Food f1 = new Food("Sweet","Bowl",75,114253,"Kra-Pao-Moo-Sub");
        System.out.println("Total Price of food is "+f1.TotalPrice());
        System.out.println(f1.toString()+"\n");
        
        Beverage b1 = new Beverage("Hot",45,224151,"Capuchino");
        Beverage b2 = new Beverage("Cold",50,224151,"Capuchino");
        Beverage b3 = new Beverage("Hot",45,224153,"Late");
        System.out.println("Total Price of Beverage is "+b1.TotalPrice());
        System.out.println(b1.toString()+"\n");
        
        Toy t1 = new Toy(13,"Blue",199,311721,"Doll");
        System.out.println("Total Price of Toy is "+t1.TotalPrice());
        System.out.println(t1.toString()+"\n");
        
        if (b1.equals(b2) == true) {
            System.out.println("Same Beverage");
        }
        else {
            System.out.println("Diffrent Beverage");
        }
        
        if (b1.equals(b3) == true) {
            System.out.println("Same Beverage");
        }
        else {
            System.out.println("Diffrent Beverage");
        }
    }
}
