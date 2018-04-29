package smartphone;

public class Screen {

    public static final int MAX_GRID = 24;
    private Item[] items;
    private int itemCount;
    private int gridCount;

    public Screen() {
        items = new Item[MAX_GRID];
        itemCount = 0;
        gridCount = 0;
    }
    
    public boolean addItem(Item obj){
        
        int size = 1;
        if (obj != null && obj instanceof Widget) {
            Widget wg = (Widget)obj;
            size = wg.getnGrid();
        }
        if (gridCount+size <= 24) {
            items[itemCount] = obj;
            itemCount++;
            gridCount = this.gridCount+size;
            return true;
        }
        else {
            return false;
        }

    }

    public Item[] getItems() {
        return items;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getGridCount() {
        return gridCount;
    }


    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < itemCount; i++) {
            str += items[i].toString() + ":";
        }
        return str;
    }

}
