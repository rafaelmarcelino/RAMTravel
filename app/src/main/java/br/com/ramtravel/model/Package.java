package br.com.ramtravel.model;

import android.media.Image;

import androidx.annotation.NonNull;

import java.math.BigDecimal;

public class Package {

    private String nameOfCity;
    private String imagePlace;
    private int qtyDays;
    private BigDecimal valueOfPackage;

    public Package(String nameOfCity, String imagePlace, int qtyDays, BigDecimal valueOfPackage) {
        this.nameOfCity = nameOfCity;
        this.imagePlace = imagePlace;
        this.qtyDays = qtyDays;
        this.valueOfPackage = valueOfPackage;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public String getImagePlace() {
        return imagePlace;
    }

    public void setImagePlace(String imagePlace) {
        this.imagePlace = imagePlace;
    }

    public int getQtyDays() {
        return qtyDays;
    }

    public void setQtyDays(int qtyDays) {
        this.qtyDays = qtyDays;
    }

    public BigDecimal getValueOfPackage() {
        return valueOfPackage;
    }

    public void setValueOfPackage(BigDecimal valueOfPackage) {
        this.valueOfPackage = valueOfPackage;
    }

    @NonNull
    @Override
    public String toString() {
        return nameOfCity;
    }
}
