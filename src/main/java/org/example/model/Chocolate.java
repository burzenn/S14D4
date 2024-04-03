package org.example.model;

public class Chocolate extends ProductForSale {

    private String ingredient;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String ingredient) {
        super(type, price, description);
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() +this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "ingredient='" + ingredient + '\'' +
                '}';
    }
}
