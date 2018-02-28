
package medicine;

public class Paracetamol extends Medicine{
    private int size;

    public Paracetamol(int size, int medicId, String name, String[] ingredient) {
        super(medicId, name, ingredient);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public  String medicProperties(){
        return null;
    }
    
    @Override
    public  String[] medicIngredients(){
        return null;
    }
    
    @Override
    public  String medicWarning(){
        return null;
    }

    @Override
    public String toString() {
        return "Paracetamol{" + "size=" + size + '}' + super.toString();
    }
    
    
}
