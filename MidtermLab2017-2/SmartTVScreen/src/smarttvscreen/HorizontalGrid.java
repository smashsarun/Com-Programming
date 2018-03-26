package smarttvscreen;

public class HorizontalGrid {

    private String name;
    private Apps[] apps;
// hint 1 
    private int focusIdx, insertedApps, numOfApps;

    public HorizontalGrid(String name, int i) {
// hint 2 
        this.name = name;
        this.numOfApps = i;
        this.insertedApps = 0;
        this.apps = new Apps[i];
    }

// hint 3 addApp
    public Apps[] getApps() {
        return apps;
    }

    public boolean addApp(Apps apps) {
        boolean value = false;
        if (this.insertedApps < this.apps.length) {
            this.apps[insertedApps] = apps;
            this.insertedApps++;
            value = true;

        }

        return value;
    }

    public void setFocusIdx(Cursor cursor) {

        if (cursor.getColumn() >= insertedApps) {
            focusIdx = insertedApps - 1;
            cursor.setColumn(focusIdx);
        } else {
            focusIdx = cursor.getColumn();
        }
    }

    public void clearFocusIdx() {
        focusIdx = -1;
    }

    public int getNumOfApps() {
        return numOfApps;
    }

    public void setNumOfApps(int numOfApps) {
        this.numOfApps = numOfApps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String str = "[ " + name + " ]\n";
        for (int i = 0; i < insertedApps; i++) {
            if (i == focusIdx) {
                str += "  ((" + apps[i].getName() + "))";
            } else {
                str += "  " + apps[i].getName();
            }
        }
        return str;
    }

}
