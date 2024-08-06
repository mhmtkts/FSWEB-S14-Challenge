package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("DELUXE BURGER", "DOUBLE",19.10, "DOUBLE_BURGER" );
        this.cips = "CURVY";
        this.drink= "COKE";
    }


    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void itemizeHamburger() {
        getPrice();
    }
}
