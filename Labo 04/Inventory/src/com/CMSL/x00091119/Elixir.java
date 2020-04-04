package com.CMSL.x00091119;

public class Elixir extends HealthItem {

    private int ammount;
    private  int time;


    public Elixir(int reuseTime, String level, String type, int ammount, int time) {
        super(reuseTime, level, type);
        this.ammount = ammount;
        this.time = time;
    }

    public Elixir(String name, int weight, String description, int reuseTime, String level, String type, int ammount,
                  int time) {
        super(name, weight, description, reuseTime, level, type);
        this.ammount = ammount;
        this.time = time;
    }

    @Override
    public void drink() {

    }

    @Override
    public String toString() {
        return "Elixir{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
