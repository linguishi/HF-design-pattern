import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();
    public CafeMenu(){
        addItem("Vegetarian coffee", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("coffee", " Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Hot coffee", "" + "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
