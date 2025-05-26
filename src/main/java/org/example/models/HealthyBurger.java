package org.example.models;

public class HealthyBurger extends  Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }


    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.getPrice();

        System.out.println(healthyExtra1Name);
        System.out.println(healthyExtra2Name);
        System.out.println(hamburgerPrice);
        System.out.println(getPrice());
        System.out.println(healthyExtra1Price);

         super.setPrice(getPrice() + healthyExtra1Price + healthyExtra2Price);
         double sum = getPrice() + healthyExtra1Price + healthyExtra2Price;
         System.out.println(sum);

        return sum;
    }

    public HealthyBurger(String name, double price, String bread) {
        super.setName(name);
        super.setPrice(price);
        super.setBreadRollType(bread);
        super.setMeat("Tofu");
    }
}
