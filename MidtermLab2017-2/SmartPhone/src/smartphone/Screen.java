package smartphone;

public class Screen {

    public static final int MAX_GRID = 24;
    private Item[] items;
    private int itemCount;
    private int gridCount;

    public Screen() {
        items = new Item[MAX_GRID];
        this.itemCount = 0;
        this.gridCount = 0;
    }
    
    public boolean addItem(Item obj){
        
        int size = 1;
        
        if (obj != null && obj instanceof Widget) {
            Widget temp = (Widget)obj;
            size = temp.getnGrid();
        }
        
        if (this.gridCount + size <= MAX_GRID) {
            this.items[itemCount] = obj;
            this.gridCount += size;
            this.itemCount++;
            return true;
        }
        return false;
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
