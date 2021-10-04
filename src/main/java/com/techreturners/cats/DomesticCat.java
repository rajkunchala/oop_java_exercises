package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatImpl {

    public DomesticCat() {

        super("domestic",23);
    }

    @Override
    public String eat() {

        return "Purrrrrrr";
    }

    public String eat(Random random){
        String[] comments = {"Purrrrrrr","Purrrrrrr! It will do I suppose"};
        int randomComment = random.nextInt(comments.length);
        return comments[randomComment];
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
