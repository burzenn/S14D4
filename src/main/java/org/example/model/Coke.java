package org.example.model;

public class Coke extends ProductForSale {

    private String sugarType;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, String sugarType) {
        super(type, price, description);
        this.sugarType = sugarType;
    }

    public String getSugarType() {
        return sugarType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() +this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "sugarType='" + sugarType + '\'' +
                '}';
    }
}
