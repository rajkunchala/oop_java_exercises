package com.techreturners.cats;

public class DomesticCat extends CatImpl {

    public DomesticCat(String setting, int averageHeight) {
        super(setting, averageHeight);
    }
    public DomesticCat() {
        super("domestic",23);
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    public boolean isAsleep() {

        return super.isAsleep;
    }

    public void wakeUp() {

        super.isAsleep = false;
    }
    public void goToSleep() {
        super.isAsleep = true;

    }

}
