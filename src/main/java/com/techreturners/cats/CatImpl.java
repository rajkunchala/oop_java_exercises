package com.techreturners.cats;

public abstract class CatImpl implements Cat{

    protected String setting;
    protected int averageHeight;
    protected boolean isAsleep = false;

    public CatImpl(String setting,int averageHeight) {
        this.setting = setting;
        this.averageHeight=averageHeight;
    }

    public abstract String eat();

    public void sleep() {
        // TODO Auto-generated method stub
    }

    public void run() {
        // TODO Auto-generated method stub
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }
    public String getSetting() {
        return this.setting;
    }
}