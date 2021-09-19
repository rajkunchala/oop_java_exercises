package com.techreturners.cats;

public class CheetahCat extends CatImpl {

    public CheetahCat(String setting, int averageHeight) {
        super(setting, averageHeight);
    }

    public CheetahCat() {
        super("wild",1100);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

    public void goToSleep() {
        // TODO Auto-generated method stub
    }

    public void wakeUp() {
        // TODO Auto-generated method stub
    }

    public boolean isAsleep() {
        return super.isAsleep;
    }
}
