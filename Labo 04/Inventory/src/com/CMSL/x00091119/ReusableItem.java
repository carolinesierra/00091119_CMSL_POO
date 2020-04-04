package com.CMSL.x00091119;

public abstract class ReusableItem extends Item {

    protected int remainingUses;

    public ReusableItem(int remainingUses) {
        this.remainingUses = remainingUses;
    }

    public ReusableItem(String name, int weight, String description, int remainingUses) {
        super(name, weight, description);
        this.remainingUses = remainingUses;
    }

    public void reduceUse() {
        }
        public void use(){ //esto es boolean arreglar
        }
}
