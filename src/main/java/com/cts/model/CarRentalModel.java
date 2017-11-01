package com.cts.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CarRentalModel {

@Id
    private String cityName;
    private int distacePerKm;

    public CarRentalModel(String cityName, int distacePerKm) {
        this.cityName = cityName;
        this.distacePerKm = distacePerKm;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getDistacePerKm() {
        return distacePerKm;
    }

    public void setDistacePerKm(int distacePerKm) {
        this.distacePerKm = distacePerKm;
    }
}
