package org.example.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Negar";
//        player.health = 20;
//        player.weopen = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//         damage = 11;
//         player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Negar", 200, "Sword");
        System.out.println("Initial helath is " + player.getHealth());



    }
}
