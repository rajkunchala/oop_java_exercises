package com.techreturners.cats;

public class DomesticCat implements Cat {
    @Override
    public boolean isAsleep() {
        return false;
    }

    @Override
    public boolean goToSleep() {
        return false;
    }

    @Override
    public boolean checkCatCanGoToSleep() {
        return false;
    }

    @Override
    public void wakeUp() {

    }

    @Override
    public String getSetting() {
        return null;
    }

    @Override
    public int getAverageHeight() {
        return 0;
    }

    @Override
    public String eat() {
        return null;
    }

}
