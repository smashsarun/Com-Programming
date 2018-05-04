package smartphone;

import java.util.Objects;

public class Application extends Item {

    private String icon;

    public Application(String name, String icon) {
        super(name);
        this.icon = icon;
    }

    @Override
    public boolean equals(Object obj) {
        Application temp;
        if (obj != null && obj instanceof Application) {
            temp = (Application) obj;
            if (super.getName().equals(temp.getName()) & this.icon.equals(temp.icon)) {
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        return "Application: "+this.getName();
    }

}
