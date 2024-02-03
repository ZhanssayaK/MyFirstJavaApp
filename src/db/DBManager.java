package db;

import model.Item;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Item> items = new ArrayList<>();

    static {
        items.add(new Item(1L, "Iphone 13Pro Max", 450000, 30));
        items.add(new Item(2L, "Iphone 14ProMax", 500000, 9));
        items.add(new Item(3L, "Iphone 15ProMax", 600000, 50));
    }

    public static ArrayList<Item> getItems(){
        return items;
    }

    public static Item getItemById(Long id){
        for(Item item : items){
            if (item.getId()==id){
                return item;
            }
        }
        return null;
    }
}
