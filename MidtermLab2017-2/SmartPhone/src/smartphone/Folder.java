package smartphone;

public class Folder extends Item {

    private static int maxApp = 4;
    private Application[] apps;
    private int appCount;

    public Folder(String name) {
        super(name);
        appCount = 0;
        apps = new Application[maxApp];
    }

    public void MenuBar() {

    }

    public boolean addItem(Application App) {
        if (appCount < maxApp) {
            for (int i = 0; i < appCount; i++) {
                if (apps[i].equals(App)) {
                    return false;
                }
            }
            apps[appCount] = App;
            appCount++;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        String str = this.getName() + " - ";
        for (int i = 0; i < appCount; i++) {
            str += apps[i].getName() + ", ";
        }
        return str;
    }
}
