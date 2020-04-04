package com.CMSL.x00091119;

public abstract class HealthItem extends Item {
    protected int reuseTime;
    protected String level;
    protected String type;


    public HealthItem(int reuseTime, String level, String type) {
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    public HealthItem(String name, int weight, String description, int reuseTime, String level, String type) {
        super(name, weight, description);
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    public HealthItem(String arma) {

    }


    public abstract void drink();


}
