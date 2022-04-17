package org.example.composition;

public class Monitor {

    private String model;
    private String MAnufacturer;
    private int size;
    private Resolution nativeResoloution;

    public Monitor(String model, String Manufacturer, int size, Resolution nativeResoloution) {
        this.model = model;
        this.MAnufacturer = Manufacturer;
        this.size = size;
        this.nativeResoloution = nativeResoloution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + "in colour " + color);
    }
}
