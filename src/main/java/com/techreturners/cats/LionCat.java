package com.techreturners.cats;

public class LionCat extends CatImpl {
    public LionCat(String setting, int averageHeight) {
        super(setting, averageHeight);
        // TODO Auto-generated constructor stub
    }

    public LionCat() {
        super("wild",1100);
    }

    @Override
    public String eat() {
        // TODO Auto-generated method stub
        return "Roar!!!!";
    }

    public void goToSleep() {
        // TODO Auto-generated method stub

    }

    public void wakeUp() {
        // TODO Auto-generated method stub

    }

    public boolean isAsleep() {
        // TODO Auto-generated method stub
        return super.isAsleep;
    }
}
