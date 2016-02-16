package com.example.entity;

import java.io.Serializable;
import java.util.Date;

public class Crime implements Serializable{
    private long id;
    private double latitude;
    private double longitude;
    private Category category;
    private Date date;

    public Crime(long id) {
        this.id = id;
    }

    public Crime(long id, float latitude, float longitude, Category category, Date date) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.category = category;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
