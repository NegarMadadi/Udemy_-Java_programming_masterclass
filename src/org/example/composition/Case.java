package org.example.composition;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimentions dimentions;

    public Case(String model, String manufacturer, String powerSupply, Dimentions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimentions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }
}
