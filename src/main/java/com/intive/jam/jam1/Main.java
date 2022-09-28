package com.intive.jam.jam1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var restaurant = new Restaurant(2, true, 2);

        var dinerMenu = new Menu();
        dinerMenu.addMenuItem(new MenuItem("Fires", "Chopped and fried potatoes.", BigDecimal.valueOf(12.5)));
        dinerMenu.addMenuItem(new MenuItem("Cola", "Nasty sparky drink.", BigDecimal.valueOf(7.99)));
        dinerMenu.addMenuItem(new MenuItem("Nuggets", "Ground chicken.", BigDecimal.valueOf(25.0)));
        restaurant.addMenu("diner", dinerMenu);

        restaurant.addEmployee(new Employee("Karol Okrasa", "Waiter", BigDecimal.valueOf(25)));
        restaurant.addEmployee(new Employee("Magda Gessler", "Manager", BigDecimal.valueOf(333)));
        restaurant.addEmployee(new Employee("Michael Morgan", "Cashier", BigDecimal.valueOf(45)));
        restaurant.addEmployee(new Employee("Robert Makłowicz", "Cook", BigDecimal.valueOf(666)));

        restaurant.printBuildingStatus();
        restaurant.printMenu("diner");
        restaurant.printEmployeesList();
    }
}
