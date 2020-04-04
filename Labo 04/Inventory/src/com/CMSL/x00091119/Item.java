package com.CMSL.x00091119;

public class Item {
    protected int id;
    protected String name;
    protected int weight;
    protected String description;

    public Item() {
    }

    public Item(String name, int weight, String description){
        this.id = IdGenerator.newId();
        this.name = name;
        this.weight = weight;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }





    public int getID() {

        return id;
    }
}
