package com.CMSL.x00091119;

public class Ammo extends ReusableItem {
    private boolean equipped;


    public Ammo(int remainingUses, boolean equipped) {
        super(remainingUses);
        this.equipped = equipped;
    }

    public Ammo(String name, int weight, String description, int remainingUses, boolean equipped) {
        super(name, weight, description, remainingUses);
        this.equipped = equipped;
    }

    public void equip(){

    }

    @Override
    public String toString() {
        return "Ammo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
