package com.intive.jam.jam1;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    private final Map<Integer, MenuItem> menuItems = new HashMap<>();

    public int addMenuItem(MenuItem menuItem) {
        var position = menuItems.keySet().stream()
            .max(Integer::compareTo)
            .orElse(0) + 1;
        menuItems.put(position, menuItem);
        System.out.println(menuItem.itemName() + " was added into menu on position: " + position);

        return position;
    }

    public BigDecimal getPriceOfMenuItem(String name) {
        return menuItems.values().stream()
            .filter(menuItem -> menuItem.itemName().equals(name))
            .findFirst()
            .map(MenuItem::itemPrice)
            .orElse(null);
    }

    public void printMenu() {
        System.out.println(" *** Restaurant Menu ***");
        menuItems.forEach((position, item) -> System.out.println(position + ". " + item.print()));
        System.out.println(" *** End of restaurant menu ***");
        System.out.println();
    }
}
