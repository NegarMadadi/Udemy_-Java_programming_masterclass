package org.example.encapsulation;

public class EnhancedPlayer {

    private String fullName;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weopen) {
        this.fullName = fullName;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weopen;
    }

    public int getHealth() {
        return hitPoints;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("player knocked out.");
            // reduce number of lives remaining for the player.
        }
    }

    public int healthRemaining() {
        return this.hitPoints;
    }
}





