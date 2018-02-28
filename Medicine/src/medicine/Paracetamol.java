package medicine;

public class Paracetamol extends Medicine {
    //Para is a medicine

    //shadow properties in Paracetamol class
     String properties = "ParaProperties";
    private int size;

    public Paracetamol(int size, int medicId, String name, String[] ingredient, String properties, String warning) {
        super(medicId, name, ingredient, properties, warning);
        this.size = size;
    }

    public Paracetamol() {
    }

    public String getProperties() {
        return properties;
    }
    //อันนี้อ้างถึงตัวมันเอง

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String medicProperties() {
        return "Para: " + getProperties();
    }

    @Override
    public String[] medicIngredients() {
        return null;
    }

    @Override
    public String medicWarning() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Paracetamol{" + "size=" + size + '}';
    }

}
