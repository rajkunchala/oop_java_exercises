package com.techreturners.cats;

public class DomesticCat extends CatImpl {

    public DomesticCat(String setting, int averageHeight) {
        super(setting, averageHeight);
        // TODO Auto-generated constructor stub
    }
    public DomesticCat() {
        super("domestic",23);
    }

    @Override
    public String eat() {
        // TODO Auto-generated method stub
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
