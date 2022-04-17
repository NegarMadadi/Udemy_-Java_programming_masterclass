package org.example.composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBored motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBored motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
