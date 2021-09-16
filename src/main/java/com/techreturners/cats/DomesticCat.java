package com.techreturners.cats;

public class DomesticCat implements Cat {

    boolean sleep;

    {
        sleep = false;
    }

    @Override
    public boolean isAsleep() {
        return sleep;
    }

    @Override
    public boolean goToSleep() {
        sleep = true;
        return true;
    }

    @Override
    public boolean checkCatCanGoToSleep() {
        return false;
    }

    @Override
    public void wakeUp() {

        sleep = false;

    }

    @Override
    public String getSetting() {
        return "domestic";
    }

    @Override
    public int getAverageHeight() {
        return 23;
    }

    @Override
    public String eat() {
        return null;
    }

}
