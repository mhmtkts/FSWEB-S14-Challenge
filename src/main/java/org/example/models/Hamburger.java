package org.example.models;

public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat,double price, String breadRollType ) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public Hamburger() {

    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setMeat(String meat) {
        this.meat = meat;
    }


    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public void itemizeHamburger() {
        double hamburgerPrice = this.price;

        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Addition1: " + this.addition1Name );
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Addition2: " + this.addition2Name );
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Addition3: " + this.addition3Name );
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Addition4: " + this.addition4Name );
        }

        setPrice(hamburgerPrice);
        System.out.println("Price: " + hamburgerPrice);
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", breadRollType='" + breadRollType + '\'' +
                ", price=" + price +
                ", addition1Name='" + addition1Name + '\'' +
                ", addition2Name='" + addition2Name + '\'' +
                ", addition3Name='" + addition3Name + '\'' +
                ", addition4Name='" + addition4Name + '\'' +
                ", addition1Price=" + addition1Price +
                ", addition2Price=" + addition2Price +
                ", addition3Price=" + addition3Price +
                ", addition4Price=" + addition4Price +
                '}';
    }
}
