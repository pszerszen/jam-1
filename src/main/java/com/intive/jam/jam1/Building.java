package com.intive.jam.jam1;

public class Building {

    private final int roomsNumber;
    private final boolean kitchen;
    private final int bathroomNumber;

    public Building(int roomsNumber, boolean kitchen, int bathroomNumber) {
        this.roomsNumber = roomsNumber;
        this.kitchen = kitchen;
        this.bathroomNumber = bathroomNumber;
    }

    public void printBuildingStatus() {
        var status = String.format("""
                                        *** Building status ***
                                       Building has %d room(s) %s kitchen. Also with %d bathroom(s).
                                        *** End of building status ***
                                       """, roomsNumber, kitchen ? "and" : "no", bathroomNumber);
        System.out.println(status);
    }
}
