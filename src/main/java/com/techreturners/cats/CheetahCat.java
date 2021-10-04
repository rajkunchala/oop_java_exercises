package com.techreturners.cats;

public class CheetahCat extends CatImpl {

    public CheetahCat() {

        super("wild",1100);
    }

    @Override
    public String eat() {

        return "Zzzzzzz";
    }

    public boolean isAsleep() {

        return super.isAsleep;
    }
}
