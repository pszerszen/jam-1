package com.intive.jam.jam1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Restaurant extends Building {

    private final List<Employee> employeeList = new ArrayList<>();
    private final Map<String, Menu> menus = new HashMap<>();

    public Restaurant(int roomsNumber, boolean kitchen, int bathroomNumber) {
        super(roomsNumber, kitchen, bathroomNumber);
    }

    public Employee getEmployeeByName(String name) {
        return employeeList.stream()
            .filter(employee -> employee.getFullName().equals(name))
            .findFirst()
            .orElse(null);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println(employee.getFullName() + " was added to Employee list.");
    }

    public void addMenu(String name, Menu menu) {
        menus.put(name, menu);
    }

    public Menu getMenu(String name) {
        return menus.get(name);
    }

    public void printMenu(String name) {
        Optional.ofNullable(getMenu(name))
            .ifPresent(Menu::printMenu);
    }

    public void printEmployeesList() {
        System.out.println(" *** Employees list ***");
        employeeList.forEach(Employee::print);
        System.out.println(" *** End of employees list ***");
    }
}
