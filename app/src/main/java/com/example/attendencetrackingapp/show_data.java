package com.example.attendencetrackingapp;

public class show_data {
    public String percent;
    public String name;

    public show_data(String percent,String name) {
        this.percent = percent;
        this.name=name;

    }

    public String getName () { return name; }

    public void setName (String name) { this.name = name; }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }



}
