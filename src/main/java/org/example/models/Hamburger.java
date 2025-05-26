package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger() {

    }

    public String getName() {
        return name;
    }



    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }


    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public double itemizeHamburger() {
        System.out.println(addition1Name);
        System.out.println(addition2Name);
        System.out.println(addition3Name);
        System.out.println(addition4Name);

        setPrice(this.price + addition1Price + addition2Price + addition3Price + addition4Price);
        double sum = this.price + addition1Price + addition2Price + addition3Price + addition4Price;
        return sum;
    }
}
