package com.techreturners.cats;

public class LionCat extends CatImpl {

    public LionCat() {

        super("wild",1100);
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }

    public boolean isAsleep() {
        return super.isAsleep;
    }
}
