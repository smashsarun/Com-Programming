
package smarttvscreen;

public abstract class Apps {
    private String name;    
    private String image;    
    private String description;


    

    public Apps(String name) {
        this.name = name;
    }
    
    
    public Apps(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
