package com.example.myapplication;

public enum Period {
    Day(1),
    Week(7),
    Fortnite(14),
    Month(0);

    private int dayCount;

    private int getDayCount(){
        return dayCount;
    }


    private Period(int dayCount){
        this.dayCount = dayCount;
    }
}
