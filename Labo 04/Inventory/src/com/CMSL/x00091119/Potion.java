package com.CMSL.x00091119;

public class Potion extends HealthItem {
    private  int amount;

    public Potion(int reuseTime, String level, String type, int amount) {
        super(reuseTime, level, type);
        this.amount = amount;
    }

    public Potion(String name, int weight, String description, int reuseTime, String level, String type, int amount) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
    }

    @Override
    public void drink() {
    }

    @Override
    public String toString() {
        return "Potion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
