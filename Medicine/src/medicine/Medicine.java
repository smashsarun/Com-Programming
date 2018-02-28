package medicine;


public abstract class Medicine implements MediAble{
    private int medicId;
    private String name;
    private String[] ingredient;

    public Medicine() {
    }

    public Medicine(int medicId, String name, String[] ingredient) {
        this.medicId = medicId;
        this.name = name;
        this.ingredient = ingredient;
    }

    public int getMedicId() {
        return medicId;
    }

    public void setMedicId(int medicId) {
        this.medicId = medicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }
    
    @Override
    public abstract String medicProperties();
    
    @Override
    public abstract String[] medicIngredients();
    
    @Override
    public abstract String medicWarning();

    @Override
    public String toString() {
        String sIngredient = "";
        for (int i = 0; i < ingredient.length; i++) {
            sIngredient += ingredient[i]+" ";
        }
        return "Medicine{" + "medicId=" + medicId + ", name=" + name + ", ingredient=" + sIngredient + '}';
    }
    
    
}
