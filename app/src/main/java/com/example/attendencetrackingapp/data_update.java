package com.example.attendencetrackingapp;

public class data_update {
    public String name,attended_class , total_class;

    public data_update(String name, String attended_class, String total_class) {
        this.name = name;
        this.attended_class = attended_class;
        this.total_class = total_class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttended_class() {
        return attended_class;
    }

    public void setAttended_class(String attended_class) {
        this.attended_class = attended_class;
    }

    public String getTotal_class() {
        return total_class;
    }

    public void setTotal_class(String total_class) {
        this.total_class = total_class;
    }



}
