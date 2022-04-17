package org.example.compositionChallenge;

public class Lamp {
    private String style;
    private boolean battery;
    private int globeRating;

    public Lamp(String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public void trunOn() {
        System.out.println("Lamp -> Turning on.");
    }
}
