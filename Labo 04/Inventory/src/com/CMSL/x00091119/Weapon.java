package com.CMSL.x00091119;

public class Weapon extends ReusableItem {
    private String type;
    private double speed;
    private double damage;
    private String wieldType;
    private int levels;

    public Weapon(String name, int weight, String description, int remainingUses, String type, double speed,
                  double damage, String wieldType, int levels) {
        super(name, weight, description, remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.levels = levels;
    }

    public Weapon(int remainingUses, String type, double speed, double damage, String wieldType, int levels) {
        super(remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.levels = levels;
    }

    public void upgrade(){

    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                ", damage=" + damage +
                ", wieldType='" + wieldType + '\'' +
                ", level=" + levels +
                '}';
    }
}
