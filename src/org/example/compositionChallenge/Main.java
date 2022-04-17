package org.example.compositionChallenge;

//Create a single room of a house using composition.
//Think about the things should be included in the room.
//Maybe physical parts of the house but furniture as well.
//Add at least one method to hide the object  e.g. not using a getter
//but to access the object used in composition within the manin class.

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed newBed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        BedRoom newBedroom = new BedRoom("Negars", wall1, wall2, wall3, wall4, ceiling, newBed, lamp);
        newBedroom.makeBed();

        newBedroom.getLamp().trunOn();
    }
}