package org.example.oopMAsterChallenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Delux", "Sausage & Bacon", 14.54, "white");
    super.addHamburgerAddition1("Chips", 2.75);
    super.addHamburgerAddition2("Drink",1.81);
    }


    @Override
    public void addHamburgerAddition1(String addOn, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String addOn, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String addOn, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String addOn, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public double itemizeHamburger() {
        return 19.10;
    }
}
