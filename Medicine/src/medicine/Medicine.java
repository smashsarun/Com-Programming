package medicine;

public class Medicine implements MediAble {

    private int medicId;
    private String name;
    private String[] ingredient;
     String properties = "MedicineProperties";
    private String warning;

    public Medicine() {
    }

    public Medicine(int medicId, String name, String[] ingredient, String properties, String warning) {
        this.medicId = medicId;
        this.name = name;
        this.ingredient = ingredient;
        this.properties = properties;
        this.warning = warning;
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

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
    
    @Override
    public String medicProperties() {
        return properties;
    }

    @Override
    public String[] medicIngredients() {
        return ingredient;
    }

    @Override
    public String medicWarning() {
        return warning;
    }

    @Override
    public String toString() {
        String sIngredient = "";
        for (int i = 0; i < ingredient.length; i++) {
            sIngredient += ingredient[i] + " ";
        }
        return "Medicine{" + "medicId=" + medicId + ", name=" + name + ", ingredient=" + sIngredient + '}';
    }

}
