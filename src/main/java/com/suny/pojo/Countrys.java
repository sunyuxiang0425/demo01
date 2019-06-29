package com.suny.pojo;

import java.util.List;

public class Countrys {
    private int country_id;
    private String country_name;
    private List<Citys> allcity;

    public List<Citys> getAllcity() {
        return allcity;
    }

    public void setAllcity(List<Citys> allcity) {
        this.allcity = allcity;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
